/**************************************************************************************************************
"Diferença em relação a ordenação interna"
    - Custo de acesso a memória secundária é muito maior
    - Transferência de dados entre a meória interna e externa
    - Acesso sequencial aos dados (acesso direto é muito caro)

    "MergeSort Externo"
    - Método mais importante de ordenação externa
    - "Intercalação": comina dois ou mais blocos ordenados em um único bloco, maior, ordenado

    "MergeSort Externo: Funcionamento"
    - RAM comporta "N" registros de dados
    - Carregar parte do arquivo na RAM
    - Ordernar os dados na RAM com um algorimo
    "in-place" (ex: quicksort)
    - Salvar os dados ordenados em um arquivo separado
    - Repetir os anteriores até terminar o arquivo original
    - Ao final, temos "K" arquivos ordenados
    - "Multi-way merging"
        - Criar "K + 1" buffers de tamanho "N/(K + 1)"
        ("1" de saída, "K" de entrada)
        - Carregar parte dos arquivos ordenados nos "buffers de entrada", intercalar no "buffer de saída"
        - buffer de entrada "vazio": carregar mais dados
        - buffer de saída "cheio": salvaar dados
***************************************************************************************************************

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>

#define N 100

void criArquivoTeste(char *nome)
{
    int i;
    FILE *f = fopen(nome, "w");
    srand(time(NULL));
    for (i = 1; i < 1000; i++)
        fprintf(f, "%d\n", rand());
    fprintf(f, "%d", rand());
    fclose(f);
}

int main()
{
    criArquivoTeste("dados.txt");
    mergeSortExterno("dados.txt"); //ordenar o arquivo

    system("pause");
    return 0;
}

void mergeSortExterno(char *nome)
{
    char novo[20];
    int numArqs = criArquivosOrdenados(nome);
    int i, K = N / (numArqs + 1); // 100

    remove(nome);
    merge(nome, numArqs, K);

    for (i = 0; i < numArqs; i++)
    {
        fprintf(novo, "Temp%d.txt", i + 1); //apagar os arquivos temporários 
        remove(novo);
    }
}

int criArquivosOrdenados(char *nome)
{
    int V[N], cont = 0, total = 0;
    char novo[20];
    FILE *f = fopen(nome, "r");
    while (!feof(f))
    {
        fscanf(f, "%d", &V[total]);
        total++;
        if (total == N) // buffer cheio: salva em disco
        {
            cont++;
            sprintf(novo, "Temp%d.txt", cont);
            qsort(V, total, sizeof(int), compara); // ordenadar
            salvaArquivo(novo, V, total, 0);       // salva
            total = 0;                             // zera o arquivo
        }
    }
    if (total > 0) // sobraram dados no buffer: salva em disco
    {
        cont++;
        sprintf(novo, "Temp%d.txt", cont); // gera um arquivo temporário
        qsort(V, total, sizeof(int), compara);
        salvaArquivo(novo, V, total, 0);
        total = 0;
    }
    fclose(f);
    return cont;
}

void salvaArquivo(char *nome, int *V, int tam, int mudaLinhaFinal)
{
    int i;
    FILE *f = fopen(nome, "a");
    for (i = 0; i < tam - 1; i++)
        fprintf(f, "%d\n", V[i]);

    // controla a mudança de linha no final do arquivo
    if (mudaLinhaFinal == 0)
        fprintf(f, "%d\n", V[tam - 1]);
    else
        fprintf(f, "%d\n", V[tam - 1]);

    fclose(f);
}
// struct para gerenciar os buffers
struct arquivo
{
    FILE *f;
    int pos, MAX, *buffer;
};

void merge(char *nome, int numArqs, int K)
{
    char novo[20];
    int i;
    int *buffer = (int *)malloc(K * sizeof(int));

    struct arquivo *arq;
    arq = (struct arquivo *)malloc(numArqs * sizeof(struct arquivo));

    for (i = 0; i < numArqs; i++)
    {
        sprintf(novo, "Temp%d.txt", i + 1);
        arq[i].f = fopen(novo, "r");
        arq[i].MAX = 0;
        arq[i].pos = 0;
        arq[i].buffer = (int *)malloc(K * sizeof(int));
        preencheBuffer(&arq[i], K);

        // enquanto houver arquivos para processar
        int menor, qtdBuffer = 0;
        while (procuraMenor(arq, numArqs, K, &menor) == 1)
        {
            buffer[qtdBuffer] = menor;
            qtdBuffer++;
            if (qtdBuffer == K)
            {
                salvaArquivo(nome, buffer, K, 1);
                qtdBuffer = 0;
            }
        }
        // salvar dados ainda no buffer
        if (qtdBuffer != 0)
        {
            salvaArquivo(nome, buffer, qtdBuffer, 1);

            for (i = 0; i < numArqs; i++)
                free(arq[i].buffer);
            free(arq);
            free(buffer);
        }
    }
}

int procuraMenor(struct arquivo *arq, int numArqs, int K, int *menor)
{
    int i, idx = -1;
    for (i = 0; i < numArqs; i++)
    {
        if (arq[i].pos < arq[i].MAX)
        {
            if (idx == -1)
            {
                idx = i;
            }
            else
            {
                if (arq[i].buffer[arq[i].pos] < arq[idx].buffer[arq[idx].pos])
                {
                    idx = i;
                }
            }
        }
        if (idx != -1)
        {
            *menor = arq[idx].buffer[arq[idx].pos];
            arq[idx].pos++;
            if (arq[idx].pos == arq[idx].MAX)
                preencheBuffer(&arq[idx], K);
            return 1;
        }
        else
        {
            return 0;
        }
    }
}

void preecheBuffer(struct arquivo *arq, int K)
{
    int i;
    if (arq->f == NULL)
        return;

    arq->pos = 0;
    arq->MAX = 0;
    for (i = 0; i < K; i++)
    {
        if (!feof(arq->f))
        {
            fscanf(arq->f, "%d", &arq->buffer[arq->MAX]);
            arq->MAX++;
        }
        else
        {
            fclose(arq->f);
            arq->f = NULL;
            break;
        }
    }
}*/
#include <stdio.h>

int main()
{
    char nomeArquivo[100]; // nome do arquivo
    FILE *arquivo;         // ponteiro para o arquivo
    long tamanho;          // tamanho em bytes do arquivo

    printf("Digite o nome do arquivo: ");
    scanf("%s", nomeArquivo);

    arquivo = fopen(nomeArquivo, "r");
    // verifica se o arqivo foi aberto com sucesso
    if (arquivo != NULL)
    { // movimenta a posição corrente de leitura no arquivo para o seu fim
        fseek(arquivo, 0, SEEK_END);
        // pega a posiçao corrente de leitura no arquivo
        tamanho = ftell(arquivo);

        printf("O arquivo %s possui %ld bytes", nomeArquivo);
    }
    else
    {
        printf("Arquivo inexistente");
    }
    return 0;
}

long calcularTamanhoArquivo(FILE *arquivo)
{
    //guarda o estado antes de chamar a função fseek
    long posicaoAtual = ftell(arquivo);

    //guarda o tamanho do arquivo
    long tamanho;

    //calcula o tamnho
    fseek(arquivo, 0, SEEK_END);
    tamanho = ftell(arquivo);

    //recupera o estado antigo do arquivo
    fseek(arquivo, posicaoAtual, SEEK_SET);

    return tamanho;
}
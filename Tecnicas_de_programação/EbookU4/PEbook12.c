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
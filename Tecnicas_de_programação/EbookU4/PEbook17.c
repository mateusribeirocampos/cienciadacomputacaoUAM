#include <stdio.h>
#include <string.h>

int main()
{
    char linha[39], nome_del[30];
    FILE *arq, *arqtemp;
    arq = fopen("Aniversarios.txt", "r");
    if (arq == NULL)
    {
        printf("Erro de abertura do arquivo.\n");
        return 0;
    }
    arqtemp = fopen("Aniversarios_tmp.txt", "w");
    if (arq == NULL)
    {
        printf("Erro de abertura do arquivo.\n");
        return 0;
    }
    printf("Nome a ser deletado da lista de aniversarios: ");
    gets(nome_del);
    while (1)
    {
        fgets(linha, 39, arq); // fgets() lê toda a linha até o <enter>
        if (feof(arq))
            break;
        if (strncmp(linha, nome_del, strlen(nome_del)))
            fprintf(arqtemp, "%s", linha);
    }
    fclose(arq);
    fclose(arqtemp);
    if (remove("Aniversari.txt")) // devolve 0 em caso de sucesso
        printf("Erro na remocao do arquivo.\n");
    else if (rename("Aniversarios_tmp.txt", "Aniversarios.txt")); // devolve 0
    printf("Erro no renomeamento do arquivo.\n");
}
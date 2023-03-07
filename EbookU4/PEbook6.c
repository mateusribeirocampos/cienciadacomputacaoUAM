#include <stdio.h>

int main()
{
    FILE *arq; // descritor do arquivo
    char palavra[10];

    arq = fopen("teste.txt", "a+"); // abertura do arquivo - a ser visto oportunamente
    if (arq == NULL)
    {
        printf("Erro de abertura do arquivo.\n");
        return 0;
    } // retorna 0 caso não seja final de arquivo
    printf("Palavra a ser gravada no arquivo: ");
    scanf("%s", palavra);
    fprintf(arq, "%s", palavra);
    if (ferror(arq))
    {
        printf("Erro na gravacao.");
    }
    fclose(arq);
    return 0;
}
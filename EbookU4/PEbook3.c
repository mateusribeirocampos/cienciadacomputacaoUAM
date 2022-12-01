#include <stdio.h>

int main()
{
    FILE *arq; //descritor do arquivo

    arq = fopen("teste.txt", "r"); //abertura do arquivo - a ser visto oportunamente 
    if(arq == NULL)
    {
        printf("Erro de abertura do arquivo.\n");
        return 0;
    }
    printf("Posicao corrente: %ld.", ftell(arq));
    fclose(arq);

    return 0;
}
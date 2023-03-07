#include <stdio.h>
#include <string.h>

int main()
{
    char nome[30], aniversario[9];
    FILE *arq;
    arq = fopen("Aniversario.txt", "w");
   if (arq == NULL)
    {
        printf("Erro de abertura do arquivo.\n");
        return 0;
    }
    while (1)
    {
        printf("Nome (<digite 'fim' para finalizar>): ");
        gets(nome);
        if(!strcmp(nome, "fim"))
        break;
        else
        {
            printf("Data de aniversario (dd/mm/aa): ");
            gets(aniversario);
            fprintf(arq, "%s - %s\n", nome, aniversario);
        }
    }
    fclose(arq);
    return 0;    
}
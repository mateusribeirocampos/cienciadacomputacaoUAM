#include <stdio.h>
#include <string.h>

int main ()
{
    FILE *arq;
    char linha[40];
    long pos;
    int i;
    arq = fopen("Atividade3.txt", "r+"); 
    if(arq == NULL)
    {
        printf("Erro de abertura do arquivo.\n");
        return 0;
    }
    pos = ftell(arq);
    fgets(linha, 40, arq);
    for(i = 0; i<strlen(linha); i++)
    {
        if(linha[i] == 'i')
        {
            linha[i] = 'y';
            fseek(arq, pos, SEEK_SET);
            fputs(linha, arq);
        }
    }
    fclose(arq);
    return 0;
}
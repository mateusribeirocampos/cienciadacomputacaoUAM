#include <stdio.h>

int main()
{
    FILE *arq; //descritor do arquivo
    char carac;

    arq = fopen("teste.txt", "r"); //abertura do arquivo - a ser visto oportunamente 
    if(arq == NULL)
    {
        printf("Erro de abertura do arquivo.\n");
        return 0;
    }//retorna 0 caso não seja final de arquivo
    while (!feof(arq))
    {//fgetc() lê um caracter do arquivo textual
        carac = fgetc(arq); 

        printf("%c", carac);
    }
    fclose(arq);
    
    return 0;
}
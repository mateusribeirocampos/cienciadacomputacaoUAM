#include <stdio.h>

int main()
{
    FILE *arq; //descritor do arquivo
    int ret; //para o teste do retorno da função fseek()
    
    arq = fopen("Exercicio2.dat", "wb+"); //abertura do arquivo - a ser visto oportunamente 
    if(arq == NULL)
    {
        printf("Erro de abertura do arquivo.\n");
        return 0;
    }
    fclose(arq);
    return 0;
}
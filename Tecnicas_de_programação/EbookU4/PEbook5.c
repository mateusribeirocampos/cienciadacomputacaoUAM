#include <stdio.h>

int main()
{
    FILE *arq; //descritor do arquivo
    char carac, str[15];
    int valor;

    arq = fopen("teste.txt", "r"); //abertura do arquivo - a ser visto oportunamente 
    if(arq == NULL)
    {
        printf("Erro de abertura do arquivo.\n");
        return 0;
    }//retorna 0 caso não seja final de arquivo
    
    carac = fgetc(arq);//coleta um caracter do arquivo
    fscanf(arq, "%d %s", &valor, str); //coleta um inteiro e uma string do arquivo
    printf("Valores lidos: %c %d %s. \n", carac, valor, str);

    fclose(arq);
    
    return 0;
}
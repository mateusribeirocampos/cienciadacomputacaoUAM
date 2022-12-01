#include <stdio.h>

int main()
{
    FILE *arq; // descritor do arquivo
    char carac = 'a', str[20] = "Apenas um teste";
    int valor = 54778;

    arq = fopen("exemplo1.txt", "w"); // abertura do arquivo - a ser visto oportunamente
    if (arq == NULL)
    {
        printf("Erro de abertura do arquivo.\n");
        return 0;
    } // retorna 0 caso não seja final de arquivo
    fprintf(arq, "%c  %d  %s\n", carac, valor, str);

    fclose(arq);
    return 0;
}
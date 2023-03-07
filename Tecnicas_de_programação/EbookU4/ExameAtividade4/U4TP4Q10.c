#include <stdio.h>

int main()
{
    FILE *arq;
    char buffer[35] = "Algo a ser escrito no arquivo,\n";
    arq = fopen("Atividade10.txt", "   ");
    if(arq == NULL)
    {
        printf("Erro na abertura do arquivo");
        return 0;
    }

}
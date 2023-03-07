#include <stdio.h>

//rb lê o que foi armazenado no arquivo binário

int main()
{
    FILE *arq;
    int qtd = 4, value_int, i; 
    float value_float;
    arq = fopen("Atividade4.dat", "rb+");
    if (arq == NULL)
    {
        printf("Erro de abertura do arquivo.\n");
        return 0;
    }
    fread(&qtd, sizeof(int), 1, arq);
    for (i = 0; i < qtd; i++)
    {

        fread(&value_int, sizeof(int), 1, arq);
        fread(&value_float, sizeof(float), 1, arq);
        printf("Record [%d] = int = %d \tfloat = %.2f\n", i, value_int, value_float);
    }
    fclose(arq);
    return 0;
}
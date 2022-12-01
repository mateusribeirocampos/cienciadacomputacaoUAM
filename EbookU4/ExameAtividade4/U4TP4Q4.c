#include <stdio.h>

// wb vai escrever o que foi determinado ou pedido no arquivo em binário no U4TP4Q5 tem o codigo para ler

void GravaArq(FILE *arq, int valor_int, float valor_float)
{
    fwrite(&valor_int, sizeof(int), 1, arq);
    fwrite(&valor_float, sizeof(float), 1, arq);
}

int main()
{
    FILE *arq;
    int qtd = 4, valor_int, i; 
    float valor_float;
    arq = fopen("Atividade4.dat", "wb");
    if (arq == NULL)
    {
        printf("Erro de abertura do arquivo (1).\n");
        return 0;
    }
    fwrite(&qtd, sizeof(int), 1, arq);
    GravaArq(arq, 0, 2.1);
    GravaArq(arq, 10, 45.21);
    GravaArq(arq, 20, 345.87);
    GravaArq(arq, 25, 4178.30);
    fclose(arq);
    return 0;
}
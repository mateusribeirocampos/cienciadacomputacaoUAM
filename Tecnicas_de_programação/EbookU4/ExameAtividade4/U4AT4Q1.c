#include <stdio.h>

int main()
{
    FILE *arq;
    int valor_int;
    float valor_float;
    arq = fopen("Exercicio.dat", "rb+");
    if (arq == NULL)
    {
        printf("Error opening file.\n");
        return 0;
    }
    fseek(arq,(sizeof(int)+sizeof(float))*2, SEEK_SET);
    fread(&valor_int, sizeof(int), 1, arq);
    fread(&valor_float, sizeof(float), 1, arq);
    printf("Terceiro registro: int = %d float = %.4f\n", valor_int, valor_float);
    fclose(arq);
    return 0;
}
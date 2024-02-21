#include <stdio.h>
#define TAM 3

int vetor1[TAM];

int DigitaValores()
{
    for (int i = 0; i < TAM; i++)
    {
        printf("\nDigite o valor para o vetor1[%d]: ", i);
        scanf("%d", &vetor1[i]);
    }
}

void imprimirVetor()
{
    for(int j = 0; j < TAM; j++)
    {
        printf("Vetor1 [%d] = %d\n", j, vetor1[j]);
    }
}

int main()
{
    DigitaValores();
    imprimirVetor();

    getchar();
    return 0;
}

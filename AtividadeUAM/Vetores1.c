#include <stdio.h>
#include <stdlib.h>
#define TAM 3

int main()
{
    int vetor[TAM], cont;
    int vetor1[] = {1,2,3};
    int vetor2[3];

    for(int k = 0; k < 3; k++)
    {
    printf("Digite os valores do novo vetor2[%d]: ", k);
    scanf("%d", &vetor2[k]);
    vetor2[k]++;

    }
    for(int j = 0; j < 3; j++)
    {
        printf("Vetores digitados para o vetor2[%d] = %d\n", j, vetor2[j]);
    }


    for(int i = 0; i < 3; i++)
    {
        printf("Vetor1[%d] = %d\n", i, vetor1[i]);
    }

    vetor[0] = 5;
    vetor[1] = 10;
    vetor[2] = 15;

    // adicionando 1 para cada posição
    for (cont = 0; cont < TAM; cont++)
    {
        vetor[cont] = vetor[cont] + 1;
        vetor[cont] += 1;
    }

    printf("\nPosicao 0: %d", vetor[0]);
    printf("\nPosicao 1: %d", vetor[1]);
    printf("\nPosicao 2: %d\n", vetor[2]);

    // imprimindo vetor no laço de repetição
    for (cont = 0; cont < TAM; cont++)
    {
        printf("\nPosicao %d: %d", cont, vetor[cont]);
    }

    for (cont = 0; cont < TAM; cont++)
    {
        printf("\nDigite tres valores para o vetor[cont] = ");
        scanf("%d", &vetor[cont]);
    }

    for (cont = 0; cont < TAM; cont++)
    {
        printf("\nPosicao %d: %d", cont, vetor[cont]);
    }

    return 0;
}
/*Crie um algortmo que leia 3 valores para um vetor de três posições
e depois calcule a média dos valores acessando o vetor.*/

#include <stdio.h>
#define TAM 3

int vetor[TAM], i, j, k, soma;
float media;

int DigitaValores()
{
    for (int i = 0; i < TAM; i++)
    {
        printf("Digite o valor do vetor[%d]: ", i);
        scanf("%d", &vetor[i]);
    }
    return 0;
}

void ImprimeValoreVetor()
{
    for (int j = 0; j < TAM; j++)
    {
        printf("\nOs valores do vetor[%d] = %d", j, vetor[j]);
    }
}

int MediaValoresVetor()
{
    for(k= 0; k < TAM; k++)
    {
        media = media + vetor[k];
        printf("\nValores do vetor: %d", vetor[k]);
    }
    media = media / TAM;
    printf("\nO valor da media: %.2f", media);

    return 0;
}

int main()
{
    DigitaValores();
    ImprimeValoreVetor();
    MediaValoresVetor();
    getchar();
    return 0;
}
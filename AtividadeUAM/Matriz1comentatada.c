#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num_linhas, num_colunas, linhas, colunas;
    int **matriz;  // Declaramos uma variável do tipo ponteiro para ponteiro inteiro

    printf("Entre com o numero de linhas da matriz: ");
    scanf("%d", &num_linhas);
    printf("Entre com o numero de colunas da matriz: ");
    scanf("%d", &num_colunas);

    matriz = malloc(num_linhas * sizeof(int *));  // Alocamos memória para armazenar o número de linhas da matriz
                                                  // Aqui, estamos alocando memória para armazenar o número de ponteiros inteiros
                                                  // que serão usados para armazenar as colunas da matriz.
    for (int i = 0; i < num_linhas; i++)
    {
        matriz[i] = malloc(num_colunas * sizeof(int));  // Alocamos memória para cada linha para armazenar o número de colunas da matriz
                                                        // Aqui, estamos alocando memória para cada linha para armazenar o número de inteiros
                                                        // que representam as colunas da matriz.
    }

    for (linhas = 0; linhas < num_linhas; linhas++)
    {
        for (colunas = 0; colunas < num_colunas; colunas++)
        {
            printf("Digite linha %d e coluna %d: ", linhas + 1, colunas + 1);
            scanf("%d", &matriz[linhas][colunas]);  // Lê os valores para a matriz
        }
    }

    // imprimir
    for (linhas = 0; linhas < num_linhas; linhas++)
    {
        for (colunas = 0; colunas < num_colunas; colunas++)
        {
            printf(" %d ", matriz[linhas][colunas]);  // Imprime os valores da matriz
        }
        printf("\n");
    }

    // Use a matriz dinamicamente alocada aqui

    for (int i = 0; i < linhas; i++)
    {
        free(matriz[i]);  // Libera a memória alocada para cada linha da matriz
    }
    free(matriz);  // Libera a memória alocada para o número de linhas da matriz

    return 0;
}

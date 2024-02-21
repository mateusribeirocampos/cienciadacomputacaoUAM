#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num_linhas, num_colunas, linhas, colunas;
    int **matriz, **matrizAux;

    printf("Entre com o numero de linhas da matriz: ");
    scanf("%d", &num_linhas);
    printf("Entre com o numero de colunas da matriz: ");
    scanf("%d", &num_colunas);

    // Aloca memória para a matriz original
    matriz = (int **)malloc(num_linhas * sizeof(int *));
    for (int i = 0; i < num_linhas; i++)
    {
        matriz[i] = (int *)malloc(num_colunas * sizeof(int));
    }

    // Pede ao usuário para digitar os valores da matriz
    for (linhas = 0; linhas < num_linhas; linhas++)
    {
        for (colunas = 0; colunas < num_colunas; colunas++)
        {
            printf("Digite linha %d e coluna %d: ", linhas + 1, colunas + 1);
            scanf("%d", &matriz[linhas][colunas]);
        }
    }

    // Imprime a matriz original
    printf("Matriz original:\n");
    for (linhas = 0; linhas < num_linhas; linhas++)
    {
        for (colunas = 0; colunas < num_colunas; colunas++)
        {
            printf(" %d ", matriz[linhas][colunas]);
        }
        printf("\n");
    }

    // Aloca memória para a matriz inversa
    matrizAux = malloc(num_linhas * sizeof(int *));
    for (int i = 0; i < num_linhas; i++)
    {
        matrizAux[i] = malloc(num_colunas * sizeof(int));
    }

    // Copia os valores da matriz original para a matriz inversa, na ordem inversa
    for (linhas = 0; linhas < num_linhas; linhas++)
    {
        for (colunas = 0; colunas < num_colunas; colunas++)
        {
            matrizAux[num_linhas - 1 - linhas][num_colunas - 1 - colunas] = matriz[linhas][colunas];
        }
    }

    for (linhas = 0; linhas < num_linhas; linhas++)
    {
        for (colunas = 0; colunas < num_colunas; colunas++)
        {
            printf("Valor original na linha %d e coluna %d: %d\n", linhas + 1, colunas + 1, matriz[linhas][colunas]);
            matrizAux[num_linhas - 1 - linhas][num_colunas - 1 - colunas] = matriz[linhas][colunas];
            printf("Valor invertido na linha %d e coluna %d: %d\n", num_linhas - linhas, num_colunas - colunas, matrizAux[num_linhas - 1 - linhas][num_colunas - 1 - colunas]);
        }
    }

    // Imprime a matriz inversa
    printf("Matriz inversa:\n");
    for (linhas = 0; linhas < num_linhas; linhas++)
    {
        for (colunas = 0; colunas < num_colunas; colunas++)
        {
            printf(" %d ", matrizAux[linhas][colunas]);
        }
        printf("\n");
    }

    // Libera a memória alocada para as matrizes
    for (int i = 0; i < num_linhas; i++)
    {
        free(matriz[i]);
        free(matrizAux[i]);
    }
    free(matriz);
    free(matrizAux);

    return 0;
}

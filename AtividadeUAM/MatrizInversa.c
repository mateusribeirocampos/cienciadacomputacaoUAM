#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num_linhas, num_colunas, linhas, colunas;
    int **matriz, matrizAux;

    printf("Entre com o numero de linhas da matriz: ");
    scanf("%d", &num_linhas);
    printf("Entre com o numero de colunas da matriz: ");
    scanf("%d", &num_colunas);

    matriz = malloc(num_linhas * sizeof(int *));
    for (int i = 0; i < num_linhas; i++)
    {
        matriz[i] = malloc(num_colunas * sizeof(int));
    }

    for (linhas = 0; linhas < num_linhas; linhas++)
    {
        for (colunas = 0; colunas < num_colunas; colunas++)
        {
            printf("Digite linha %d e coluna %d: ", linhas + 1, colunas + 1);
            scanf("%d", &matriz[linhas][colunas]);
        }
    }

    for (linhas = 0; linhas < num_linhas; linhas++)
    {
        for (colunas = 0; colunas < num_colunas; colunas++)
        {
            printf(" %d ", matriz[linhas][colunas]);
        }
        printf("\n");
    }

    printf("Matriz inversa\n");


    for (int i = 0; i < linhas; i++)
    {
        free(matriz[i]);
    }
    free(matriz);

    return 0;
}
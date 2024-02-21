#include <stdio.h>
#include <stdlib.h>

int main()
{
    int matrix[3][3], i, j, z, t;
    /*matrix[0][0] = 1;
    matrix[0][1] = 2;
    matrix[0][2] = 3;
    matrix[1][0] = 4;
    matrix[1][1] = 5;
    matrix[1][2] = 6;
    matrix[2][0] = 7;
    matrix[2][1] = 8;
    matrix[2][2] = 9;

    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            printf(" %d ", matrix[i][j]);
        }
        printf("\n");
    }
    */
   int linhas, colunas;
   
    printf("\nDigite o numero de colunas: ");
    scanf("%d", &linhas);
    printf("\nDigiete o numero de linhas: ");
    scanf("%d", &colunas);

    printf("Outro jeito de chamar a função da matriz");
    for (z = 1; z < matrix[linhas]; z++)
    {
        for (t = 1; t < matrix[colunas]; t++)
        {
            printf(" %d ", matrix[linhas][colunas]);
        }
        printf("\n");
    }

    return 0;
}
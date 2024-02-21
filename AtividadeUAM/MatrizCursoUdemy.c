#include <stdio.h>
#include <stdlib.h>

int main()
{
    int Matriz[2][2], aux1, aux2, linha, coluna;

    for (linha = 0; linha < 2; linha++)
    {
        for (coluna = 0; coluna < 2; coluna++)
        {
            printf("Informe o valor da linha [%d] coluna[%d]: ", linha, coluna);
            scanf("%d", &Matriz[linha][coluna]);
        }
    }
    /*printf("Informe o valor da linha [0][0]");
    scanf("%d", &Matriz[0][0]);
    printf("Informe o valor da linha [0][1]: ");
    scanf("%d", &Matriz[0][1]);
    printf("Informe o valor da linha [1][0]: ");
    scanf("%d", &Matriz[1][0]);
    printf("Informe o valor da linha [1][1]: ");
    scanf("%d", &Matriz[1][1]);*/

    printf("\nValores da matriz informada");
    printf("\n %d  %d ", Matriz[0][0], Matriz[1][0]);
    printf("\n %d  %d ", Matriz[0][1], Matriz[1][1]);
    printf("\n");

    aux1 = Matriz[0][0];
    aux2 = Matriz[0][1];

    Matriz[0][0] = Matriz[1][0];
    Matriz[0][1] = Matriz[1][1];
    Matriz[1][0] = aux1;
    Matriz[1][1] = aux2;

    printf("A matriz em ordem das colunas invertidas informada\n");
    for (linha = 1; linha >= 0; linha--)
    {
        for (coluna = 1; coluna >= 0; coluna--)
        {

            printf(" %d ", Matriz[linha][coluna]);
        }
        printf("\n");
    }

    printf("A matriz em ordens das linhas invertidas informada\n");
    for (linha = 0; linha < 2; linha++)
    {
        for (coluna = 0; coluna < 2; coluna++)
        {

            printf(" %d ", Matriz[linha][coluna]);
        }
        printf("\n");
    }

    /*printf("\nOs valores da matriz na ordem inversa");
    printf("\n %d  %d ", Matriz[0][0], Matriz[1][0]);
    printf("\n %d  %d ", Matriz[0][1], Matriz[1][1]);*/

    return 0;
}
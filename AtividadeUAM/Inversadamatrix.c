#include <stdio.h>

#define N 3 // tamanho da matriz

// função para imprimir a matriz
void print_matrix(float mat[N][N])
{
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            printf("%.2f ", mat[i][j]);
        }
        printf("\n");
    }
}

// função para calcular a matriz inversa
void invert_matrix(float mat[N][N], float inv[N][N])
{
    // calcular a matriz adjunta
    float adj[N][N];
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            // calcular o cofator
            float cofactor = ((i+j)%2 == 0 ? 1 : -1) * mat[(j+1)%N][(i+1)%N] * mat[(j+2)%N][(i+2)%N] - mat[(j+1)%N][(i+2)%N] * mat[(j+2)%N][(i+1)%N];
            adj[i][j] = cofactor;
        }
    }

    // calcular o determinante
    float det = 0;
    for (int i = 0; i < N; i++)
    {
        det += mat[0][i] * adj[0][i];
    }

    // calcular a matriz inversa
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            inv[i][j] = adj[i][j] / det;
        }
    }
}

int main()
{
    float mat[N][N] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    float inv[N][N];

    printf("Matriz original:\n");
    print_matrix(mat);

    invert_matrix(mat, inv);

    printf("Matriz inversa:\n");
    print_matrix(inv);

    return 0;
}

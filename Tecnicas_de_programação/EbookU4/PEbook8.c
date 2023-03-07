#include <stdio.h>
#include <string.h>

typedef struct
{
    char cpf[12];
    int idade;
} TPessoa;

int IncluirRegistro(char cpf[12], int idade, FILE *arq)
{
    TPessoa pessoa;
    strcpy(pessoa.cpf, cpf);
    pessoa.idade = idade;
    if (!fwrite(&pessoa, sizeof(TPessoa), 1, arq))
    {
        return -1;
    }
    return 0;
}

int main()
{
    FILE *arq;
    TPessoa pessoa;
    arq = fopen("Registros.dat", "w+");
    if (arq == NULL)
    {
        printf("Erro de abertura do arquivo.\n");
        return 0;
    }
    if (IncluirRegistro("12345678901", 30, arq) == -1)
    {
        printf("Erro de gravacao do registro.");
        return 0;
    }
    if (IncluirRegistro("45612378902", 40, arq) == -1)
    {
        printf("Erro de gravacao do registro.");
        return 0;
    }
    if (IncluirRegistro("21975451830", 42, arq) == -1)
    {
        printf("Erro de gravacao do registro.");
        return 0;
    }
    if (IncluirRegistro("31276441874", 39, arq) == -1)
    {
        printf("Erro de gravacao do registro.");
        return 0;
    }

    fclose(arq);
    return 0;
}
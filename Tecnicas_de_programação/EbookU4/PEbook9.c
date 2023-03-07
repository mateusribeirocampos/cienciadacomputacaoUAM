#include <stdio.h>
#include <string.h>

typedef struct
{
    char cpf[12];
    int idade;
} TPessoa;

long LocalizaRegistro(char cpf[12], TPessoa *pessoa, FILE *arq)
{
    long pos;
    rewind(arq);
    while (1)
    {
        pos = ftell(arq);
        fread(pessoa, sizeof(TPessoa), 1, arq);
        if(feof(arq))
        break;
        if(!strcmp(pessoa->cpf, cpf))
        return pos;
    }
    return -1;
}

int main()
{
    FILE *arq;
    TPessoa pessoa;
    long pos;
    char cpf[12];
    arq = fopen("Registros.dat", "r");
    if (arq == NULL)
    {
        printf("Erro de abertura do arquivo.\n");
        return 0;
    }
    printf("CPF a ser localizado: ");
    scanf("%s", cpf);
    pos = LocalizaRegistro(cpf, &pessoa, arq);
    if(pos == -1)
    printf("Registro nao encontrado.\n");
    else
    printf("Encontrado posicao = %ld\tCPF = %s\tidade = %d", pos, pessoa.cpf, pessoa.idade);

    fclose(arq);
    return 0;
}
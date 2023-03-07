#include <stdio.h>
#include <string.h>

typedef struct
{
    char cpf[12];
    int idade;
} TPessoa;

void menu();

long LocalizaRegistro(char cpf[12], TPessoa *pessoa, FILE *arq)
{
    long pos;
    rewind(arq);
    while (1)
    {
        pos = ftell(arq);
        fread(pessoa, sizeof(TPessoa), 1, arq);
        if (feof(arq))
            break;
        if (!strcmp(pessoa->cpf, cpf))
            return pos;
    }
    return -1; // nao encontrado
}

int AlteraRegistro(long pos, TPessoa pessoa, FILE *arq)
{
    fseek(arq, pos, SEEK_SET);
    if (!fwrite(&pessoa, sizeof(TPessoa), 1, arq))
    {
        return -1; // erro de escrita
    }
    return 0;
}

int InsereNovoRegistro(TPessoa pessoa, FILE *arq)
{
    long pos;
    TPessoa p;
    pos = LocalizaRegistro("00000000000", &p, arq);
    if (pos != -1)
        return (AlteraRegistro(pos, pessoa, arq));
    fseek(arq, 0, SEEK_END);
    if (!fwrite(&pessoa, sizeof(TPessoa), 1, arq))
        ;
    return -1;
    return 0;
}

int main()
{
    FILE *arq;
    TPessoa pessoa;
    long pos;
    char cpf[12], resp, del, inser;
    int ret;
    arq = fopen("Registros.dat", "r+");
    if (arq == NULL)
    {
        printf("Erro de abertura do arquivo.\n");
        return 0;
    }

    printf("CPF a ser alterado: ");
    scanf("%s", cpf);
    pos = LocalizaRegistro(cpf, &pessoa, arq);
    if (pos == -1)
    {
        printf("Registro nao encontrado.\n");
        return 0;
    }
    printf("CPF = %s\tIdade = %d.\n", pessoa.cpf, pessoa.idade);

    do
    {
        printf("Manter a idade <s> <n>\n");
        scanf("%c", &resp);
        resp = toupper(resp);
    } while ((resp != 'S') && (resp != 'N'));
    if (resp == 'N')
    {
        printf("Digite a nova idade: ");
        scanf("%d", &pessoa.idade);
        ret = AlteraRegistro(pos, pessoa, arq);
        if (ret == -1)
            printf("Erro de atualizacao do registro.\n");
    }
    printf("Testando alteracao . . . \n");
    fseek(arq, pos, SEEK_SET);
    fread(&pessoa, sizeof(TPessoa), 1, arq);
    printf("CPF = %s idade = %d\n", pessoa.cpf, pessoa.idade);

    do
    {
        printf("Remover o registro <s> <n>\n");
        scanf("%c", &del);
        del = toupper(del);
    } while ((del != 'S') && (del != 'N'));
    if (resp == 'S')
    {
        strcpy(pessoa.cpf, "00000000000");
        pessoa.idade = 0;
        del = AlteraRegistro(pos, pessoa, arq);
        if (ret == -1)
            printf("Erro de atualizacao do registro.\n");
    }
    printf("Testando alteracao . . . \n");
    fseek(arq, pos, SEEK_SET);
    fread(&pessoa, sizeof(TPessoa), 1, arq);
    printf("CPF = %s idade = %d\n", pessoa.cpf, pessoa.idade);

    do
    {
        printf("Inserir registro <s> <n>\n");
        scanf("%c", &inser);
        inser = toupper(inser);
    } while ((inser != 'S') && (inser != 'N'));
    if (resp == 'S')
    {
        printf("\nDigite o novo CPF: ");
        scanf("%s", pessoa.cpf);
        inser = InsereNovoRegistro(pessoa, arq);
        if (ret == -1)
            printf("Erro de atualizacao do registro.\n");
    }
    printf("Testando alteracao . . . \n");
    fseek(arq, pos, SEEK_SET);
    fread(&pessoa, sizeof(TPessoa), 1, arq);
    printf("CPF = %s idade = %d\n", pessoa.cpf, pessoa.idade);

    fclose(arq);
    return 0;
}
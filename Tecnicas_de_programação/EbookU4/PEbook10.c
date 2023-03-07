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
int main()
{
    FILE *arq;
    TPessoa pessoa;
    long pos;
    char cpf[12], resp;
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
        printf("Manter a idade <s><n>");
        scanf("%c", &resp);
        resp = toupper(resp);
    } while ((resp != 'S') && (resp != 'N'));
    if(resp == 'N')
    {
        printf("Digite a nova idade: ");
        scanf("%d", &pessoa.idade);
        ret = AlteraRegistro(pos,pessoa, arq);
        if(ret == -1)
        printf("Erro de atualizacao do registro.\n");
    }
    printf("Testando alteracao . . . \n");
    fseek(arq, pos, SEEK_SET);
    fread(&pessoa, sizeof(TPessoa), 1, arq);
    printf("CPF = %s idade = %d\n", pessoa.cpf, pessoa.idade);
    
    fclose(arq);
    return 0;
}
#include <stdio.h>

int main()
{
    FILE *arq; //descritor do arquivo
    long pos=1; //posição requerida para o posicionamento
    int ret; //para o teste do retorno da função fseek()
    
    arq = fopen("teste.txt", "a"); //abertura do arquivo - a ser visto oportunamente 
    if(arq == NULL)
    {
        printf("Erro de abertura do arquivo.\n");
        return 0;
    }
    ret = fseek(arq, pos, SEEK_SET); //retorna 0 em caso de sucesso de posicionamento
    if(ret != 0)
    {
        printf("Erro de posicionamento.\n");
        fclose(arq);
    }
    return 0;
}
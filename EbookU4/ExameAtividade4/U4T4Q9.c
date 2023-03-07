#include <stdio.h>

int main()
{
    FILE *arq;
    char carac;
    arq = fopen("Texto.txt", "rb");
    if(arq == NULL)
    {
        printf("Erro na abertura do arquivo");
        return 0;
    }
    while (1)
    {
        carac = getc(arq);
        if(carac == EOF)
        break;
        switch (carac)
        {
        case '$':
            carac = ' ';
            break;
        case '%':
            carac = '\n';
            break;
        }
        printf("%c", carac);
    }
    fclose(arq);
    return 0;
}
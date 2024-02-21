#include <stdio.h>
#include <string.h>

int main ()
{
    char palavra[10];

    printf("\nDigite uma palavra: ");

    setbuf(stdin, 0);

    fgets(palavra, 255, stdin);

    //[u][h][u][][][][][][][\0]

    palavra[strlen(palavra)-1] = '\0';

    printf("%s \n", palavra);

    system("pause");

    return 0;
}
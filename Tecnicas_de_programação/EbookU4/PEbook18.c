#include <stdio.h>

int SalveDada(int vi, float vf, FILE *pfile)
{
    if (!fwrite(&vi, sizeof(int), 1, pfile))
    return -1;
    if (!fwrite(&vf, sizeof(float), 1, pfile))
    return -1;
    return 0;
}

int main()
{
    FILE *pfile;
    int qtd = 3, value_int, i; 
    float value_float;
    pfile = fopen("BinaryExemple.dat", "wb+");
    if (pfile == NULL)
    {
        printf("Error opening file.\n");
        return 0;
    }

    fwrite(&qtd, sizeof(int), 1, pfile); 
    SalveDada(23, 45.90, pfile); //I should obtain these two data in the file
    SalveDada(125, 588.98, pfile); //However, I took only the int number from first SaveData()
    SalveDada(1254, 4563.3214, pfile);
    rewind(pfile);
    fread(&qtd, sizeof(int), 1, pfile);
    for (i = 0; i < qtd; i++)
    {

        fread(&value_int, sizeof(int), 1, pfile);
        fread(&value_float, sizeof(float), 1, pfile);
        printf("Record [%d] = int = %d float = %.2f\n", i, value_int, value_float);

    }
    fclose(pfile);
    return 0;
}
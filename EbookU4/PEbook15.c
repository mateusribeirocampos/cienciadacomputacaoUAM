/*
 * Sintese
 *    Objetivo : Manipular arquivos CSV em C
 *    Entrada : Um arquivo CSV
 *    Saida : Um arquivo CSV
 *    Autor : Fagner Candido - f_Candido - fagner7777777@gmail.com
 * */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX_LENGHT 100
#define MAX_STRING 3*MAX_LENGHT
#define MAX_LINE 100

// Tipo correspondente ao CSV
typedef struct fileCSV{
      char fNome[MAX_LENGHT];
      char mNome[MAX_LENGHT];
      char lNome[MAX_LENGHT];
}fileCSV;

// Open no Arquivo - Leitura
void fileOpenRead(FILE **pArquivo){
   if (!(*pArquivo=fopen("teste","r"))){
      printf("Erro ao Abrir Arquivo!!\n");
   }
}

// Open no Arquivo - Escrita
void fileOpenWrite(FILE **pArquivo){
   if (!(*pArquivo=fopen("teste","a+"))){
      printf("Erro ao Abrir Arquivo!!\n");
   }
}

// Write no Arquivo
void writeFile(FILE **pArquivo, char *dados){
       fprintf(*pArquivo, "%s" ,  dados);
}

// Read no Arquivo
int readFile(FILE **pArquivo, char stringOutput[MAX_LINE][MAX_STRING]){
   int contador = 0;
   while (!feof(*pArquivo))
    {
      fscanf(*pArquivo,"%s", stringOutput[contador]);
      contador++;
    } 
    return contador;
}

// Close no Arquivo
void closeFile(FILE **pArquivo){
   fclose(*pArquivo);
}

// Read Entradas
void readInputs(fileCSV *registro){
   printf("Informe o primeiro Nome\n");
   fgets(registro->fNome, MAX_LENGHT, stdin);
   printf("Informe o segundo Nome\n");
   fgets(registro->mNome, MAX_LENGHT, stdin);
   printf("Informe o ultimo Nome\n");
   fgets(registro->lNome, MAX_LENGHT, stdin);
}

//Mount arquivo CSV
void mountInput(char *stringInput, fileCSV registro){
   int len;
   strcat(stringInput, registro.fNome);
   len = strlen(stringInput);
   stringInput[len-1] = ',';
   stringInput[len] = '{FONTE}';
   strcat(stringInput, registro.mNome);
   len = strlen(stringInput);
   stringInput[len-1] = ',';
   stringInput[len] = '{FONTE}';
   strcat(stringInput, registro.lNome);
}

int main(int argc, char **argv){
      fileCSV registro;
      int contador = 0, auxiliar;
      char stringInput[MAX_STRING];
      char stringOutput[MAX_LINE][MAX_STRING];
      FILE *pArquivo;
      
      readInputs(&registro);
      mountInput(stringInput, registro);
      fileOpenWrite(&pArquivo);
      writeFile(&pArquivo, stringInput);
      closeFile(&pArquivo);
      fileOpenRead(&pArquivo);
      auxiliar = readFile(&pArquivo, stringOutput);
      for(;contador <= auxiliar;contador++){
         printf("Registros : %s\n", stringOutput[contador]);
      }
      closeFile(&pArquivo);
      return 0;
}
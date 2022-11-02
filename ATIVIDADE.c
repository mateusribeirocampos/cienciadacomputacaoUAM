/* Armazene informações relacionadas à veículos, totalizando, no máximo, 10 veículos.
Para cada veículo, deverão ser fornecidos os seguintes dados: 
- Marca do veículo 
- modelo do veículo
- Ano de fabricação 
- Placa (formato XXX-YYYY; onde X denota as letras e Y denota os números da placa).

O sistema deverá oferecer, ao usuário, as seguintes funcionalidades: 
- Listar os veículos cadastrados; 
- Inserir um novo veículo; - Listar os veículos filtrando-se por ano de fabricação; 
- Listar os veículos com o ano de fabricação acima de um certo valor especificado pelo usuário. 
- Listar os veículos filtrando-se pelo modelo. 
O sistema deverá armazenar os veículos ordenados pelo ano de fabricação, ou seja, ao inserir um novo veículo, 
este deve ser inserido em ordem crescente de ano de fabricação.*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct
{
    int modeloCad, AnoFabCad;
    char marcaCad[100], placaCad[100];

}Veiculo;

Veiculo Carros;

void menu();
void inicializar();
void imprimir();
void cadastrar();

int main()
{
    int modelo[10] = {2011, 2012, 2012, 2014, 2015, 2016, 2017, 2018, 2021, 2022};
    int AnoFab[10] = {2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2020, 2021};
    char marca[10] = {"Mercedes", "Hyundi", "Ferrari", "Wolksvagen", "Chevrolet", "KIA", "Masserati", "BMW", "Audi", "Jeep"};
    char placa[10] = {"AAA-0000", "BBB-1111", "CCC-2222", "DDD-3333", "EEE-4444", "FFF-5555", "GGG-6666", "HHH-7777", "III-8888", "JJJ-9999"};
    for (int i = 0; i < 10; i++)
    {
        printf("\nMarca do carro: %c\nModelo do Carro: %d\nAno de fabricacao: %d\nPlaca: %c\n", marca[i], modelo[i], AnoFab[i], placa[i]);
    }
    menu();
    return 0;
}

void menu()
{
    int opcao;
    do
    {
        printf("\n Opcoes: ");
        printf("\n 1. Inicializr a Estrutura");
        printf("\n 2. Imprimir a Estrutura");
        printf("\n 3. Cadastrar Carro");
        printf("\n 4. Para sair. \n");
        scanf("%d%*c", &opcao);
        switch (opcao)
        {
        case 1:
            inicializar();
            break;
        case 2:
            imprimir();
        case 3:
            cadastrar();
        break;
        default:
        printf("\n Opcao nao existente. ");
        break;
        }
    } while (opcao!=4);
}

void inicializar()
{
    strcpy(Carros.marcaCad, "NULL");
    Carros.modeloCad = 0;
    Carros.AnoFabCad = 0;
    strcpy(Carros.placaCad, "NULL");
    
}

void cadastrar()
{
    printf("Digite a Marca do Carro: ");
    scanf("%s", &Carros.marcaCad);
    printf("Digite o Modelo do Carro: ");
    scanf("%d", &Carros.modeloCad);
    printf("Digite o Ano de fabricacao do Carro: ");
    scanf("%d", &Carros.AnoFabCad);
    printf("Digite a placa do Carro: ");
    scanf("%s", &Carros.placaCad);
}

void imprimir()
{
    printf("\nA Marca do Carro: ");
    printf("\nO Modelo do Carro: ");
    printf("\nO Ano de Fabricacao do Carro: ");
    printf("\nA placa do Carro: ");
    printf("\n\n");
}
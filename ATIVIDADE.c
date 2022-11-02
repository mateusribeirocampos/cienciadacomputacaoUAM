/* Armazene informações relacionadas à veículos, totalizando, no máximo, 10 veículos.
Para cada veículo, deverão ser fornecidos os seguintes dados: 
- Marca do veículo - modelo 
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
    char Marca[100];
    int Modelo;
    int AnoFab;
    char Placa[8];

}Veiculo;

Veiculo Carros;

void menu();
void inicializar();
void imprimir();
void cadastrar();

int main()
{
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
    strcpy(Carros.Marca, "NULL");
    Carros.Modelo = 0;
    Carros.AnoFab = 0;
    strcpy(Carros.Placa, "NULL");
    
}

void cadastrar()
{
    printf("Digite a Marca do Carro: ");
    scanf("%s", &Carros.Marca);
    printf("Digite o Modelo do Carro: ");
    scanf("%d", &Carros.Modelo);
    printf("Digite o Ano de fabricacao do Carro: ");
    scanf("%d", &Carros.AnoFab);
    printf("Digite a placa do Carro: ");
    scanf("%s", &Carros.Placa);
}

void imprimir()
{
    printf("\nA Marca do Carro: ");
    printf("\nO Modelo do Carro: ");
    printf("\nO Ano de Fabricacao do Carro: ");
    printf("\nA placa do Carro: ");
    printf("\n\n");
}
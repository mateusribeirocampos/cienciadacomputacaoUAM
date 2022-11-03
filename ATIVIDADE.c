/*Armazene informações relacionadas à veículos, totalizando, no máximo, 10 veículos.
Para cada veículo, deverão ser fornecidos os seguintes dados:
- Marca do veículo
- modelo do veículo
- Ano de fabricação
- Placa (formato XXX-YYYY; onde X denota as letras e Y denota os números da placa).

O sistema deverá oferecer, ao usuário, as seguintes funcionalidades:
- Listar os veículos cadastrados;
- Inserir um novo veículo;
- Listar os veículos filtrando-se por ano de fabricação;
- Listar os veículos com o ano de fabricação acima de um certo valor especificado pelo usuário.
- Listar os veículos filtrando-se pelo modelo.
O sistema deverá armazenar os veículos ordenados pelo ano de fabricação, ou seja, ao inserir um novo veículo,
este deve ser inserido em ordem crescente de ano de fabricação.*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Veiculos
{
    char modelo[20];
    char marca[20];
    char placa[20];
    int ano;

} Veiculos;

Veiculos CarrosCad[10];
Veiculos CarrosNovos;

void menu();
void imprimir();

int main()
{
    menu();
    return 0;
}

void menu()
{
    int escolha, i=0;
    do
    {
        printf("\n============ SISTEMA VEICULOS ==============\n");
        printf("=================== MENU =====================\n");
        printf("1. Lista(s) do(s) Veiculo(s) cadastrado(s): ");
        printf("\n2. Cadastro de veiculo(s): ");
        printf("\n3. Para buscar o(s) veiculo(s) acima do ano de fabricacao especificado: ");
        printf("\n4. Para buscar o(s) modelo(s) do(s) veiculo(s): ");
        printf("\n5. Para sair do menu: \n");
        scanf("%d", &escolha);
        switch (escolha)
        {
        case 1:
            if (i == 0)
            {
                printf("========= NENHUM VEICULO CADASTRADO ===========\n");
            }
            else
            {
                printf("\n============ LISTA DE VEICULO ==============\n");
                for (int i = 0; i < 1; i++)
                printf("Modelo do Veiculo cadastrado %s", CarrosCad[i].modelo);
                printf("Marca do Veiculo cadastrado: %s", CarrosCad[i].marca);
                printf("Placa do Veiculo cadastrado: %s", CarrosCad[i].placa);
                printf("Ano do Veículo cadastrado: %d", CarrosCad[i].ano);
            }
        break;
        case 2:
        if(i == 15)
        {
            printf("=== Valor maximo de 15 carros cadastrados ===");
        }else if(i == 10){
            printf("=== Valor de 10 carros cadastrados ===\n=== Voce pode inserir mais 5 veiculos\nInseri escolha 2 no menu");
        }else
        {
            printf("\n\n============ CADASTRO DE VEICULO ==============\n");
            printf("\nDigite o Modelo do veiculo: ");
            scanf("%100[^\n]%*c", &CarrosCad[i].modelo);
            printf("\nDigite a marca do veiculo: ");
            scanf("%100[^\n]%*c", &CarrosCad[i].marca);
            printf("\nDigite a placa do veiculo (AAA-1111): ");
            scanf("%10[^\n]%*c", &CarrosCad[i].placa);
            printf("\nDigite o ano do veiculo: ");
            scanf("%d", &CarrosCad[i].ano);
        default:
            break;
        }
    }
}while (escolha != 5);

getchar();
return 0;
}
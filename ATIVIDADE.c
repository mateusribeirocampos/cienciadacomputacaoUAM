/* Armazene informações relacionadas à veículos, totalizando, no máximo, 10 veículos.
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

#define TAM 2

struct Veiculos
{
    char modelo[20];
    char marca[20];
    char placa[20];
    int ano;

} Veiculos;

struct Veiculos CarrosCad[TAM];

void menu();
void imprimir(struct Veiculos CarrosCad)
{
    printf("Modelo do Veiculo cadastrado:  %s\n", CarrosCad.modelo);
    printf("Marca do Veiculo cadastrado: %s\n", CarrosCad.marca);
    printf("Placa do Veiculo cadastrado: %s\n", CarrosCad.placa);
    printf("Ano do Veiculo cadastrado: %d\n", CarrosCad.ano);
}

int main()
{
    menu();
    return 0;
}

void menu()
{
    int escolha;
    int i = 0;
    do
    {
        puts("\n============ SISTEMA VEICULOS ==============\n");
        puts("=================== MENU =====================");
        printf("1. Lista(s) do(s) Veiculo(s) cadastrado(s): ");
        printf("\n2. Cadastro de veiculo(s): ");
        printf("\n3. Para buscar veiculo por ano de fabricação: ");
        printf("\n4. Para buscar o(s) veiculo(s) acima do ano de fabricacao especificado: ");
        printf("\n5. Para buscar o(s) modelo(s) do(s) veiculo(s): ");
        printf("\n6. Para sair do menu: \n");
        printf("Escolha informada: ");
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
                for (int p = 0; p < i; p++)
                    imprimir(CarrosCad[p]);
            }
            break;
        case 2:
            if (i == 15)
            {
                printf("=== Valor maximo de 15 carros cadastrados ===");
            }
            else
            {
                puts("\n\n============ CADASTRO DE VEICULO ==============\n");
                fflush(stdin);
                printf("\nDigite o Modelo do veiculo: ");
                fgets(CarrosCad[i].modelo, 20, stdin); // stdin = entrada de entrada padrao
                fflush(stdin);                         // chamar sempre depois de uma entrada de dados para proxima nao dê problema para float e char

                printf("\nDigite a marca do veiculo: ");
                fgets(CarrosCad[i].marca, 20, stdin);
                fflush(stdin);

                printf("\nDigite a placa do veiculo (AAA-1111): ");
                fgets(CarrosCad[i].placa, 20, stdin);
                fflush(stdin);

                printf("\nDigite o ano do veiculo: ");
                scanf("%d", &CarrosCad[i].ano);
                fflush(stdin);

                system("cls");
                i++;

                for (int k = 1; k < TAM; k++)
                {
                    for (int d = 0; d < i - 1; d++)
                    {
                        if (CarrosCad[i].ano > CarrosCad[d].ano)
                        {
                            int aux = CarrosCad[i].ano;
                            CarrosCad[i].ano = CarrosCad[d].ano;
                            CarrosCad[d].ano = aux;
                        }
                    }
                }

                break;
            case 3:
                printf(" ========== Buscar por ano de fabricacao =========");
                printf("\nDigite o ano de fabricacao: ");

                system("cls");
                break;

            default:
                break;
            }
        }
    } while (escolha != 6);

    exit(0);
}
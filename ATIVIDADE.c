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
#include <conio.h>
#include <ctype.h>
#include <locale.h>

#define TAM 10 // define TAM = define o tamanho das variáveis utilizada em toda fonte

struct Veiculos // Estrutura fonte com todas as variáveis utilizada na fonte
{
    char modelo[20]; // Modelo do veículo com até 20 caracteres
    char marca[20];  // Marca do veículo com até 20 caracteres
    char placa[20];  // placa do veículo com até 20 caracteres
    int ano;         // ano recebe número real

} Veiculos;

struct Veiculos CarrosCad[TAM]; // Estrutura veículo com o vetor CarrosCad que recebe um numero especifico de veiculo determinado

void menu();                             // procedimento voide sem retorno para o menu
void imprimir(struct Veiculos CarrosCad) // funcao imprimir para imprimir os carros cadastrados
{
    printf("Modelo do Veiculo cadastrado: %s\n", strupr(CarrosCad.modelo)); //strupr para formatar todas os modelos em letra maius
    printf("Marca do Veiculo cadastrado: %s\n", CarrosCad.marca);
    printf("Placa do Veiculo cadastrado: %s\n", CarrosCad.placa);
    printf("Ano do Veiculo cadastrado: %d\n", CarrosCad.ano);
    printf("==================================\n");
}

int main()
{
    setlocale(LC_ALL, "portuguese");
    menu();
    system("cls");
    exit(0);
    return 0;
}

void menu()
{
    int escolha;
    int i = 0, B_A, busca_Ano, retorno, correto;
    char letra, busca_modelo[20];
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
        do
        {
            printf("\nEscolha informada: ");
            retorno = scanf("%d", &escolha);
            // printf("\nEscolha informada: %d", retorno);
            do
            {
                letra = getchar();
                // printf("%c", letra);
            } while (letra != '\n');
        } while (retorno == 0);
        system("cls");
        switch (escolha)
        {
        case 1:
            if (i == 0)
            {
                printf("\n\n\n\n\n\n\n\n\n========= NENHUM VEICULO CADASTRADO ===========\n\n\n");
            }
            else
            {
                printf("\n\n\n\n\n\n\n\n============ LISTA DE VEICULO ==============\n");
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
                scanf("%19[^\n]s", CarrosCad[i].modelo);     // stdin = entrada de entrada padrao
                fflush(stdin);  // chamar sempre depois de uma entrada de dados para proxima nao dê problema para float e char

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
            }

            for (int k = 0; k < i; k++)
            {
                // printf("\n[%d]", k++);
                for (int z = k; z < i; z++)
                {
                    // printf("%d", z);
                    if (CarrosCad[k].ano > CarrosCad[z].ano)
                    {
                        int aux = CarrosCad[k].ano;
                        CarrosCad[k].ano = CarrosCad[z].ano;
                        CarrosCad[z].ano = aux;
                        // printf("CarroCad[K]: %i\n", CarrosCad[k].ano);
                        // printf("CarroCad[z]: %i\n", CarrosCad[z].ano);
                        // printf("aux: %i\n", aux);
                    }
                }
            }
            break;
        case 3:
            printf(" ========== BUSCAR POR ANO DE FABRICACAO =========");
            do
            {
                printf("\nDigite o ano de fabricacao: ");
                retorno = scanf("%d", &busca_Ano);
                // printf("Data invalida: %d\n", retorno);
                do
                {
                    letra = getchar();
                    // printf("%c", letra);
                } while (letra != '\n');
            } while (retorno == 0);

            for (int k = 0; k < i; k++)
            {
                if (busca_Ano == CarrosCad[k].ano)
                {
                    printf(" ==== VEICULOS ENCONTRADOS PELA DATA INFORMADA: %d\n", busca_Ano);
                    imprimir(CarrosCad[k]);
                    B_A++;
                }
            }
            if (B_A == 0)
            {
                printf("\n\n\n\n\n===== NENHUM VEICULO ENCONTRADO COM A DATA INFORMADA: %d =====\n\n\n\n\n\n", busca_Ano);
            }
            else
            {
                B_A = 0;
            }
            break;
        case 4:
            printf(" ========== BUSCAR POR VEICULOS COM ANO DE FABRICACAO ACIMA DO ESPECIFICADO =========");
            do
            {
                printf("\nDigite o ano de fabricacao: ");
                retorno = scanf("%d", &busca_Ano);
                // printf("Data invalida: %d\n", retorno);
                do
                {
                    letra = getchar();
                    // printf("%c", letra);
                } while (letra != '\n');
            } while (retorno == 0);

            for (int k = 0; k < i; k++)
            {
                if (busca_Ano < CarrosCad[k].ano)
                {
                    printf(" ==== VEICULOS ENCONTRADOS ACIMA DA DATA INFORMADA: %d\n", busca_Ano);
                    imprimir(CarrosCad[k]);
                    B_A++;
                }
            }
            if (B_A == 0)
            {
                printf("\n\n\n\n\n===== NENHUM VEICULO ENCONTRADO COM A DATA INFORMADA =====\n\n\n\n\n\n");
            }
            else
            {
                B_A = 0;
            }
            break;
        case 5:
            printf(" ========== BUSCAR POR MODELO DE VEICULOS =========");
            printf("\nDigite o modelo do veiculo: ");
            scanf("%s", busca_modelo);
            fflush(stdin);

            for (int k = 0; k < i; k++)
            {
                correto = strcmp(busca_modelo, CarrosCad[k].modelo);
                if(correto == 0)
                {
                    //printf("\n\n\n\n\n==== MODELO DE VEICULOS ENCONTRADOS: %s\n\n\n\n\n\n", busca_modelo);
                    imprimir(CarrosCad[k]);
                    B_A++;
                }
            }
            if (B_A == 0)
            {
                printf("\n\n\n\n\n===== NENHUM MODELO DE VEICULO ENCONTRADO: %s =====\n\n\n\n\n\n", busca_modelo);
            }
            else
            {
                B_A = 0;
            }
            break;
        default:
            break;
        }
    } while (escolha != 6);
    system("cls");
}

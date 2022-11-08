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
#include <locale.h>

#define TAM 20 // define TAM = define o tamanho das variáveis utilizada em toda fonte

struct Veiculos // Estrutura fonte com todas as variáveis utilizada na fonte
{
    char modelo[TAM]; // Modelo do veículo com até 20 caracteres
    char marca[TAM];  // Marca do veículo com até 20 caracteres
    char placa[9];    // placa do veículo com até 9 caracteres
    int ano;     // ano recebe número real
} Veiculos;

struct Veiculos CarrosCad[10]; // Estrutura veículo com o vetor CarrosCad que recebe um numero especifico de veiculo determinado

struct Veiculos aux;

void menu(); // procedimento void sem retorno para o menu

void imprimir(struct Veiculos CarrosCad) // funcao imprimir para imprimir os carros cadastrados
{
    printf("\nModelo do Veiculo cadastrado: %s", strupr(CarrosCad.modelo)); // strupr letra maíuscula
    printf("\n\nMarca do Veiculo cadastrado: %s", strupr(CarrosCad.marca));
    printf("\nPlaca do Veiculo cadastrado: %s", strupr(CarrosCad.placa));
    printf("\n\nAno do Veiculo cadastrado: %d", CarrosCad.ano);
    printf("\n=====================================\n");
}


int main()
{
    setlocale(LC_ALL, "portuguese"); // não esta funcionando em meu pc
    menu(); 
    system("cls");
    exit(0);
    return 0;
}

void menu()
{
    int escolha;
    int i = 0, busca_Ano, retorno, correto;
    char letra, busca_modelo[TAM];
    do
    {
        puts("\n============ SISTEMA DE LOCAÇÃO DE VEÍCULOS ==============\n");
        puts("========================== MENU ==============================");
        printf("1. Para Listar o(s) Veículo(s) cadastrado(s): ");
        printf("\n2. Para cadastrar um Veículo: ");
        printf("\n3. Para buscar Veículo por ano de fabricação: ");
        printf("\n4. Para buscar o(s) Veículo(s) acima do ano de fabricacao especificado: ");
        printf("\n5. Para buscar o(s) modelo(s) do(s) Veículo(s): ");
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
                printf("\n\n\n\n\n\n\n\n\n========= NENHUM VEÍCULO CADASTRADO ===========\n\n\n");
            }
            else
            {
                printf("\n\n\n\n\n\n\n\n============ LISTA DE VEÍCULO ==============\n");
                for (int p = 0; p < i; p++)
                    imprimir(CarrosCad[p]);
            }
            break;
        case 2:
            if (i == 10)
            {
                printf("=== Valor máximo de 10 carros cadastrados ===");
            }
            else
            {
                printf("\n\n============ CADASTRO DE VEÍCULO ==============\n");
                fflush(stdin); // stdin = entrada de entrada padrao e para liberar o teclado
                printf("\nDigite o Modelo do veículo: ");
                scanf("%19[^\n]s", CarrosCad[i].modelo); // numero de caracteres limitado a 19 terminado em '\0'
                fflush(stdin);                           // chamar sempre depois de uma entrada de dados para proxima nao dê problema para float e char

                printf("\nDigite a marca do veículo: ");
                fgets(CarrosCad[i].marca, TAM, stdin);
                fflush(stdin);

                printf("\nDigite a placa do veículo (AAA-1111): ");
                scanf("%9[^\n]s", CarrosCad[i].placa);
                fflush(stdin);

                printf("\nDigite o ano do veículo: ");
                scanf("%d", &CarrosCad[i].ano);
                fflush(stdin);

                system("cls");
                i++;
            }
            for (int k = 0; k < i; k++)
            {
                // printf("\n[%d]", k++); //verifica o que imprimiu sobre passagem de k em i
                for (int z = k; z < i; z++)
                {
                    printf("=> %d", z); // informa sobre a lista em z passaando por i e k
                    if (CarrosCad[k].ano > CarrosCad[z].ano) //comparação entre anos da lista em K e z
                    {
                        aux = CarrosCad[k]; //aloca em aux a lista que está em K
                        CarrosCad[k] = CarrosCad[z]; //iguala as listas k e z
                        CarrosCad[z] = aux; // aloca a lista z em aux
                    }
                }
            }
            break;
        case 3:
            printf(" ========== BUSCAR POR ANO DE FABRICAÇÃO =========");
            int B_A;
            do
            {
                printf("\nDigite o ano de fabricação: ");
                retorno = scanf("%d", &busca_Ano);
                // printf("Data invalida: %d\n", retorno);
                do
                {
                    letra = getchar(); // verificaçao da digitação com apenas número
                    // printf("%c", letra);
                } while (letra != '\n'); // abre enter para nova digitação de um número real válido
            } while (retorno == 0); //retorna para digitação do ano válido

            for (int k = 0; k < i; k++)
            {
                if (busca_Ano == CarrosCad[k].ano)
                {
                    printf(" ==== VEÍCULOS ENCONTRADOS PELA DATA INFORMADA: %d\n", busca_Ano);
                    imprimir(CarrosCad[k]);
                    B_A++;
                }
            }
            if (B_A == 0)
            {
                printf("\n\n\n\n\n===== NENHUM VEÍCULO ENCONTRADO COM A DATA INFORMADA: %d =====\n\n\n\n\n\n", busca_Ano);
            }
            else
            {
                B_A = 0;
            }
            break;
        case 4:
            printf(" ========== BUSCAR POR VEÍCULOS COM ANO DE FABRICAÇÃO ACIMA DO ESPECIFICADO =========");
            do
            {
                printf("\nDigite o ano de fabricação: ");
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
                if (busca_Ano <= CarrosCad[k].ano)
                {
                    printf(" ==== VEÍCULOS ENCONTRADOS ACIMA DA DATA INFORMADA: %d\n", busca_Ano);
                    imprimir(CarrosCad[k]);
                    B_A++;
                }
            }
            if (B_A == 0)
            {
                printf("\n\n\n\n\n===== NENHUM VEÍCULO FOI ENCONTRADO A PARTIR DATA INFORMADA: %d =====\n\n\n\n\n\n", busca_Ano);
            }
            else
            {
                B_A = 0;
            }
            break;
        case 5:
            printf(" ========== BUSCAR POR MODELO DE VEÍCULOS ========= ");
            printf("\nDigite o modelo do veículo: ");
            scanf("%s", busca_modelo);
            fflush(stdin);

            for (int k = 0; k < i; k++)
            {
                correto = strcmp(busca_modelo, CarrosCad[k].modelo);
                if (correto == 0)
                {
                    printf("\n\n\n\n\n===== MODELO DE VEÍCULOS DO TIPO %s ENCONTRADOS", busca_modelo);
                    imprimir(CarrosCad[k]);
                    B_A++;
                }
            }
            if (B_A == 0)
            {
                printf("\n\n\n\n\n===== NENHUM MODELO DE VEÍCULO DO TIPO: %s FOI ENCONTRADO", busca_modelo);
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
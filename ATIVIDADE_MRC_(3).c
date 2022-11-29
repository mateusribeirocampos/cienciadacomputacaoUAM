/**********************************************************************************************************************************/
/*Em algumas situações, para a implementação de um sistema computacional, não se conhece, previamente, qual o tamanho da massa de dados que será efetivamente manipulada. Em tais casos, pode ser usado o recurso de alocação dinâmica de memória. Com tal recurso, uma região de memória poderá ser alocada, sob demanda de modo a tornar o programa mais flexível em relação à quantidade de itens a serem manipulados. Essa flexibilidade torna o programa escalável.

O objetivo desta questão é exercitar a manipulação de ponteiros em um cenário onde se exige a alocação dinâmica de memória através da implementação de um programa computacional.

Antes de falarmos das funcionalidades do programa a ser implementado, convém mencionar que, em algumas situações o espaço previamente alocado deve ser redimensionado devido, à por exemplo, um aumento ou diminuição inesperada na quantidade de itens manipulados. Para realizar o redimensionamento, pode-se, na linguagem C, utilizar a função “realloc()”. Essa função segue a seguinte sintaxe:

void *realloc (void *ptr_original, size_t);

A função “realloc()” retorna a posição do bloco realocado com a nova dimensão. No trecho de código acima, o parâmetro “ptr_original” representa o bloco previamente alocado com a função “malloc()” ou “calloc()”. Detalhes destas funções, inclusive a “realloc()” poderão ser obtidas acessando-se (GARCIA, 2016) através do link: <https://www.embarcados.com.br/ponteiro-em-c-alocacao-dinamica/>.

Para a realização desta atividade, suponha a necessidade de cadastrar clientes de uma loja. Por ser uma loja nova e com produtos inovadores, pouco se sabe do mercado a ser atingido, sendo assim, não se sabe a quantidade de clientes poderão ser cadastrados. Estima-se, inicialmente, em 10 clientes. Cada cliente terá os seguintes
campos:

- nome (suponha um nome com, no máximo, 30 caracteres)
- ano de nascimento
- montante de gastos realizados no mês (quanto o clinte pagou em suas compras dentro do mês corrente)

Para tanto, o sistema deverá oferecer as seguintes funcionalidades:

- incluir um novo cliente
- remover cliente
- atualizar o montante de compras do cliente realizadas no mês corrente
- zerar todos os montantes de compras por ocasião da virada de mês
- listar o cliente melhor comprador
- exibir um montante de compras de um cliente específico.

O programa deverá, ainda, prever a situação que a quantidade de clientes a ser cadastrados supere a previsão inicial. Neste caso, quando o espaço de memória destinado a receber dados dos clientes estiver cheia, deve-se ampliar esse espaço - sempre em blocos de 10.
Poste o código, implementado em C, em seu portfólio.
Bons Estudos!

Referência DEITEL, P. J.; DEITEL, H. C: Como Programar. 6. Ed. São Paulo: Pearson Prentice Hall, 2011. [Recurso eletrônico, Biblioteca Virtual Universitária]

GARCIA, F. D. Ponteiro em C: Alocação Dinâmica de Memória. Publicado em 08/01/2016. Disponível em <https://www.embarcados.com.br/ponteiro-em-c-alocacao-dinamica/>. Acesso em 05/07/2019.                                                                          */
/**********************************************************************************************************************************/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

#define NOME_DO_CLIENTE 30
#define QUANTIDADE_DE_CLIENTES 10
#define EXPANSAO_CLIENTE 10

#define OPCAO_CADASTRO 1
#define OPCAO_REMOVER 2
#define OPCAO_ATUALIZAR_MONTANTE 3
#define OPACAO_ZERAR_MONTANTE 4
#define OPCAO_LISTAR_MELHOR_COMPRADOR 5
#define OPCAO_MONTANTE_COMPRA 6
#define OPCAO_SAIR 7

struct Clientes
{
    char nome[NOME_DO_CLIENTE];
    int AnoNascimento;
    float ValorGasto;
};

struct Clientes ClienteIncluir[QUANTIDADE_DE_CLIENTES];
int TamanhoListaCliente = QUANTIDADE_DE_CLIENTES;
int Proximo_Lista = 0;

int Imprimir_Menu();
void LimpaTela();
struct Clientes Obter_dados_clientes();
void Menu();
void OrdenarListaGasto();

void LimpaTela()
{
    system("cls");
}

void InteracaoVendedor()
{
    printf("\n");
    system("pause");
}

int Imprimir_Menu()
{

    puts("\n==================== CADASTRO DE CLIENTES ==================");
    puts("============================== MENU ==========================");
    printf("DIGITE %i. PARA CADASTRAR CLIENTE", OPCAO_CADASTRO);
    printf("\nDIGITE %i PARA REMOVER CLIENTE", OPCAO_REMOVER);
    printf("\nDIGITE %i PARA ATUALIZAR O MONTANTE DE COMPRA DO CLIENTE", OPCAO_ATUALIZAR_MONTANTE);
    printf("\nDIGITE %i PARA ZERAR TODO MONTANTE DE COMPRA PARA O PROXIMO MES", OPACAO_ZERAR_MONTANTE);
    printf("\nDIGITE %i PARA LISTAR O CLIENTE MELHOR COMPRADOR", OPCAO_LISTAR_MELHOR_COMPRADOR);
    printf("\nDIGITE %i PARA EXIBIR UM MONTANTE DE COMPRA DE UM CLIENTE ESPECIFICO", OPCAO_MONTANTE_COMPRA);
    printf("\nDIGITE %i PARA SAIR DO MENU\n", OPCAO_SAIR);

    printf("\nDIGITE A OPCAO DESEJADA: ");
    int retorno;
    fflush(stdin);
    scanf("%i", &retorno);
    LimpaTela();
    return retorno;
}

void imprimirLista()
{
    for (int i = 0; i <= Proximo_Lista - 1; i++)
        printf("\n%i - Nome: %sAno: %i, valor Gasto: %.2f\n", i, ClienteIncluir[i].nome, ClienteIncluir[i].AnoNascimento, ClienteIncluir[i].ValorGasto);
}

void Cadastro_Cliente()
{
    if (Proximo_Lista >= TamanhoListaCliente)
    {
        TamanhoListaCliente += EXPANSAO_CLIENTE;
        realloc(ClienteIncluir, TamanhoListaCliente);
    }

    struct Clientes Consumidor = Obter_dados_clientes();
    ClienteIncluir[Proximo_Lista] = Consumidor;
    Proximo_Lista++;
}

struct Clientes Obter_dados_clientes()
{
    struct Clientes retorno;
    printf("\nDigite o Nome do cliente: ");
    fflush(stdin);
    fgets(retorno.nome, NOME_DO_CLIENTE, stdin);

    printf("\nDigite o Ano de Nascimento do cliente: ");
    fflush(stdin);
    scanf("%i", &retorno.AnoNascimento);

    printf("\nDigite o Valor Gasto: ");
    fflush(stdin);
    scanf("%f", &retorno.ValorGasto);
    LimpaTela();

    return retorno;
}

void ExcluirCliente()
{
    if (Proximo_Lista == 0)
    {
        printf("\nNenhum cliente cadastrado . . .\n");
        InteracaoVendedor();
        LimpaTela();
    }
    else
    {
        printf("\nQual cliente deseja Excluir?\n");

        imprimirLista();

        printf("\nDigite o Indice para Excluir: ");

        int IndiceSelecionado = -1;
        scanf("%i", &IndiceSelecionado);

        if ((IndiceSelecionado >= 0) && (IndiceSelecionado <= Proximo_Lista))
        {
            for (int i = IndiceSelecionado; i <= Proximo_Lista - 1; i++)
                ClienteIncluir[i] = ClienteIncluir[i + 1];

            Proximo_Lista--;
        }
        else
        {
            printf("\nIndice Fora da Lista");
            InteracaoVendedor();
            LimpaTela();
        }
    }
}
// O maior problema está atualização do valor gasto devido a não soma dos valores cadastrados e atualizados.
void AtualizarMontante()
{
    if (Proximo_Lista == 0)
    {
        printf("\nLista de cliente vazia");
        InteracaoVendedor();
    }
    else
    {
        printf("\nLista dos clientes e valores gastos cadastrados");
        imprimirLista();
        printf("\nDigite o indice para atualizar o valor gasto pelo cliente: ");

        int IndiceSelecionado = -1;
        scanf("%i", &IndiceSelecionado);
        if ((IndiceSelecionado >= 0) && (IndiceSelecionado <= Proximo_Lista))
        {
            printf("\nO cliente: %sGastou %.2f nesse mes.\nDigite o valor da nova compra: ", ClienteIncluir[IndiceSelecionado].nome, ClienteIncluir[IndiceSelecionado].ValorGasto);

            float montante;
            scanf("%f", &montante);

            // Não adiciona o valor
            ClienteIncluir[IndiceSelecionado].ValorGasto += montante;
        }
        else
        {
            printf("\nIndice fora da lista de clientes");
            InteracaoVendedor();
        }
    }
}

void ZerarMontante()
{
    if (Proximo_Lista == 0)
    {
        printf("\nNenhum Cliente cadastrado\n");
        InteracaoVendedor();
    }
    else
    {
        for (int i = 0; i <= Proximo_Lista - 1; i++)
            ClienteIncluir[i].ValorGasto = 0;
        printf("\nMontante de gasto zerado para todos os clientes\n");
        InteracaoVendedor();
        LimpaTela();
    }
}
/* todos esses desativados foram tentantivas de imprimir o maior comprador. A forma que consegui esta void ListarCliente() escrito abaixo dessas tentativas. Entretando, ainda ocorre erro na impressão do numero maior valor da lista de clientes cadastrados.
void ListarCliente()
{
    int Quantidade_Clientes_Cadastrados = 0;

    int gasto;

    if (Quantidade_Clientes_Cadastrados != 0)
    {
        for (int i = 0; i < Proximo_Lista; i++)
        imprimirLista(ClienteIncluir[i].ValorGasto > gasto);
        Quantidade_Clientes_Cadastrados++;
    }
    else if (Quantidade_Clientes_Cadastrados == 0)
    {
        printf("\nNenhum cliente cadastrado. . .");
        InteracaoVendedor();
        LimpaTela();
    }
}

void ListarCliente(int Opcao_Selecionada)
{
    int gasto;

    int Quantidade_Clientes_Cadastrados = 0;

    for (int i = 0; i < Proximo_Lista; i++)
    {
        bool ImprimirListaClientesCadastrados = true;

        switch (Opcao_Selecionada)
        {
        case OPCAO_LISTAR_MELHOR_COMPRADOR:

            ImprimirListaClientesCadastrados = (ClienteIncluir[i].ValorGasto > gasto);

            break;
        }
        if (ImprimirListaClientesCadastrados)
        {
            imprimirLista(ClienteIncluir[i]);
            Quantidade_Clientes_Cadastrados++;
        }
    }
    if (Quantidade_Clientes_Cadastrados == 0)
    {
        printf("\nNenhum Cliente Cadastrado . . .\n");
        InteracaoVendedor();
        LimpaTela();
    }
}

void ImprimirClienteMaiorValor()
{
    for(int i = 0; i < 2; i++)
    printf("\nNome: %sAno de nascimento: %i, valor gasto: %.2f\n", ClienteIncluir[Proximo_Lista].nome, ClienteIncluir[Proximo_Lista].AnoNascimento, ClienteIncluir[Proximo_Lista].ValorGasto);
    InteracaoVendedor();
}

void ListarCliente()
{
    int gasto, QuantidadeClientesCadastrados = 0;
    if(Proximo_Lista > QuantidadeClientesCadastrados)
    {
        ImprimirClienteMaiorValor(ClienteIncluir[Proximo_Lista].ValorGasto > gasto);
    }else if(Proximo_Lista = QuantidadeClientesCadastrados)
    {
        printf("Nenhum cliente cadastrado");
        LimpaTela();
        InteracaoVendedor();
    }
}

void ListarCliente()
{

    if (Proximo_Lista == 0)
    {
        printf("\nNenhum cliente cadastrado . . .");
        InteracaoVendedor();
    }
    else
    {
        int MaiorComprador = -1, h = -1, f = -1;
        for (int h = 0; h <= Proximo_Lista - 1; h++)
        {
            if (MaiorComprador == -1)
            {
                MaiorComprador = h;
            }
            else
            {
                if (ClienteIncluir[h].ValorGasto > ClienteIncluir[MaiorComprador].ValorGasto)
                {
                    h = f;
                    f = MaiorComprador;
                    MaiorComprador = h;
                }
            }
        }
        if (MaiorComprador > -1)
            printf("\nO maior comprador foi o cliente  %sGastou %.2f nesse mes", ClienteIncluir[MaiorComprador], ClienteIncluir[MaiorComprador].ValorGasto);
        InteracaoVendedor();
    }
}
*/
void ListarCliente()
{

    if (Proximo_Lista == 0)
    {
        printf("\nNenhum cliente cadastrado . . .");
        InteracaoVendedor();
    }
    else
    {
        int i = 0;
        OrdenarListaGasto();
        ClienteIncluir[i].ValorGasto > ClienteIncluir[Proximo_Lista].ValorGasto;
        printf("\nO maior comprador foi o cliente: %sSeu gasto foi de %.2f nesse mes", ClienteIncluir[i].nome, ClienteIncluir[i].ValorGasto);
    }
    InteracaoVendedor();
}
// fiz a ordenação dessa forma para dar suporte na void ListaCliente()
void OrdenarListaGasto()
{
    for (int i = 0; i < Proximo_Lista; i++)
    {
        for (int j = i; j < Proximo_Lista; j++)
        {
            if (ClienteIncluir[i].ValorGasto < ClienteIncluir[j].ValorGasto)
            {
                struct Clientes aux = ClienteIncluir[i];
                ClienteIncluir[i] = ClienteIncluir[j];
                ClienteIncluir[j] = aux;
            }
        }
    }
}
// Impressão da consulsta do montante de compra fiz separado para não ocasionar erro e pela especificidade
void ImprimirConsultaMontanteCompra()
{
    for (int i = 0; i <= Proximo_Lista - 1; i++)
        printf("\n%i - Nome: %sAno: %i\n", i, ClienteIncluir[i].nome, ClienteIncluir[i].AnoNascimento);
}

void ConsultaMontanteCompra()
{
    if (Proximo_Lista == 0)
    {
        printf("\nLista de cliente vazia");
        InteracaoVendedor();
        LimpaTela();
    }
    else
    {
        printf("\nLista dos clientes cadastrados");
        ImprimirConsultaMontanteCompra();
        printf("\nDigite o indice do cliente para verificar valor gasto no mes: ");

        int IndiceSelecionado = -1;
        scanf("%i", &IndiceSelecionado);
        LimpaTela();
        if ((IndiceSelecionado >= 0) && (IndiceSelecionado <= Proximo_Lista))
        {
            printf("\nO cliente: %sGastou %.2f nesse mes.\n\n", ClienteIncluir[IndiceSelecionado].nome, ClienteIncluir[IndiceSelecionado].ValorGasto);
            InteracaoVendedor();
            LimpaTela();
        }
        else
        {
            printf("\nIndice fora da lista de clientes");
            InteracaoVendedor();
            LimpaTela();
        }
    }
}

void Menu(int opcao)
{

    switch (opcao)
    {
    case OPCAO_CADASTRO:
        Cadastro_Cliente();
        break;
    case OPCAO_REMOVER:
        ExcluirCliente();
        break;
    case OPCAO_ATUALIZAR_MONTANTE:
        AtualizarMontante();
        break;
    case OPACAO_ZERAR_MONTANTE:
        ZerarMontante();
        break;
    case OPCAO_LISTAR_MELHOR_COMPRADOR:
        ListarCliente();
        break;
    case OPCAO_MONTANTE_COMPRA:
        ConsultaMontanteCompra();
        break;
    case OPCAO_SAIR:
        break;
    default:
        printf("Opcao invalida!!!");
        InteracaoVendedor();
        break;
    }
}

int main()
{
    LimpaTela();

    fflush(stdin);

    int Opcao_Menu;
    do
    {
        Opcao_Menu = Imprimir_Menu();
        Menu(Opcao_Menu);
    } while (Opcao_Menu != OPCAO_SAIR);

    return EXIT_SUCCESS;
}

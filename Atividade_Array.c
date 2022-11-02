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

int main()
{
    struct Veiculos
    {
        int modelo, AnoFab;
        char marca[1000], placa[1000];

    } Veiculos;
    struct Veiculos Carros[2];

    Carros[0].modelo = 2018;
    Carros[0].AnoFab = 2017;
    strcpy(Carros[0].marca, "Hyundai");
    strcpy(Carros[0].placa, "AAA-1111");

    Carros[1].modelo = 2008;
    Carros[1].AnoFab = 2007;
    strcpy(Carros[1].marca, "Chevrolet");
    strcpy(Carros[1].placa, "BBB-2222");

    for (int i = 0; i < 2; i++)
    {
        printf("\n\nMarca: %s\nModelo: %d\nAno de Fabricacao: %d\nPlaca: %s\n", Carros[i].marca, Carros[i].modelo, Carros[i].AnoFab, Carros[i].placa);
    }
    return 0;
}

/*Array para armazenar os dados necessarios.
Depois será necessário verificar como cadastrar -> olhar ATIVIDADE.c
para listar os veículos será necessário verificar em presquisa. */

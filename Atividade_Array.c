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

typedef struct Veiculos
{
    char marca[100];
    int modelo[4], AnoFab[4];
    char placa[8];

}Veiculos;

/*Array para armazenar os dados necessarios. 
Depois será necessário verificar como cadastrar -> olhar ATIVIDADE.c
para listar os veículos será necessário verificar em presquisa. */




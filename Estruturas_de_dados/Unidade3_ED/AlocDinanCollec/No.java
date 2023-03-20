// Esta classe representa um nó em uma lista encadeada simples.
// A alocação dinâmica ocorre quando a lista é construída com uma referência para o próximo nó ao invés de um tamanho fixo.
// O construtor da classe recebe um valor e a referência para o próximo nó.
// Os métodos setValor e getValor são usados para manipular o valor armazenado no nó.
// Os métodos setProximo e getProximo são usados para manipular a referência para o próximo nó.

package Unidade3_ED.AlocDinanCollec;

// Definição da classe No
public class No {
    // Atributos da classe
    private No proximo; // Referência para o próximo nó
    private int valor; // Valor armazenado no nó

    // Construtor da classe que recebe um valor e a referência para o próximo nó
    No(int v, No n) {
        valor = v;
        proximo = n;
    }

    // Método que define o valor do nó
    public void setValor(int aux) {
        valor = aux;
    }

    // Método que retorna o valor do nó
    public int getValor() {
        return valor;
    }

    // Método que define a referência para o próximo nó
    public void setProximo(No aux) {
        proximo = aux;
    }

    /*O atributo proximo da classe No é uma referência para o próximo nó na lista encadeada.Por exemplo, na lista encadeada simples com três nós: nó1, nó2 e nó3, e quisermos acessar o valor armazenado no nó2. Nós poderiamos usar a referência proximo do nó1 para obter uma referência para o nó2, e então acessar o valor do nó2 usando o método getValor(). Resumindo, para acessar o valor armazenado em um nó da lista encadeada, você precisa percorrer a lista a partir do primeiro nó, usando as referências proximo de cada nó até chegar no nó desejado */

    // Método que retorna a referência para o próximo nó
    public No getProximo() {
        return proximo;
    }
}

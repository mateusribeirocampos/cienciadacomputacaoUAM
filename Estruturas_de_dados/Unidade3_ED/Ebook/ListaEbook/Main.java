/*O código cria uma lista encadeada simples (classe Lista) que contém uma sequência de itens (classe ItemLista).
O método main cria uma nova lista vazia e adiciona quatro itens à lista.
Em seguida, ele imprime o tamanho da lista e seu conteúdo usando os métodos tamanhoLista() e ler() da classe Lista.
O código, em seguida, remove o segundo item da lista usando o método remove() da classe Lista e o método get() para obter o item a ser removido.
Em seguida, ele imprime novamente o tamanho da lista e seu conteúdo após a remoção.*/

// Importação da classe Lista e ItemLista do pacote Ebook
package estruturas_de_dados.unidade3_ed.ebook.listaebook;

// Classe principal que contém o método main
public class Main {
    // Método main que inicia a execução do programa
    public static void main(String[] args) {
        // Criação de uma nova lista vazia
        Lista lista = new Lista(null);

        // Adiciona alguns itens à lista
        lista.adiciona(new ItemLista("Item 1"));
        lista.adiciona(new ItemLista("Item 2"));
        lista.adiciona(new ItemLista("Item 3"));

        // Imprime o tamanho da lista
        System.out.println("Tamanho da lista: " + lista.tamanhoLista());

        // Imprime o conteúdo da lista
        for (int i = 0; i < lista.tamanhoLista(); i++) {
            lista.ler(i);
        }

        // Remove um item da lista
        ItemLista itemParaRemover = lista.get(1);
        lista.remove(itemParaRemover);

        // Imprime o tamanho da lista após a remoção
        System.out.println("Tamanho da lista após a remoção: " + lista.tamanhoLista());

        // Imprime o conteúdo da lista após a remoção
        for (int i = 0; i < lista.tamanhoLista(); i++) {
            lista.ler(i);
        }
    }
}

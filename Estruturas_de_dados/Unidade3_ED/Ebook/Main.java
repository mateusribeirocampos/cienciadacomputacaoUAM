package Unidade3_ED.Ebook;

public class Main {

    public static void main(String[] args) {
        Lista lista = new Lista(null);

        // Adiciona alguns itens à lista
        lista.adiciona(new ItemLista("Item 1"));
        lista.adiciona(new ItemLista("Item 2"));
        lista.adiciona(new ItemLista("Item 3"));
        lista.adiciona(new ItemLista("Mateus"));

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

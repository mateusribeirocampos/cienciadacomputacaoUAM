package estruturas_de_dados.unidade3_ed.ebook.pilhaebook;

public class MainPizza {
    public static void main(String[] args) {
        PilhaEntregaPizza pilha = new PilhaEntregaPizza(null);

        //criação das pessoas
        Pizza pizza1 = new Pizza("Olavo Oliveira", "Rua Jovial Augusto, 587");
        Pizza pizza2 = new Pizza("Anne Carvalho", "Avenida Castelo Branco, 157");
        Pizza pizza3 = new Pizza("Margaret Thatcher", "Avenida Brasil, 999");
        Pizza pizza4 = new Pizza("Isadora Albuquerque", "Avenida Afonso Pena, 356");
        //insere elementos
        pilha.insereTopo(pizza1);
        pilha.insereTopo(pizza2);
        pilha.insereTopo(pizza3);
        pilha.insereTopo(pizza4);

        //remove elemento do topo
        pilha.retiraTopo(); //Como o último elemento pizza3 foi adicionado ele é o ultimo da lista e o primerio a ser removido

        //imprime elementos da pilha
        pilha.ImprimirPizza();

    }
}

package unidade4_ed.ebook.arvorebinaria;

public class MainFruta {
    public static void main(String[] args) {
        // Criação de um novo objeto NoFruta para verificar se a árvore está vazia
        NoFruta semFruta = new NoFruta();
        System.out.println("A arvore de fruta está vazia: ");
        // Chamada do método frutaVazia() para verificar se a árvore está vazia
        semFruta.frutaVazia();
        System.out.println();

        // Criação do objeto raiz da árvore
        NoFruta raiz = new NoFruta();
        // Criação do objeto Fruta laranja e atribuição dos seus valores
        Fruta laranja = new Fruta();
        laranja.setNome("Laranja Bahia");
        laranja.setCor("Amarelo");
        laranja.setTipo("Tipo 1");
        // Atribuição da fruta laranja à raiz da árvore
        raiz.setFruta(laranja);

        // Criação do objeto NoFruta para representar o nó filho da esquerda
        NoFruta filhaEsquerda = new NoFruta();
        // Criação do objeto Fruta uva e atribuição dos seus valores
        Fruta uva = new Fruta();
        uva.setNome("Uva italiana");
        uva.setCor("roxo avermelhado");
        uva.setTipo("Tipo 1A");
        // Atribuição da fruta uva ao nó filho da esquerda
        filhaEsquerda.setFruta(uva);
        // Atribuição do nó filho da esquerda à raiz da árvore
        raiz.setFrutaEsquerda(filhaEsquerda);

        // Criação do objeto NoFruta para representar o nó filho da direita
        NoFruta filhaDireita = new NoFruta();
        // Criação do objeto Fruta banana e atribuição dos seus valores
        Fruta banana = new Fruta();
        banana.setNome("Banana Prata");
        banana.setCor("Amarelo claro");
        banana.setTipo("Tipo 2");
        // Atribuição da fruta banana ao nó filho da direita
        filhaDireita.setFruta(banana);
        // Atribuição do nó filho da direita à raiz da árvore
        raiz.setFrutaDireita(filhaDireita);

        // Impressão da árvore de frutas, começando pela raiz
        NoFruta.imprimirFruta(raiz);

        // Verifica se ainda permanece vazia
        System.out.println();
        System.out.println("Continua vazia");
        raiz.frutaVazia(); 

    }
}

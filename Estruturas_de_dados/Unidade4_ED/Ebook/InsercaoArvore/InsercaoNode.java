package unidade4_ed.ebook.insercaoarvore;

public class InsercaoNode {
    public Node adicionaNode(Node atual, String valor) {
        if (atual == null) {
            return new Node(valor);
        }
    
        // Valor a ser inserido é menor que o nó corrente
        if (valor.compareTo(atual.valor) < 0) {
            atual.filhoEsquerda = adicionaNode(atual.filhoEsquerda, valor);
        } else if (valor.compareTo(atual.valor) > 0) { //valor a ser inserido é maior que corrente
            atual.filhoDireita = adicionaNode(atual.filhoDireita, valor);
        } else {
            //valor já existe, não precisa adicionar novamente
            return atual;
        }
        return atual;
    }    
} 
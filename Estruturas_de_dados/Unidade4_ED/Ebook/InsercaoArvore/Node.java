package Unidade4_ED.Ebook.InsercaoArvore;

public class Node {
    public String valor;
    public Node filhoEsquerda;
    public Node filhoDireita;

    public Node(String valor) {
        this.valor = valor;
        this.filhoEsquerda = null;
        this.filhoDireita = null;
    }
}

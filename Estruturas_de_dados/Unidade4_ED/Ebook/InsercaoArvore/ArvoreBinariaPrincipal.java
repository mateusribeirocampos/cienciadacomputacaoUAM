package unidade4_ed.ebook.insercaoarvore;

import java.util.Arrays;
import java.util.*;

public class ArvoreBinariaPrincipal {
    public static void main(String[] args) {
        InsercaoNode insercao = new InsercaoNode();
        Node raiz = null;

        List<String> lista = Arrays.asList("Z", "R", "X", "A", "C", "S");
        for (String letra : lista) {
            raiz = insercao.adicionaNode(raiz, letra);
        }

        // Imprime os nós em ordem
        System.out.println("Nós em ordem:");
        imprimirEmOrdem(raiz);

        // Imprime os nós em ordem inversa
        System.out.println("\nNós em ordem inversa:");
        imprimirEmOrdemInversa(raiz);
    }

    private static void imprimirEmOrdem(Node node) {
        if (node != null) {
            imprimirEmOrdem(node.filhoEsquerda);
            System.out.print(node.valor + " ");
            imprimirEmOrdem(node.filhoDireita);
        }
    }

    private static void imprimirEmOrdemInversa(Node node) {
        if (node != null) {
            imprimirEmOrdemInversa(node.filhoDireita);
            System.out.print(node.valor + " ");
            imprimirEmOrdemInversa(node.filhoEsquerda);
        }
    }
}

package Unidade4_ED.Ebook.Storage;

public class Main {
    public static void main(String[] args) {
        // Criando a raiz da árvore binária com valor "1" e sem filhos
        NoArvoreBinario raiz = new NoArvoreBinario("1", null, null);
        
        // Criando um nó filho com valor "2" e sem filhos
        NoArvoreBinario filhoEsquerda = new NoArvoreBinario("2", null, null);
        
        // Criando um nó filho com valor "3" e sem filhos
        NoArvoreBinario filhoDireita = new NoArvoreBinario("3", null, null);
        
        // Definindo o filho da esquerda da raiz como sendo o nó filhoEsquerda
        raiz.setFilhoEsquerda(filhoEsquerda);
        
        // Definindo o filho da direita da raiz como sendo o nó filhoDireita
        raiz.setFilhoDireita(filhoDireita);
        
        // Imprimindo o valor armazenado na raiz da árvore
        System.out.println("Valor da raiz: " + raiz.getInformacao());
        
        // Imprimindo o valor armazenado no filho da esquerda da raiz
        System.out.println("Valor do filho da esquerda: " + raiz.getFilhoEsquerda().getInformacao());
        
        // Imprimindo o valor armazenado no filho da direita da raiz
        System.out.println("Valor do filho da direita: " + raiz.getFilhoDireita().getInformacao());
    }
}

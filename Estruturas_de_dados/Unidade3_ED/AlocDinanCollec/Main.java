package unidade3_ed.AlocDinanCollec;

public class Main {
    public static void main(String[] args) {
        No no3 = new No(3, null);
        No no2 = new No(2, no3);
        No no1 = new No(1, no2);
        
        // Imprime os valores dos nós
        System.out.println(no1.getValor());
        System.out.println(no2.getValor());
        System.out.println(no3.getValor());
        
        // Imprime os valores dos nós usando referências
        No aux = no1;
        while (aux != null) {
            System.out.println(aux.getValor());
            aux = aux.getProximo();
        }
        
        // Insere um novo nó na lista
        No novoNo = new No(4, null);
        no3.setProximo(novoNo);
        
        // Imprime os valores dos nós novamente
        aux = no1;
        while (aux != null) {
            System.out.println(aux.getValor());
            aux = aux.getProximo();
        }
    }
}


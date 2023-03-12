package Ordenacao.RapOrdem;

public class RapidaOrdem {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }
        System.out.println("Array Desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        quickSort(vetor, 0, vetor.length-1); // chamada da função quickSort
        
        System.out.println("\nArray Ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    static void quickSort(int[] vetor, int esquerda, int direita) { // correção na declaração da função quickSort
        if (esquerda < direita) {
            int p = particao(vetor, esquerda, direita);
            quickSort(vetor, esquerda, p);
            quickSort(vetor, p+1, direita); // falta chamar quickSort com p+1 e direita
        }
    }

    static int particao(int[] vetor, int esquerda, int direita) { // correção na declaração da função particao
        int meio = (int) (esquerda + direita) / 2;
        int pivot = vetor[meio];
        int i = esquerda - 1;
        int j = direita +1;
        while (true) {
            do {
                i++;
            } while (vetor[i] < pivot);
            do {
                j--;
            } while (vetor[j] > pivot);
            if (i >= j) {
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j]; // correção na troca dos valores do vetor
            vetor[j] = aux;
        }
    }
}

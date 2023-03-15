package Ordenacao.HeapSort;

public class Heap_sort {
    public static void main(String[] args) {
        int[] vetor = { 5, 3, 8, 2, 6 };

        System.out.print("Vetor desordenado: { ");
        for (int i = 0; i < vetor.length; i++) {
            if (i == (vetor.length - 1)) {
                System.out.print(vetor[i] + " }");
            } else {
                System.out.print(vetor[i] + ", ");
            }
        }
        // Heap-sort
        int n = vetor.length;
        for (int i = n / 2 -1; i >= 0; i--) {
            aplicaHeap(vetor, n, i);
        }
        System.out.println();
        System.out.print("Vetor Quase ordenado pelo metodo Heap-sort: { ");
        for (int i = 0; i < vetor.length; i++) {
            if (i == (vetor.length - 1)) {
                System.out.print(vetor[i] + " }");
            } else {
                System.out.print(vetor[i] + ", ");
            }
        }
        for (int j = n - 1; j >= 0; j--) {
            int aux = vetor[0];
            vetor[0] = vetor[j];
            vetor[j] = aux;

            aplicaHeap(vetor, j, 0);
        }
        System.out.println();
        System.out.print("Vetor ordenado pelo metodo Heap-sort: { ");
        for (int i = 0; i < vetor.length; i++) {
            if (i == (vetor.length - 1)) {
                System.out.print(vetor[i] + " }");
            } else {
                System.out.print(vetor[i] + ", ");
            }
        }
    }
    private static void aplicaHeap(int[] vetor, int n, int i) {
        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if ((esquerda < n) && (vetor[esquerda] > vetor[raiz])) {
            raiz = esquerda;
        }
        if ((direita < n) && (vetor[direita] > vetor[raiz])) {
            raiz = direita;
        }
        if (raiz != i) {
            int aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;

            aplicaHeap(vetor, n, raiz);
        }
    }
}

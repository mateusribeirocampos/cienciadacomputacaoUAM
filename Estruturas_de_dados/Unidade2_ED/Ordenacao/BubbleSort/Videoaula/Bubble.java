package Ordenacao.BubbleSort.Videoaula;

public class Bubble {
    public static void main(String[] args) {
        int numeros[] = { 2, 1, 3 };

        BubbleSort.bubble_sort(numeros);

        System.out.println("Array ordenado no bubble sort:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

    }
}
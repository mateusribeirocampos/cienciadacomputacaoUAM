package Ordenacao.BubbleSort;

public class Bubble {
    public static void main(String[] args) {
        int numeros[] = { 5, 3, 7, 10, 33 };

        BubbleSort.bubble_sort(numeros);

        System.out.println("Array ordenado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

    }
}
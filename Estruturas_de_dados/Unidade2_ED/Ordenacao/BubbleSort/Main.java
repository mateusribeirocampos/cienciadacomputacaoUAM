package Ordenacao.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int numeros[] = { 5, 3, 7, 10, 33 };

        BubbleSort.bubble_sort(numeros);

        System.out.println("Sorted array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

    }
}
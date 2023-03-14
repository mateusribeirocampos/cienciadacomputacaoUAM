package Ordenacao.BubbleSort.Ebook;

public class Mybubblesort {
    public static void main(String[] args) {
        int[] array = { 5, 3, 8, 2, 6 };

        // Imprime o array usando um loop for
        System.out.print("Array desordenado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Imprime o array usando um loop for-each
        System.out.print("\nArray desordenado: ");
        for (int elementos : array) {
            System.out.print(elementos + " ");
        }

        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = 0; j < (array.length - 1); j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }
            }
        }

        System.out.println(" ");
        System.out.print("Array ordenado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println(" ");
        System.out.print("Array ordenado: { ");
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                System.out.print(array[i] + " }");
            } else {
                System.out.print(array[i] + ", ");
            }
        }

    }
}
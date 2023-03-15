package Ordenacao.SelectionSort.Ebook;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = { 5, 3, 8, 2, 6 };

        System.out.print("Array desordenado: { ");
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length - 1)) {
                System.out.print(array[i] + " }");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("");

        for (int i = 0; i < (array.length - 1); i++) {
            int menor_valor = i;
            System.out.println("Menor valor = i = " + menor_valor);
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[menor_valor]) {
                    menor_valor = j;
                    System.out.println("Menor valor = j = " + menor_valor);
                    System.out.println("Array[j] = " + array[j]);
                    System.out.println("Array[menor_valor] = " + array[menor_valor]);
                }
            }
            int auxiliar = array[i];
            array[i] = array[menor_valor];
            array[menor_valor] = auxiliar;

            System.out.println("Auxiliar inicial = array[i] = " + auxiliar);
            System.out.println("array[i] = array[menor_valor] = auxiliar final = " + array[i]);
            System.out.println("-----------------------------------------------------------");
        }

        System.out.println("");
        System.out.print("Array ordenado pelo método Selection-Sort: { ");
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length - 1)) {
                System.out.print(array[i] + " }");
            } else {
                System.out.print(array[i] + ", ");
            }
        }

    }
}

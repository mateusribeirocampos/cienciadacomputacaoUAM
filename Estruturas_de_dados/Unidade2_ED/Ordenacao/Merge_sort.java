package Ordenacao;
import  java.util.Arrays;

public class Merge_sort {

    public static void main(String[] args) {
        int[] array = {9, 2, 4, 350, 7, 3, 7, 10, 200, 1054};
        mergeSort(array, 0, array.length - 1);
        System.out.println("Array ordenado pelo método Merge-Sort: ");
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] arr, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;
            mergeSort(arr, esquerda, meio);
            mergeSort(arr, meio + 1, direita);
            merge(arr, esquerda, meio, direita);
        }
    }

    public static void merge(int[] array, int esquerda, int meio, int direita) {
        int[] tempo = new int[direita - esquerda + 1];
        int i = esquerda;
        int j = meio + 1;
        int k = 0;
        while (i <= meio && j <= direita) {
            if (array[i] <= array[j]) {
                tempo[k] = array[i];
                i++;
            } else {
                tempo[k] = array[j];
                j++;
            }
            k++;
        }
        while (i <= meio) {
            tempo[k] = array[i];
            i++;
            k++;
        }
        while (j <= direita) {
            tempo[k] = array[j];
            j++;
            k++;
        }
        for (k = 0; k < tempo.length; k++) {
            array[esquerda + k] = tempo[k];
        }
    }
}


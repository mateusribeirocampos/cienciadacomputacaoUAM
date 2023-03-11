package Ordenacao;
import java.util.Arrays;

public class Quick_sort {
    
    public static void main(String[] args) {
        int[] arr = { 9, 2, 4, 7, 3, 7, 10, 15, 102, 25, 53};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array ordenado pelo método Quick-Sort: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int esquerda, int direita) {
        if (esquerda < direita) {
            int pivoindice = partition(arr, esquerda, direita);
            quickSort(arr, esquerda, pivoindice - 1);
            quickSort(arr, pivoindice + 1, direita);
        }
    }

    public static int partition(int[] arr, int esquerda, int direita) {
        int pivo = arr[direita];
        int i = esquerda - 1;
        for (int j = esquerda; j < direita; j++) {
            if (arr[j] <= pivo) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[direita];
        arr[direita] = temp;
        return i + 1;
    }
}

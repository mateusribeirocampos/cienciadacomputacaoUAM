package Ordenacao;
import java.util.Arrays;

public class Merge_sort {

    public static void main(String[] args) {
        // Cria um array com valores desordenados
        int[] array = {9, 2, 4, 350, 7, 3, 7, 10, 200, 1054};

        // Ordena o array com o algoritmo Merge-Sort
        mergeSort(array, 0, array.length - 1);

        // Imprime o array ordenado
        System.out.println("Array ordenado pelo método Merge-Sort: ");
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] arr, int esquerda, int direita) {
        // Verifica se o array possui mais de um elemento
        if (esquerda < direita) {
            // Encontra o meio do array
            int meio = (esquerda + direita) / 2;
            // Chama o mergeSort recursivamente para as duas metades do array
            mergeSort(arr, esquerda, meio);
            mergeSort(arr, meio + 1, direita);
            // Faz a junção das duas metades ordenadas
            merge(arr, esquerda, meio, direita);
        }
    }

    public static void merge(int[] array, int esquerda, int meio, int direita) {
        // Cria um array temporário para guardar a junção das duas metades ordenadas
        int[] tempo = new int[direita - esquerda + 1];
        // Inicializa os índices dos subarrays a serem combinados
        int i = esquerda;
        int j = meio + 1;
        int k = 0;
        // Combina os subarrays ordenados em um único array ordenado
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
        // Copia os elementos restantes do subarray da esquerda para o array temporário
        while (i <= meio) {
            tempo[k] = array[i];
            i++;
            k++;
        }
        // Copia os elementos restantes do subarray da direita para o array temporário
        while (j <= direita) {
            tempo[k] = array[j];
            j++;
            k++;
        }
        // Copia o array temporário de volta para o array original
        for (k = 0; k < tempo.length; k++) {
            array[esquerda + k] = tempo[k];
        }
    }
}

package Ordenacao;
import java.util.Arrays;

public class Quick_sort {
    
    public static void main(String[] args) {
        int[] arr = { 9, 2, 4, 7, 3, 7, 10, 15, 102, 25, 53};

        // Chama o método quickSort para ordenar o array
        quickSort(arr, 0, arr.length - 1);

        // Exibe o array ordenado na tela
        System.out.println("Array ordenado pelo método Quick-Sort: ");
        System.out.println(Arrays.toString(arr));
    }

    // Método que implementa o algoritmo Quick-Sort
    public static void quickSort(int[] arr, int esquerda, int direita) {

        // Condição de saída da recursão: se esquerda >= direita, então o array já está ordenado
        if (esquerda < direita) {

            // Particiona o array e retorna o índice do pivô
            int pivoindice = partition(arr, esquerda, direita);

            // Chama quickSort recursivamente para a sublista à esquerda do pivô
            quickSort(arr, esquerda, pivoindice - 1);

            // Chama quickSort recursivamente para a sublista à direita do pivô
            quickSort(arr, pivoindice + 1, direita);
        }
    }

    // Método que particiona o array e retorna o índice do pivô
    public static int partition(int[] arr, int esquerda, int direita) {

        // Seleciona o último elemento como pivô
        int pivo = arr[direita];

        // i é o índice do elemento mais à esquerda da lista maior que o pivô
        int i = esquerda - 1;

        // Percorre o array
        for (int j = esquerda; j < direita; j++) {

            // Se o elemento atual é menor ou igual ao pivô, move-o para a sublista à esquerda do pivô
            if (arr[j] <= pivo) {

                // Incrementa i
                i++;

                // Troca o elemento atual com o elemento na posição i
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Troca o pivô com o elemento na posição i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[direita];
        arr[direita] = temp;

        // Retorna o índice do pivô
        return i + 1;
    }
}

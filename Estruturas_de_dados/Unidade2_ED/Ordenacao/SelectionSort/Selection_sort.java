package Ordenacao.SelectionSort;

public class Selection_sort {
    public static void sort(int[] vet) {
        int tam = vet.length;
        for (int i = 0; i < tam - 1; i++) {
            int min = i;
            for (int j = i + 1; j < tam; j++) {
                if (vet[j] < vet[min])
                    min = j;
            }
            int aux = vet[min];
            vet[min] = vet[i];
            vet[i] = aux;
        }
    }
}

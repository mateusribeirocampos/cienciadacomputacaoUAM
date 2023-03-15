package Ordenacao.SelectionSort.VideoAula;

public class Selection_sort {
    public static void sort(int[] vet) {
        int tam = vet.length;
        for (int i = 0; i < tam - 1; i++) {
            int min = i;
            System.out.println("Valor do min: " + min);
            for (int j = i + 1; j < tam; j++) {
                if (vet[j] < vet[min])
                    min = j;
                    System.out.println("Valor do min depois do if: " + min);
            }
            int aux = vet[min];
            vet[min] = vet[i];
            vet[i] = aux;
            System.out.println("Valor do aux: "+ aux);
            System.out.println("Valor do vetor min: " + vet[min]);
            System.out.println("Valor do vetor i: " + vet[i]);;
        }
    }
}

package Ordenacao.MergeSort.Ebook;

public class MergeSort {

    // Método que intercala dois subarrays de vetor[]
    public static void merge(int vetor[], int esq, int mei, int dir) {
        // Define o tamanho dos subarrays
        int n1 = mei - esq + 1;
        int n2 = dir - mei;

        // Cria os subarrays esquerda[] e direita[]
        int esquerda[] = new int[n1];
        int direita[] = new int[n2];

        // Copia os elementos dos subarrays correspondentes do vetor original para os subarrays esquerda[] e direita[]
        for (int i = 0; i < n1; i++)
            esquerda[i] = vetor[esq + i];
        for (int j = 0; j < n2; j++)
            direita[j] = vetor[mei + 1 + j];

        // Intercala os subarrays esquerda[] e direita[] para o vetor[]
        int i = 0, j = 0;
        int a = esq;
        while ((i < n1) && (j < n2)) {
            if (esquerda[i] <= direita[j]) {
                vetor[a] = esquerda[i];
                i++;
            } else {
                vetor[a] = direita[j];
                j++;
            }
            a++;
        }

        // Copia os elementos restantes do subarray esquerda[], se houver
        while (i < n1) {
            vetor[a] = esquerda[i];
            i++;
            a++;
        }

        // Copia os elementos restantes do subarray direita[], se houver
        while (j < n2) {
            vetor[a] = direita[j];
            j++;
            a++;
        }
    }

    // Método principal que implementa o MergeSort
    public void sort(int vetor[], int esq, int dir) {
        if (esq < dir) {
            // Encontra o meio do vetor
            int mei = (esq + dir )/ 2;

            // Ordena a metade esquerda do vetor
            sort(vetor, esq, mei);

            // Ordena a metade direita do vetor
            sort(vetor, mei + 1, dir);

            // Intercala as duas metades para obter o vetor ordenado final
            merge(vetor, esq, mei, dir);
        }
    }

    // Método que imprime o vetor
    public static void mostraVetor(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            if (i == vetor.length - 1) {
                System.out.print(vetor[i] + " }");
            } else {
                System.out.print(vetor[i] + ", ");
            }
        }
    }

    // Método principal para testar a ordenação do MergeSort
    public static void main(String[] args) {
        int[] vetor = { 5, 3, 8, 2, 6 };

        // Imprime o vetor desordenado
        System.out.print("Vetor desordenado: { ");
        mostraVetor(vetor);

        // Chama o MergeSort para ordenar o vetor
        MergeSort Ms = new MergeSort();
        Ms.sort(vetor, 0, vetor.length - 1);

        // Imprime o vetor ordenando
        System.out.println();
        System.out.print("Vetor ordenado pelo método Merge-Sort: { ");
        mostraVetor(vetor);
    }   
}

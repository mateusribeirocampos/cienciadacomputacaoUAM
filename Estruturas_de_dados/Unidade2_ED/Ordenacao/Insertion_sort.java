package Ordenacao;

class Main {

    public static void Insertion_sort(int vet[]) {
        int key, tam;
        tam = vet.length;

        for(int i = 1; i < tam; i++) {
            key = vet[i];
            int j = i - 1;

            while (j >= 0 && vet[j] > key) {
                vet[j + 1] = vet[j];
                j = j - 1; 
            }
            vet[j + 1] = key;
        }
    }
}
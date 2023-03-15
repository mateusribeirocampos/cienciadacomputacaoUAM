package Ordenacao.InsetionSort.VideoAula;

class Insertion_sort {

    public static void InsertionSortDados(int vet[]) {
        int key, tam;
        tam = vet.length;

        // Loop que itera a partir do segundo elemento do array até o último
        for(int i = 1; i < tam; i++) {
            key = vet[i]; // Armazena o valor atual do elemento sendo ordenado
            int j = i - 1;
            System.out.println("Key1: " + key);

            // Loop que compara a chave com os elementos anteriores e os move para a direita se forem maiores
            while (j >= 0 && vet[j] > key) {
                vet[j + 1] = vet[j];
                j = j - 1; 
            }
            
            // Insere a chave na posição correta
            vet[j + 1] = key;
        }
    }
}

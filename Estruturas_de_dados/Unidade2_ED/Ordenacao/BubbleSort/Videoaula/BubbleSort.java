package Ordenacao.BubbleSort.Videoaula;

public class BubbleSort {
    public static void bubble_sort(int vet[]) {
        boolean controle;
        int n = vet.length; // Armazena o tamanho do vetor em uma variável n
        for (int i = 0; i < n - 1; i++) { // Loop externo que percorre o vetor até o penúltimo elemento
            controle = true;
            System.out.println("valor do i: " + i);
            for (int j = 0; j < n - 1; j++) { // Loop interno que percorre o vetor até o penúltimo elemento não ordenado
                if (vet[j] > vet[j + 1]) { // Se o elemento atual é maior que o próximo, troca-os de posição
                    int aux = vet[j]; // Armazena o elemento atual em uma variável auxiliar
                    vet[j] = vet[j + 1]; // Substitui o elemento atual pelo próximo
                    vet[j + 1] = aux; // Substitui o próximo pelo elemento armazenado na variável auxiliar
                    System.out.println("Valor do aux: " + aux);
                    System.out.println("vetor j: " + vet[j]);
                    System.out.println("vetor j + 1: " + vet[j + 1]);
                    controle = false;

                }
            }
            if (controle) {
                break;
            }
        }
    }
}

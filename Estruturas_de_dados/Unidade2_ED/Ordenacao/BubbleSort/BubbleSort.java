package Ordenacao.BubbleSort;

public class BubbleSort {
    public static void bubble_sort(int vet[]) 
    {
        boolean controle;
        int n = vet.length; // Armazena o tamanho do vetor em uma variável n
        for(int i = 0; i < n - 1; i++){ // Loop externo que percorre o vetor até o penúltimo elemento
            controle = true;
            for(int j = 0; j < n - i - 1; j++) { // Loop interno que percorre o vetor até o penúltimo elemento não ordenado
                if(vet[j] > vet[j + 1]) { // Se o elemento atual é maior que o próximo, troca-os de posição
                    int aux = vet[j]; // Armazena o elemento atual em uma variável auxiliar
                    vet[j] = vet[j+1]; // Substitui o elemento atual pelo próximo
                    vet[j+1] = aux; // Substitui o próximo pelo elemento armazenado na variável auxiliar
                    controle = false;
                }
            }
            if(controle){
                break;
            }
        }
    }    
}

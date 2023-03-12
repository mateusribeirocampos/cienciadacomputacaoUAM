package Ordenacao.InsetionSort;

public class MainOrdenacao {
    public static void main(String[] args) {
        int numeros[] = { 2 , 1, 4, 3 };

        Insertion_sort.InsertionSortDados(numeros);
        
        //loop
        System.out.println("Array ordenado Selection-Sort:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}
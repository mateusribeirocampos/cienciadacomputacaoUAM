package Ordenacao.SelectionSort.VideoAula;

public class Selection {
    public static void main(String[] args) {
        int numeros[] = {3, 2, 1};


        Selection_sort.sort(numeros);

        //loop
        System.out.println("Array ordenado Selection-Sort:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}
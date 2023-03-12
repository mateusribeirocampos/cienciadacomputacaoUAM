package Ordenacao;

import Ordenacao.SelectionSort.Selection_sort;

public class MainOrdenacao {
    public static void main(String[] args) {
        int numeros[] = {5, 3, 7, 10, 33};


        Selection_sort.sort(numeros);

        //loop
        System.out.println("Array ordenado Selection-Sort:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}
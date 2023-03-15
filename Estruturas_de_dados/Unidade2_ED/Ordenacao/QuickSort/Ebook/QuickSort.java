package Ordenacao.QuickSort.Ebook;

public class QuickSort {
    public static void quickSort(int lista[], int esquerda, int direita) {
        int esq = esquerda; // guarda a posição esquerda da lista
        int dir = direita; // guarda a posição direita da lista
        int pivo = lista[(esq + dir / 2)]; // seleciona o pivo como o elemento central da lista
        int auxiliar;

        while (esq <= dir) { // enquanto esquerda for menor ou igual a direita
            while (lista[esq] < pivo) { // encontra o primeiro elemento maior ou igual ao pivo
                esq = esq + 1;
            }
            while (lista[dir] > pivo) { // encontra o primeiro elemento menor ou igual ao pivo
                dir = dir - 1;
            }
            if (esq <= dir) { // se esquerda ainda for menor ou igual a direita, troca de posição os elementos
                auxiliar = lista[esq];
                lista[esq] = lista[dir];
                lista[dir] = auxiliar;
                esq = esq + 1;
                dir = dir - 1;
            }
        }
        if (dir > esquerda) // se ainda houver elementos para a esquerda do pivo, chama o método recursivamente
            quickSort(lista, esquerda, dir);

        if (esq < direita) // se ainda houver elementos para a direita do pivo, chama o método recursivamente
            quickSort(lista, esq, direita);
    }

    public static void main(String[] args) {
        int[] lista = { 5, 3, 8, 2, 6 };

        System.out.print("Lista desordenada: { ");
        for (int i = 0; i < lista.length; i++) {
            if (i == (lista.length - 1)) {
                System.out.print(lista[i] + " }");
            }else{
                System.out.print(lista[i] + ", ");
            }
        }
        System.out.println(" ");
        System.out.print("Lista ordenada segundo o método Quick-sort: {");
        quickSort(lista, 0, lista.length - 1);
        for (int i = 0; i < lista.length; i++) {
            if (i == (lista.length - 1)) {
                System.out.print(lista[i] + " }");
            }else{
                System.out.print(lista[i] + ", ");
            }
        }


    }
}

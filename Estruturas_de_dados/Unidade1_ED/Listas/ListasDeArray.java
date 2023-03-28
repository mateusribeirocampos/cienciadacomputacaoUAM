package unidade1_ed.listas;

public class ListasDeArray {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2,}, {3}, {4, 5, 6}};

        System.out.println("Valores do Array 1 por linha: ");
        outputArray(array1);

        System.out.printf("\nValores do Array 2 por linha: \n");
        outputArray(array2);
    }

    public static void outputArray(int[][] array) {

        for(int linha = 0; linha < array.length; linha++) {

            for(int coluna = 0; coluna < array[linha].length; coluna++) {
                System.out.printf("%d ", array[linha][coluna]);
            }
            System.out.println();
        }
    }
}


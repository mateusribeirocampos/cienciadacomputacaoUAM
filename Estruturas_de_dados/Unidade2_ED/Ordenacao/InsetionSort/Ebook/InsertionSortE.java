package Ordenacao.InsetionSort.Ebook;

public class InsertionSortE {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 6};
        
        System.out.print("Array desordenado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println(" ");
        System.out.print("Array desordenado: { ");
        for (int i = 0; i < array.length; i++) {
            if(i == (array.length - 1)) {
                System.out.print(array[i] + " }");
            }else {
                System.out.print(array[i] + ", ");
            }
        }

        System.out.println(" ");

        for (int index = 0; index < array.length; index++) {
            int aux = array[index];
            int j = index - 1;
            System.out.println("index = " + index);
            System.out.println("auxbefor = " + aux);
            System.out.println("j = " + j);
            while ((j > -1) && (array[j] > aux)) {
                array[j + 1] = array[j];
                System.out.println("auxafter = " + aux);
                System.out.println("Array[j + 1] = " + array[j + 1]);
                System.out.println("Array[j] = " + array[j]);
                j--;
            }
            array[j + 1] = aux;
            System.out.println("ARRAY[j + 1] = " + array[j + 1]);
            System.out.println("AUX = " + aux);
            System.out.println("--------------------------------");
        }

        System.out.print("Array ordenado em insertion-sort = { ");
        for (int i = 0; i < array.length; i++) {
            if(i == (array.length - 1)) {
                System.out.print(array[i] + " }");
            }else{
                System.out.print(array[i] + ", ");
            }
        }


    }
}

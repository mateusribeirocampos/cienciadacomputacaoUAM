package Ordenacao;

public class RecursaoVetor {
    public static void main(String[] args) {
        int numeros[] = new int[5];

        numeros[0] = 5;
        numeros[1] = 3;
        numeros[2] = 7;
        numeros[3] = 10;
        numeros[4] = 33;

        recursao(numeros, numeros.length);
    }

    public static void recursao(int vetor[], int i) {
        System.out.println(vetor[i-1]);
        if(i==1) {
            return;
        }else {
        recursao(vetor, i - 1);
        }
    }
}

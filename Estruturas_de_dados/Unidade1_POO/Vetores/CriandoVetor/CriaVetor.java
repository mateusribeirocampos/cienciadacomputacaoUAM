package Vetores.CriandoVetor;

public class CriaVetor {
    public static void main(String[] args) {
        int vetor1[] = new int[100];
        int vetor2[] = new int[100];
        double vetor3[] = new double[100];

        //preenche o vetor 1 em ordem crescente
        for(int i = 0; i < 100; i++) {
            vetor1[i] = i + 1;
        }

        //preeche o vetor 2 em ordem descrente
        for(int i = 0; i < 100; i++) {
            vetor2[i] = 100 - i;
        }

        //Calcular a média dos valores dos vetores 1 e 2
        for(int i = 0; i < 100; i++) {
            vetor3[i] = (vetor1[i] + vetor2[i]) / 2.0;
        }

        //imprimir valores crescentes do vetor 1
        System.out.println("Valores do vetor 1:\n");
        for(int i = 0; i < 100; i++) {
            System.out.printf("Os valores do vetor1[%d] = %d\n", i, vetor1[i]);
        }
        System.out.println("\n");

        //imprimir valores decrescente do vetor 2
        System.out.println("Valores do vetor 2:\n");
        for(int i = 0; i < 100; i++) {
            System.out.printf("Os valores do vetor2[%d] = %d\n", i, vetor2[i]);
        }
        System.out.println("\n");

        //imprimir valores das medias do vetor 1 e 2 no vetor 3
        System.out.println("<==== Media dos valores dos vetores 1 e 2 no vetor 3 =====> \n");
        for(int i = 0; i < 100; i++) {
            System.out.printf("As medias dos vetores 1 e 2 [%d] = %.2f\n", i, vetor3[i]);
        }
    }
}   

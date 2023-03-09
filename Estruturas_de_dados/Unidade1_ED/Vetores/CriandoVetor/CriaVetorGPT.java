package Vetores.CriandoVetor;

public class CriaVetorGPT {
    public static void main(String[] args) {
        int vetor1[] = new int[100];
        int vetor2[] = new int[100];
        double vetor3[] = new double[100];

        // preenche o vetor 1 com os valores de 1 a 100 em ordem crescente
        for (int i = 0; i < 100; i++) {
            vetor1[i] = i + 1;
        }

        // preenche o vetor 2 com os valores de 100 a 1 em ordem decrescente
        for (int i = 0; i < 100; i++) {
            vetor2[i] = 100 - i;
        }

        // calcula a média dos valores dos vetores 1 e 2 e armazena no vetor 3
        for (int i = 0; i < 100; i++) {
            vetor3[i] = (vetor1[i] + vetor2[i]) / 2.0;
        }

        // exibe os valores dos vetores 1, 2 e 3
        System.out.println("Valores do vetor 1 em ordem crescente:");
        for (int i = 0; i < 100; i++) {
            System.out.print(vetor1[i] + " ");
        }
        System.out.println();

        System.out.println("Valores do vetor 2 em ordem decrescente:");
        for (int i = 0; i < 100; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println();

        System.out.println("Valores do vetor 3 (média dos valores dos vetores 1 e 2):");
        for (int i = 0; i < 100; i++) {
            System.out.print(vetor3[i] + " ");
        }
        System.out.println();
    }
}


package unidade1_ed.vetores;

public class UsoVetor {
    public static void main(String[] args) {
        int soma = 0;
        int vetor[] = new int[5];

        //inserindo os dados do vetor
        for(int i=0; i < 5; i++) {
            vetor[i] = i * 5;
        }

        //imprimindo os dados do vetor
        for(int i=0; i < 5; i++) {
            System.out.println(vetor[i]);
        }

        //percorrendo para calcular a soma de todos os valores do vetor
        for(int i=0; i < 5; i++) {
            soma = soma + vetor[i];
        }
        System.out.println("Soma dos numeros armazenado no vetor: " + soma);
    }
}
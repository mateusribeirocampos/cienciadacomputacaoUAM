package Atividade1.Escola; //Declaração do pacote em que a classe está
import java.util.Scanner; // importação da biblioteca do Java para leitura de dados do usuário

public class Alunos { 
    public static void main(String[] args) {
        String[] nomeAluno = new String[25]; // criação do array de strings para armazenar os nomes dos alunos
        Scanner lerNomeAlunoScanner = new Scanner(System.in); // criação do objeto Scanner para ler as entradas do usuário

        // Laço for para ler os nomes dos alunos e armazená-los no array
        for(int i = 0; i < nomeAluno.length; i++) { 
            System.out.print("Digite o nome do aluno " + (i + 1) + ": "); // solicitação do nome do aluno ao usuário
            nomeAluno[i] = lerNomeAlunoScanner.nextLine(); // armazenamento do nome do aluno no array na posição i
        }
        lerNomeAlunoScanner.close(); // notificação para fechar o objeto Scanner após a leitura

        // Impressão dos nomes dos alunos cadastrados
        System.out.println("\nOs alunos cadastrados sao: ");
        for(int i = 0; i < nomeAluno.length; i++) { // laço for para percorrer o array e imprimir os nomes dos alunos
            System.out.println((i + 1) + ". " + nomeAluno[i]); // impressão do nome do aluno na posição i
        }
    }
}
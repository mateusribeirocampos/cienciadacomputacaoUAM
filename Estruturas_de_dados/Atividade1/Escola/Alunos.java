package Atividade1.Escola;

import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {
        String[] nomeAluno = new String[25];

        Scanner lerNomeAlunoScanner = new Scanner(System.in);

        for(int i = 0; i < nomeAluno.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomeAluno[i] = lerNomeAlunoScanner.nextLine();
        }
        lerNomeAlunoScanner.close();

        System.out.println("\nOs alunos cadastrados sao: ");
        for(int i = 0; i < nomeAluno.length; i++) {
            System.out.println((i + 1) + ". " + nomeAluno[i]);
        }
    }
}
package Atividade1.Escola1;

import java.util.Scanner; // Importa a classe Scanner para permitir entrada de dados
import java.util.ArrayList; // Importa a classe ArrayList para permitir a criação de um array dinâmico

public class Alunos { 
    public static void main(String[] args) {
        ArrayList<String> nomeAluno = new ArrayList<String>(); // Cria um ArrayList para armazenar os nomes dos alunos
        Scanner lerNomeAlunoScanner = new Scanner(System.in); // Cria um objeto da classe Scanner para permitir entrada de dados do usuário

        for(int i = 0; i < 25; i++) { // Loop para ler os 25 nomes dos alunos
            System.out.print("Digite o nome do aluno " + (i + 1) + ": "); // Exibe mensagem para o usuário inserir o nome do aluno
            nomeAluno.add(lerNomeAlunoScanner.nextLine()); // Adiciona o nome do aluno no ArrayList
        }

        System.out.println("\nOs alunos cadastrados sao: "); // Exibe mensagem informando que a listagem dos alunos irá ser exibida

        for(int i = 0; i < nomeAluno.size(); i++) { // Loop para exibir a lista de alunos cadastrados
            System.out.println((i + 1) + ". " + nomeAluno.get(i)); // Exibe o número do aluno e o seu nome
        }
    }
}


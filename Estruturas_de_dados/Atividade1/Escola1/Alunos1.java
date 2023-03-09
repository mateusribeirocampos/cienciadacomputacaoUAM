package Atividade1.Escola1; //Declaração do pacote em que a classe está
import java.util.ArrayList; //Importação da classe ArrayList
import java.util.Scanner; //Importação da classe Scanner

public class Alunos1 { //Declaração da classe

    public static void main(String[] args) { //Declaração do método principal da classe

        ArrayList<String> nomeAluno = new ArrayList<String>(); //Criação de um objeto ArrayList para armazenar os nomes dos alunos
        Scanner lerNomeAlunoScanner = new Scanner(System.in); //Criação de um objeto Scanner para ler o nome dos alunos

        //cadastro dos 25 alunos
        for(int i = 0; i < 25; i++) { //Laço para cadastrar os 25 alunos
            System.out.print("Digite o nome do aluno " + (i + 1) + ": "); //Exibe a mensagem para o usuário digitar o nome do aluno
            nomeAluno.add(lerNomeAlunoScanner.nextLine()); //Adiciona o nome do aluno ao ArrayList
        }

        //cadastro dos 5 novos alunos
        for(int i = 0; i < 5; i++) { //Laço para cadastrar os 5 novos alunos
            System.out.print("Digite o nome do novo aluno " + (i + 1) + ": "); //Exibe a mensagem para o usuário digitar o nome do novo aluno
            nomeAluno.add(lerNomeAlunoScanner.nextLine()); //Adiciona o nome do novo aluno ao ArrayList
        }

        lerNomeAlunoScanner.close(); //Fecha o objeto Scanner

        System.out.println("\nOs alunos cadastrados sao: "); //Exibe a mensagem informando que serão exibidos os alunos cadastrados
        for(int i = 0; i < nomeAluno.size(); i++) { //Laço para exibir os alunos cadastrados
            System.out.println((i + 1) + ". " + nomeAluno.get(i)); //Exibe o número e o nome do aluno
        }
    }
}
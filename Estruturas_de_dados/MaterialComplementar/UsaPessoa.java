package MaterialComplementar;

import java.util.ArrayList;
import java.util.Scanner;

public class UsaPessoa {
    public static void main(String[] args) {
        /*Pessoa p1 = new Pessoa("Mateus", 30);
        Pessoa p2 = new Pessoa(Joao, 25);
        System.out.println(p1);*/

        Scanner leia = new Scanner(System.in);
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

        char controle  = 's';
        do {
            System.out.println("Digite o nome: ");
            String n = leia.next();
            System.out.println("Digite a idade: ");
            int i = leia.nextInt();
            Pessoa p = new Pessoa(n, i);
            lista.add(p);
            System.out.println("Deseja cadastrar outra pessoa. S para sim.");
            controle = leia.next().charAt(0);
        } while (controle == 's' || controle == 'S');

        leia.close();

        /*for (Pessoa i : lista) {
            System.out.println(i);
        }

        System.out.println();
        String nome = lista.get(0).getNome();
        int idade = lista.get(0).getIdade();

        System.out.println("Nome: " + nome + "idade: " + idade);*/

        //pegar todos os nomes inseridos no array
        for (int i = 0; i < lista.size(); i++) {
            String nome = lista.get(i).getNome();
            int idade = lista.get(i).getIdade();
    
            System.out.println("Nome: " + nome + ", idade: " + idade);
        }
    }
}

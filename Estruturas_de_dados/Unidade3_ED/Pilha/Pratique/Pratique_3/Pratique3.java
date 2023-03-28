package unidade3_ed.Pilha.Pratique.Pratique_3;

import java.util.Stack;  // Importa a classe Stack da biblioteca padrão do Java
import java.util.Collections;
import java.util.Random;  // Importa a classe Random da biblioteca padrão do Java


public class Pratique3 {
    public static void main(String[] args) {
        Stack<Integer> x1 = new Stack<>(); // Cria um novo Stack de Integer chamado x1
        Stack<Integer> x2 = new Stack<>(); // Cria um novo Stack de Integer chamado x2
    
        Random Numero_aleatorio = new Random(); // Cria um novo objeto Random

        // Preenche o Stack x1 com números de 0 a 100 sem repetição
        for (int i = 0; i < 100; i++) {
            if(!x1.contains(i))
            x1.push(i); // Adiciona o número i ao Stack x1
        }

       // Embaralha os elementos do Stack x1
        for (int index = x1.size() - 1; index > 0; index--) {
            int j = Numero_aleatorio.nextInt(index + 1); // Gera um número aleatório entre 0 e index (inclusive)
            int aux = x1.get(index); // Armazena o elemento atual na variável auxiliar aux
            x1.set(index, x1.get(j)); // Troca o elemento atual com o elemento na posição j
            x1.set(j, aux); // Troca o elemento na posição j com o elemento armazenado em aux            
        }
        System.out.println("Total de numeros gerados: " + x1.size());
        System.out.println("Numeros de 0 a 100 desordenados em x1: " + x1);

        System.out.println();
        //Armazenar os valores da pilha x1 para pilha x2
        x2.addAll(x1);

        System.out.println("Elementos do x1: " + x1);
        System.out.println();
        System.out.println("Elementos do x2: " + x2);

        //ordenar os valores da pilha x2
        Collections.sort(x2);

        System.out.println("Elementos do x1 desordenados: " + x1);
        System.out.println();
        System.out.println("Elementos do x2 ordenados: " + x2);

    }
}

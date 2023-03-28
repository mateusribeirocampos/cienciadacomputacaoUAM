package estruturas_de_dados.unidade3_ed.pilha;

import java.util.Random;
import java.util.Stack;

public class Expilha {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<Integer>();

        Random gerador = new Random(10);

        for (int index = 0; index < 10; index++) {
            System.out.println("Inserindo numeros aleatorios na pilha: " + pilha.push(gerador.nextInt(10)));
        }


        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println();
        pilha.add(6); //adiciona na o valor 6 na útima posição
        System.out.println("ADD: " + pilha);
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println();
        pilha.pop(); //remove o valor da última posição
        System.out.println("POP: " + pilha);
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println();
        pilha.push(200); //push adiciona o valor 5 na última posição
        System.out.println("PUSH: " + pilha);
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println();
        pilha.remove(2); //remove o valor da posição 2
        System.out.println("REMOVE 2: " + pilha);
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println();
        pilha.remove(Integer.valueOf(4)); //remove o valor 4 da lista criada
        System.out.println("REMOVE 4: " + pilha);
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println();
        pilha.contains(12); //Verifica se contem o valor 12 na lista
        System.out.println("CONTEM o Valor 12: " + pilha);
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println();
        boolean contemValor = pilha.contains(12);
        System.out.println("true or false - contem valor 12: " + contemValor);
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println();
        pilha.peek();
        System.out.println("PEEK (retorna o maior valor da pilha): " + pilha.peek()); 
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println();
        //pilha.isEmpty();
        //System.out.println("VAZIO: " + pilha);
        pilha.capacity();
        System.out.println("CAPACIDADE (capacidade da pilha): " + pilha.capacity());
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println();
        pilha.addElement(111); //adiciona o valor 111 no final da lista
        System.out.println("ADDElement o valor 111 no final da lista: " + pilha);
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("CAPACIDADE FINAL DA PILHA: " + pilha.capacity());

    }
}

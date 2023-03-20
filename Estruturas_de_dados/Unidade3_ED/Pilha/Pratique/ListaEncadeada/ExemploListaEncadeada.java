package Unidade3_ED.Pilha.Pratique.ListaEncadeada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ExemploListaEncadeada {

    public static void main(String[] args) {
        Random rand = new Random(); // cria um objeto Random para gerar números aleatórios
        
        int tamanhoX1 = 100; // define o tamanho da estrutura de dados sequencial X1
        
        List<Integer> generated = new ArrayList<Integer>(); // cria uma lista para armazenar os números gerados
        
        // gera números aleatórios únicos entre 0 e 100 e adiciona à lista
        while (generated.size() < tamanhoX1) {
            Integer next = rand.nextInt(101);
            if (!generated.contains(next)) {
                generated.add(next);
            }
        }
        
        int[] x1 = generated.stream().mapToInt(Integer::intValue).toArray(); // converte a lista em um array de inteiros
        
        System.out.println("Estrutura sequencial desordenada de x1:");

        // exibe os elementos do array x1
        for (int i = 0; i < tamanhoX1; i++) {
            System.out.print(x1[i] + " ");
        }
        
        List<Integer> x2 = new ArrayList<Integer>(); // cria uma lista encadeada X2
        
        // insere os elementos de x1 na lista encadeada X2
        for (int i = 0; i < x1.length; i++) {
            x2.add(x1[i]);
        }
        
        Collections.sort(x2); // ordena os elementos da lista encadeada X2
        
        System.out.println("\nEstrutura encadeada ordenada de x2:");

        // exibe os elementos da lista encadeada X2 ordenada
        for (Integer element : x2) {
            System.out.print(element + " ");
        }
    }
}

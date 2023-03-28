package estruturas_de_dados.unidade3_ed.pilha.Pratique.ListaEncadeada;

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
        // converte a lista em um array de inteiros
        int[] x1 = new int[generated.size()];
        for (int i = 0; i < generated.size(); i++) {
            x1[i] = generated.get(i).intValue();
        }
        /* Tudo o que foi escrito acima pode ser abreviado dessa forma
        int[] x1 = generated.stream().mapToInt(Integer::intValue).toArray(); //converte a lista em um array de inteiros
        método "stream()" é chamado na lista "generated". Esse método cria um fluxo de elementos a partir da lista, permitindo o uso de oprerações de processamento de fluxo.
        O método "mapToInt() é chamado no fluxo de elementos. esse método converte cada elemento do fluxo em um número inteiro (tipo "int"), usando a expressão lambda "Integer::intValue". A expressão lambda é uma abreviação para uma função que converte um objeto do tipo "Interger" em um "int.
        O método "toArray() é chamado no fluxo de elementos. Esse método converte o fluxo de elementos em um array de inteiros O resultado da conversão é armazenado na variável "x1.*/

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
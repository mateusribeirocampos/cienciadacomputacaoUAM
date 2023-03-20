package Unidade3_ED.Formato_Dinamico;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ExLista_Collection {
    public static void main(String[] args) {
        // Cria uma nova lista utilizando a classe Vector e define o tipo de elemento
        // como Integer
        List<Integer> lista = new Vector<Integer>();

        // Adiciona uma lista de elementos à lista principal
        List<Integer> lista2 = Arrays.asList(1, 2, 3, 4, 5);
        lista.addAll(lista2);
        System.out.println("Lista2 adicionada: "+ lista);

        // Adiciona o valor 5 ao final da lista
        lista.add(5);
        System.out.println("Valor 5 adicionado no final da lista2: " + lista);

        // Remove o elemento na posição 0 da lista, ou seja, o primeiro elemento
        lista.remove(0);
        System.out.println("Remove do elemento 0 da lista2: " + lista);

        // Remove o elemento que possui o valor 4 da lista, se ele existir
        // lista.remove(new Integer(4));
        lista.remove(Integer.valueOf(4));
        System.out.println("Remove o valor 4 da lista2: " + lista);

        //Verifica se a lista contém o valor/elemento 5
        lista.contains(Integer.valueOf(5));
        System.out.println("Verifica se o valor 5 está na lista: " + lista);

        // Verifica se a lista contém o elemento que possui o valor 5 e retorna true ou
        // false
        boolean ContenValor = lista.contains(Integer.valueOf(5));
        System.out.println("verificar-se (true or false) contem o valor 5: " + ContenValor);
    }
}

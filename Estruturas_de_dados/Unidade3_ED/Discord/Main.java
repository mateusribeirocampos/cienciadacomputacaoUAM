package estruturas_de_dados.unidade3_ed.discord;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        // List
        List<Integer> list = new ArrayList<>(5);
        showList(list, Arrays.asList(1, 2, 3, 4, 5)); // chama a função que mostra como funciona uma lista

        // Deque
        Deque<Integer> deque = new ArrayDeque<>(5);
        showDeque(deque, Arrays.asList(1, 2, 3, 4, 5)); // chama a função que mostra como funciona um deque

        // Queue
        Queue<Integer> queue = new PriorityQueue<>(10);
        showQueue(queue, Arrays.asList(1, 2, 3, 4, 5)); // chama a função que mostra como funciona uma fila

        // List
        showList(list, Arrays.asList(6, 7, 8, 9, 10)); // chama a função que mostra como funciona uma lista com novos
                                                       // números

        // Deque
        showDeque(deque, Arrays.asList(6, 7, 8, 9, 10)); // chama a função que mostra como funciona um deque com novos
                                                         // números

        // Queue
        showQueue(queue, Arrays.asList(6, 7, 8, 9, 10)); // chama a função que mostra como funciona uma fila com novos
                                                         // números
    }

    private static void showList(List<Integer> list, List<Integer> numbers) {
        System.out.println("Adicionando numeros a lista.");
        numbers.forEach(list::add); // adiciona os números passados como argumento à lista
        System.out.println(list); // imprime a lista

        System.out.printf("%n----------------------------%n");
        System.out.printf("Removendo os dados da Lista.");
        System.out.printf("%n----------------------------%n");

        while (Boolean.FALSE.equals(list.isEmpty())) { // enquanto a lista não estiver vazia
            System.out.printf("%nLista: %s%n", list);
            list.remove(0); // remove o primeiro elemento da lista
        }

        System.out.println(list); // imprime a lista vazia
        System.out.printf("%n----------------------------%n");
    }

    private static void showDeque(Deque<Integer> deque, List<Integer> numbers) {
        System.out.println("Adicionando numeros a pilha.");
        numbers.forEach(deque::addFirst); // adiciona os números passados como argumento ao topo do deque
        System.out.println(deque); // imprime o deque

        System.out.printf("%n----------------------------%n");
        System.out.printf("Removendo os dados da pilha.");
        System.out.printf("%n----------------------------%n");

        while (Boolean.FALSE.equals(deque.isEmpty())) { // enquanto o deque não estiver vazio
            System.out.printf("%nPilha: %s%n", deque);
            deque.removeLast(); // remove o último elemento do deque
        }

        System.out.println(deque); // imprime o deque vazio
        System.out.printf("%n----------------------------%n");
    }

    private static void showQueue(Queue<Integer> queue, List<Integer> numbers) {
        // Queue
        System.out.println("Adicionando numeros a fila.");
        numbers.forEach(queue::add); // adiciona os números passados como argumento ao final da fila
        System.out.println(queue); // imprime a fila

        // imprime uma mensagem indicando que os dados da fila serão removidos
        System.out.printf("%n----------------------------%n");
        System.out.printf("Removendo os dados da fila");
        System.out.printf("%n----------------------------%n");

        // enquanto a fila não estiver vazia, remove o primeiro elemento e imprime a
        // fila atualizada
        while (Boolean.FALSE.equals(queue.isEmpty())) {
            System.out.printf("%nFila: %s%n", queue);
            queue.poll();
        }

        // imprime a fila vazia após ter removido todos os elementos
        System.out.println(queue);
        System.out.printf("%n----------------------------%n");
    }
}
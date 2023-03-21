/******************************************************************************************************************************
Implemente um projeto no qual serão inseridos números de forma ordenada, e que atenda as especificações a seguir: 
 
Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células; 
Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista; 
Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células); 
Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista; 
Passo 5: Repita os passos 2 e 3. 
Passo 6: Exiba todos os números que foram inseridos na fila. 
 
Analise a ordem dos números exibidos e verifique se estão na mesma forma que foram inseridos. Se a exibição foi diferente, justifique o ocorrido. 
******************************************************************************************************************************/

package Atividade3.Projeto;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ListaPilhaFila {
    public static void main(String[] args) {

        // Passo1: Lista com numeros de 1 a 5
        int[] listaNumero = { 1, 2, 3, 4, 5 };

        // Cria uma pilha
        Stack<Integer> pilhaNumero = new Stack<>();

        // Cria uma fila
        Queue<Integer> filaNumero = new LinkedList<>();

        // Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista;
        for (int i = listaNumero.length - 1; i >= 0; i--) {
            pilhaNumero.push(listaNumero[i]);
        }

        // imprimindo lista
        System.out.print("lista: {");
        for (int i = 0; i < listaNumero.length; i++) {
            if (i == (listaNumero.length - 1)) {
                System.out.println(listaNumero[i] + "}");
            } else {
                System.out.print(listaNumero[i] + ", ");
            }
        }

        // Imprimindo pilha
        System.out.println("Pilha: " + pilhaNumero);

        // Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células
        filaNumero.addAll(pilhaNumero); // Seria adicionado da ordem inversa como está na pilha
  
        // Imprimindo fila
        System.out.println("Fila: " + filaNumero);

        // Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista;
        filaNumero.offer(6);
        filaNumero.offer(7);
        filaNumero.offer(8);
        filaNumero.offer(9);
        filaNumero.offer(10);

        System.out.println("Fila com 10 elementos: " + filaNumero);
        System.out.println("Numero de elementos na fila: " + filaNumero.size());

        System.out.println();
        // Passo 5: Repita os passos 2 e 3.
        // Repetindo o passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista;
        for (int i = listaNumero.length - 1; i >= 0; i--) {
            pilhaNumero.push(listaNumero[i]);
        }

        // imprimindo lista
        System.out.print("lista apos repeticao: {");
        for (int i = 0; i < listaNumero.length; i++) {
            if (i == (listaNumero.length - 1)) {
                System.out.println(listaNumero[i] + "}");
            } else {
                System.out.print(listaNumero[i] + ", ");
            }
        }

        // Imprimindo pilha
        System.out.println("Pilha apos repeticao: " + pilhaNumero);

        // Repetindo o passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células
        filaNumero.addAll(pilhaNumero); // Seria adicionado da ordem inversa como está na pilha

        // Imprimindo fila
        System.out.println("Fila apos repeticao: " + filaNumero);       
        System.out.println("Numero de elementos na fila apos repeticao: " + filaNumero.size());
    }
}

// Define o pacote onde esta classe Main está localizada
package unidade3_ed.AlocEstatic;

// Definição da classe Main
public class Main {
    // Método principal da classe Main que será executado quando o programa for
    // iniciado
    public static void main(String[] args) {

        // Cria uma nova instância da classe Lista com tamanho máximo de 5 elementos
        Lista lista = new Lista(5);

        // Loop que insere 5 números na lista e a imprime a cada iteração
        for (int i = 0; i < 5; i++) {

            // Insere o número atual do loop na lista
            lista.inserir(i);

            // Imprime a lista atual após a inserção do número atual
            lista.imprimir();
        }
    }
}

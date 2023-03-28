package unidade3_ed.AlocEstatic;

public class Lista {
    // Declaração do array que irá armazenar a lista
    private final int Lista[];

    // Construtor da classe, que recebe um inteiro "max" indicando o tamanho máximo da lista
    Lista(int max) {
        // Cria um novo array de inteiros com o tamanho especificado
        Lista = new int[max];
    }

    // Variável privada que armazena a posição do último elemento inserido na lista
    private int pos = 0;

    // Método que insere um novo elemento na lista
    public void inserir(int aux) {
        // Insere o novo elemento na posição "pos" do array
        Lista[pos] = aux;
        // Incrementa a variável "pos" para apontar para a próxima posição livre na lista
        pos++;

        // Se a variável "pos" alcançou o final do array, volta para o começo
        if (pos >= Lista.length)
            pos = 0;
    }

    // Método que remove um elemento da lista
    public void remover(int aux) {
        // Define o elemento na posição "aux" como 0, o que o remove da lista
        Lista[aux] = 0;
    }

    // Método que edita um elemento na lista
    public void editar(int posaux, int aux) {
        // Altera o valor do elemento na posição "posaux" para o valor "aux"
        Lista[posaux] = aux;
    }

    // Método que imprime todos os elementos
    public void imprimir() {
        for (int i = 0; i < Lista.length; i++) {
            System.out.println(Lista[i]);
        }
    }
}



package unidade3_ed.Ebook.FilaEbook;

public class MainFila {
    public static void main(String[] args) {
        FilaPessoa fila = new FilaPessoa(null, null);

        // Criação de novas pessoas
        Pessoa pessoa1 = new Pessoa("João", "123.456.789-00");
        Pessoa pessoa2 = new Pessoa("Maria", "987.654.321-00");
        Pessoa pessoa3 = new Pessoa("Pedro", "111.222.333-44");

        // Adiciona as pessoas na fila
        fila.enfileira(pessoa1);
        fila.enfileira(pessoa2);
        fila.enfileira(pessoa3);

        // Imprime as pessoas
        fila.imprimirPessoas();

        // Obtem a posição de uma pessoa na fila
        fila.obtemPosicao(pessoa2); // Deve imprimir "A pessoa está na posicao 2 da fila"

        // Remove uma pessoa da fila
        fila.desenfileira(pessoa2);

        // Obtem a posição da mesma pessoa na fila após a remoção
        fila.obtemPosicao(pessoa1); // Deve imprimir "A pessoa não está na fila."
    }
}

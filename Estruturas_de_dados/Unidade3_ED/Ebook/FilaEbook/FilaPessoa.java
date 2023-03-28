package estruturas_de_dados.unidade3_ed.ebook.filaebook;

public class FilaPessoa {
    private Pessoa primeiraDaFila;
    private Pessoa ultimaDaFila;

    //Construtor
    public FilaPessoa(Pessoa primeiraDaFila, Pessoa ultimaDaFila) {
        // Esses parâmetros não são usados, portanto, essa implementação é inútil.
        // O correto seria criar um construtor vazio ou utilizar os parâmetros para inicializar
        // a fila com as pessoas já existentes.
        this.primeiraDaFila = null;
        this.ultimaDaFila = null;
    }

    //Getter e setter
    public Pessoa getPrimeiraDaFila() {
        return primeiraDaFila;
    }

    public void setPrimeiraDaFila(Pessoa primeiraDaFila) {
        this.primeiraDaFila = primeiraDaFila;
    }
    
    public Pessoa getUltimaDaFila() {
        return ultimaDaFila;
    }

    public void setUltimaDaFila(Pessoa ultimaDaFila) {
        this.ultimaDaFila = ultimaDaFila;
    }

    public void enfileira(Pessoa novaPessoa) {
        if (ultimaDaFila == null) {
            // Se a fila está vazia, a nova pessoa se torna a primeira e a última da fila.
            primeiraDaFila = novaPessoa;
            ultimaDaFila = novaPessoa;
        } else {
            // Caso contrário, a nova pessoa é adicionada ao final da fila e se torna a nova última pessoa.
            ultimaDaFila.setProximo(novaPessoa);
            ultimaDaFila = novaPessoa;
        }
    }

    public void desenfileira(Pessoa umaPessoa) {
        if (primeiraDaFila != null) {
            // Se a fila não está vazia, a primeira pessoa é removida.
            primeiraDaFila = primeiraDaFila.getProximo();
            if (primeiraDaFila == null) {
                // Se a fila ficar vazia após a remoção, a última pessoa é atualizada para null.
                ultimaDaFila = null;
            }
        }
    }

    public void obtemPosicao(Pessoa umaPessoa){
        Pessoa atual = primeiraDaFila;
        int posicao = 0;
        while (atual != null && atual != umaPessoa) {
            // Percorre a fila até encontrar a pessoa desejada ou até o final da fila.
            atual = atual.getProximo();
            posicao++;
        }
        if (atual == null) {
            System.out.println("A pessoa não está na fila.");
        } else {
            System.out.println("A pessoa está na posicao " + posicao + " da fila");
        }
    }

    public void imprimirPessoas() {
        Pessoa atual = primeiraDaFila;
        while (atual != null) {
            System.out.println("Nome: " + atual.getNome() + " - CPF" + atual.getCpf());
            atual = atual.getProximo();
        }
    }
}

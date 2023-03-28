package unidade4_ed.ebook.storage;

public class NoArvoreBinario {
    private String informacao; //informação armazenada no nó
    private NoArvoreBinario filhoEsquerda; //referência para o nó filho esquerdo
    private NoArvoreBinario filhoDireita; //referência para o nó filho direito

    //construtor da classe, recebe a informação do nó e as referências para os nós filhos esquerdo e direito
    public NoArvoreBinario(String informacao, NoArvoreBinario filhoEsquerda, NoArvoreBinario filhoDireita) {
        this.informacao = informacao;
        this.filhoEsquerda = null; //inicializa a referência para o filho esquerdo como nula
        this.filhoDireita = null; //inicializa a referência para o filho direito como nula
    }
    
    //método getter para a informação do nó
    public String getInformacao() {
        return informacao;
    }
    
    //método setter para a informação do nó
    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }
    
    //método getter para a referência do nó filho esquerdo
    public NoArvoreBinario getFilhoEsquerda() {
        return filhoEsquerda;
    }
    
    //método setter para a referência do nó filho esquerdo
    public void setFilhoEsquerda(NoArvoreBinario filhoEsquerda) {
        this.filhoEsquerda = filhoEsquerda;
    }
    
    //método getter para a referência do nó filho direito
    public NoArvoreBinario getFilhoDireita() {
        return filhoDireita;
    }
    
    //método setter para a referência do nó filho direito
    public void setFilhoDireita(NoArvoreBinario filhoDireita) {
        this.filhoDireita = filhoDireita;
    }

    public void imprimir() {
        System.out.println(informacao);
    }
}

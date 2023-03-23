package Unidade4_ED.Ebook.Genealogia;

public class NoArvore {
    private Pessoa pessoa; //informação armazenada no nó
    private NoArvore filhoEsquerda; //referência para o nó filho esquerdo
    private NoArvore filhoDireita; //referência para o nó filho direito

    //método getter para a informação do nó
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
   
    //método getter para a referência do nó filho esquerdo
    public NoArvore getFilhoEsquerda() {
        return filhoEsquerda;
    }
    
    //método setter para a referência do nó filho esquerdo
    public void setFilhoEsquerda(NoArvore filhoEsquerda) {
        this.filhoEsquerda = filhoEsquerda;
    }
    
    //método getter para a referência do nó filho direito
    public NoArvore getFilhoDireita() {
        return filhoDireita;
    }
    
    //método setter para a referência do nó filho direito
    public void setFilhoDireita(NoArvore filhoDireita) {
        this.filhoDireita = filhoDireita;
    }

    public static void imprimirPessoasArvore(NoArvore node) {
        if (node != null) {
            Pessoa pessoa = node.getPessoa();
            System.out.println("Nome: " + pessoa.getNome() + 
            ", CFP: " + pessoa.getCpf() + 
            ", data de Nascimento: " + pessoa.getDataNascimento() + 
            " e idade: " + pessoa.calcularIdade());
            imprimirPessoasArvore(node.getFilhoEsquerda());
            imprimirPessoasArvore(node.getFilhoDireita());
        }
    }
}

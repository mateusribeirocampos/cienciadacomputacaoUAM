package Unidade3_ED.Ebook.FilaEbook;

public class Pessoa {
    private String nome;
    private String cpf;
    private Pessoa proximo;

    //Contrutor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.proximo = null;
    }

    //Getter e Setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa getProximo() {
        return proximo;
    }
    public void setProximo(Pessoa proximo) {
        this.proximo = proximo;
    }
}

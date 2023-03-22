package Unidade3_ED.Ebook.PilhaEbook;

public class Pizza {
    private String nomeDestinatario;
    private String enderecoDestinatario;
    private Pizza prox;

    //contrutor
    public Pizza(String nomeDestinatario, String enderecoDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
        this.enderecoDestinatario = enderecoDestinatario;
        this.prox = null;
    }

    //Getter e setter
    public String getNomeDestinatario() {
        return nomeDestinatario;
    }
    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }
    public String getEnderecoDestinatario() {
        return enderecoDestinatario;
    }
    public void setEnderecoDestinatario(String enderecoDestinatario) {
        this.enderecoDestinatario = enderecoDestinatario;
    }
    public Pizza getProx() {
        return prox;
    }
    public void setProx(Pizza prox) {
        this.prox = prox;
    }
}

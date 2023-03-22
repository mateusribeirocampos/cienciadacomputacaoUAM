package Unidade3_ED.Ebook.PilhaEbook;

public class PilhaEntregaPizza {
    private Pizza topoPilha;

    // Construtor da classe
    public PilhaEntregaPizza(Pizza topoPilha) {
        this.topoPilha = topoPilha;
    }

    // getter e setter
    public Pizza getTopoPilha() {
        return topoPilha;
    }

    public void setTopoPilha(Pizza topoPilha) {
        this.topoPilha = topoPilha;
    }

    // metodos
    public void insereTopo(Pizza novaPizza) {
        if (topoPilha == null) {
            topoPilha = novaPizza;
        } else {
            novaPizza.setProx(topoPilha);
            topoPilha = novaPizza;
        }
    }

    public void retiraTopo() {
        if (topoPilha != null)
            topoPilha = topoPilha.getProx();
    }

    public boolean estaVazia() {
        return topoPilha == null;
    }

    public void ImprimirPizza() {
        Pizza atual = topoPilha;
        while (atual != null) {
            System.out.println("Nome do Destinário: " + atual.getNomeDestinatario() + ", Endereco: "
                    + atual.getEnderecoDestinatario());
            atual = atual.getProx();
        }
    }
}

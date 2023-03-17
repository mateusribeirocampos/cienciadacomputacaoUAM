package POO.Herança_Multipla.Loja_prod;

public class Pilha extends Produto {
    private boolean recarregavel;

    //Construtor
    public Pilha(int codigo, double valor, boolean recarregavel) {
        super(codigo, valor);
        this.recarregavel = recarregavel;
    }
}

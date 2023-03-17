package POO.Herança_Multipla.Override;

public class Pilha extends Produto {
    private boolean recarregavel;

    //Construtor
    public Pilha(int codigo, double valor, boolean recarregavel) {
        super(codigo, valor);
        this.recarregavel = recarregavel;
    }

    //Método
    public boolean getRecarregavel() {
        return this.recarregavel;
    }

    public void setRecarregavel(boolean recarregavel) {
        this.recarregavel = recarregavel;
    }
    //Reestrita unando o @Override
    @Override
    public boolean precoCaro() {
        return getValor() > 15;
    }
}

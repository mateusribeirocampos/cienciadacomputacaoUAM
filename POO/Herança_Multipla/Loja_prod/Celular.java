package POO.Herança_Multipla.Loja_prod;

public class Celular extends Produto {
    private int memoria;

    //Contrutor
    public Celular(int codigo, double valor, int memoria) {
        super(codigo, valor);
        this.memoria = memoria;
    }
}

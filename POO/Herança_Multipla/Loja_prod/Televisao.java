package POO.Herança_Multipla.Loja_prod;

public class Televisao extends Produto {
    private int polegadas;

    //Construtor
    public Televisao(int codigo, double valor, int polegadas) {
        super(codigo, valor);
        this.polegadas = polegadas;
    }
}

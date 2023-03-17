package POO.Herança_Multipla.Override;

public class Televisao extends Produto {
    private int polegadas;

    //Construtor
    public Televisao(int codigo, double valor, int polegadas) {
        super(codigo, valor);
        this.polegadas = polegadas;
    }

    //Método
    public int getPolegadas() {
        return this.polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }

    //Reescrita do método
    /*@Override
    public boolean precoCaro(){
        if (valor > 2000) {
            return true;
        } else {
            return false;
        }
    }*/

    @Override
    public boolean precoCaro() {
        return getValor() > 2000;
    }
}

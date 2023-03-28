package poo.herança_multipla.Override;

public class Celular extends Produto {
    private int memoria;

    //Contrutor
    public Celular(int codigo, double valor, int memoria) {
        super(codigo, valor);
        this.memoria = memoria;
    }

    //método
    public int getMemoria() {
        return this.memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    } 
}

package poo.herança_multipla.Metodo;

public class Celular extends Computador {
    //Atributos exclusivos da classe Celular
    private boolean ligacao;

    //Construtor
    public Celular(int codigoDeBarra, int memoria, String processador, boolean ligacao) {
        super(codigoDeBarra, memoria, processador);
        this.ligacao = ligacao;
    }

    //Métodos
    public boolean getLigacao() {
        return this.ligacao;
    }

    public void setLigacao(boolean ligacao) {
        this.ligacao = ligacao;
    }


    public void fazerLigacao() {
        System.out.println("Ligando!");
    }
}

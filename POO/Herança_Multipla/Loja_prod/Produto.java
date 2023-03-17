package POO.Herança_Multipla.Loja_prod;

public class Produto {
    private int codigo;
    private double valor;

    //construtor
    public Produto(int codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    //Método
    public boolean precoCaro() {
        if(valor > 200) {
            return true;
        }else {
            return false;
        }
    }
}

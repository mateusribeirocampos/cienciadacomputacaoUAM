package poo.herança_multipla.override;

public class Produto {
    private int codigo;
    private double valor;

    //construtor
    public Produto(int codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
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

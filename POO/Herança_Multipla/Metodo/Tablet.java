package POO.Herança_Multipla.Metodo;

public class Tablet extends Computador {
    //Atributos exlusivos da classe Desktop
    private String cobertura;

    //Contrutor
    public Tablet(int codigoDeBarra, int memoria, String processador, String cobertura) {
        super(codigoDeBarra, memoria, processador);
        this.cobertura = cobertura;
    }

    //Métodos
    public String getCobertura() {
        return this.cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public void iniciarConexao() {
        System.out.println("Conexao ativada");
    }
}

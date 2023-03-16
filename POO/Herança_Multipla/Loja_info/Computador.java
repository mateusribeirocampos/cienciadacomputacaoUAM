package POO.Herança_Multipla.Loja_info;

public class Computador {
    //Atributos da classe mãe
    private int codigoDeBarra;
    private int memoria;
    private String processador;

    //construtor
    public Computador(int codigoDeBarra, int memoria, String processador) {
        this.codigoDeBarra = codigoDeBarra;
        this.memoria = memoria;
        this.processador = processador;
    }

    //construtor
    public int getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(int codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    } 


    //Métodos
    public void ligar() {
        System.out.println("Maquina ligada!");
    }
    public void desligada() {
        System.out.println("Maquina desligada");
    }
}

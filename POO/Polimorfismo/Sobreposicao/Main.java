package poo.polimorfismo.sobreposicao;

public class Main {
    public static void main(String[] args) {

        // Instancinado objeto de classe filha
        Liquidificador liquidificador = new Liquidificador();
        Batedeira batedeira = new Batedeira();
        Forno forno = new Forno();

        // Instanciando objeto controle passando por parâmetro o objeto liquidificador
        Controle controle_liquidificador = new Controle(liquidificador);
        Controle controle_batedeira = new Controle(batedeira);
        Controle controle_forno = new Controle(forno);
 
        // Chamada de método
        controle_liquidificador.ligar();
        controle_batedeira.ligar();
        controle_forno.ligar();

        System.out.println();

        controle_liquidificador.desligar();
        controle_batedeira.desligar();
        controle_forno.desligar();
    }
}

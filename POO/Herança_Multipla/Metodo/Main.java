package poo.herança_multipla.metodo;

public class Main {
    public static void main(String[] args) {
        // instanciando objetos de classe filha
        Desktop desk = new Desktop(1001, 4, "Intel", "amd");
        Tablet tab = new Tablet(1100, 2, "dual", "3G");
        Celular cel = new Celular(1110, 16, "asus", true);

        // Imprimir informações do objeto desktop
        System.out.println("\nInformacoes do Destop");
        System.out.println("Codigo de barra: " + desk.getCodigoDeBarra());
        System.out.println("Memoria: " + desk.getMemoria());
        System.out.println("Processador: " + desk.getProcessador());
        System.out.println("Placa de Video: " + desk.getPlacaDeVideo());
        desk.ligarVideo();
        desk.desligada();


        // Imprimir informações do objeto tab
        System.out.println("\nInformacoes do Tablet");
        System.out.println("Codigo de barra: " + tab.getCodigoDeBarra());
        System.out.println("Memoria: " + tab.getMemoria());
        System.out.println("Processador: " + tab.getProcessador());
        System.out.println("Cobertura: " + tab.getCobertura());
        tab.iniciarConexao();

        // Imprimir informações do objeto cel
        System.out.println("\nInformacoes do celular");
        System.out.println("Codigo de barra: " + cel.getCodigoDeBarra());
        System.out.println("Memoria" + cel.getMemoria());
        System.out.println("Processador: " + cel.getProcessador());
        System.out.println("Placa de Video: " + cel.getLigacao());
        cel.fazerLigacao();
    }
}

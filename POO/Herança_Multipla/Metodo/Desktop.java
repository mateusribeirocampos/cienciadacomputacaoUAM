package poo.herança_multipla.Metodo;

public class Desktop extends Computador {
    //Atributos exlusivos da classe Desktop
    private String placaDeVideo;

    //Construtor
    public Desktop(int codigoDeBarra, int memoria, String processador, String placaDeVideo) {
        super(codigoDeBarra, memoria, processador);
        this.placaDeVideo = placaDeVideo;
    }
    
    //Métodos
    public String getPlacaDeVideo() {
        return this.placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }


    public void ligarVideo() {
        System.out.println("Placa de video ativada");
    }
}

package poo.polimorfismo.sobreposicao;

public class Equipamento {
    private double tempo;
    private double voltagem;
    private String marca;

    //Métodos
    public void ligar(){
        System.out.println("Ligar equipamento!");
    }

    public void desligar() {
        System.out.println("Desligar equipamento!");
    }

    //getter e setter

    public double getTempo(){
        return this.tempo;
    }
    public void setTempo(double tempo){
        this.tempo = tempo;
    }

    public double getVoltagem(){
        return this.voltagem;
    }
    public void setVoltagem(double voltagem){
        this.voltagem = voltagem;
    }

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

}

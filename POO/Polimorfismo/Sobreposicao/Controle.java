package POO.Polimorfismo.Sobreposicao;

public class Controle {
    private Equipamento equipamento;

    //Construtor
    public Controle(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    //Método
    public void ligar(){
        equipamento.ligar();
    }

    public void desligar() {
        equipamento.desligar();
    }
}

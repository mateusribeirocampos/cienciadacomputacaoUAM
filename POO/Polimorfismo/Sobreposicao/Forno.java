package poo.polimorfismo.sobreposicao;

public class Forno extends Equipamento {
    


    //Método com polimorfismo de sobreposição
    @Override
    public void ligar() {
        System.out.println("Acender!");
    }

    public void desligar(){
        System.out.println("Desligar! Forno apagado!");
    }
}

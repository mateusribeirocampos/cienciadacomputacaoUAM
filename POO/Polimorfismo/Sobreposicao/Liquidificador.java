package POO.Polimorfismo.Sobreposicao;

public class Liquidificador extends Equipamento {
    

    //Método com polimorfismo de sobreposição
    @Override
    public void ligar(){
        System.out.println("Girar!");
    }
    /*public void desligar(){
        System.out.println("Desligar! Parar de girar!");
    }*/
}

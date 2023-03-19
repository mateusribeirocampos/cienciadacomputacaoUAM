package POO.Polimorfismo.Sobreposicao;

public class Batedeira extends Equipamento {
    


    //Método com polimorfismo de sobreposição
    @Override
    public void ligar() {
        System.out.println("Bater!");
    }
    public void desligar() {
        System.out.println("Desligando! Parar de bater!");
    }
}

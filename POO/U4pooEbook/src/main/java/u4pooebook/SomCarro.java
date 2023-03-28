package u4pooebook;

public class SomCarro extends CaixaDeSom implements Controle {

    public SomCarro(int tamanho, double potencia) {
        super(tamanho, potencia);
    }
    
    //Método
    public boolean ligar(){
        System.out.println("Você está ligando o Som!");
        return super.ligar(true);
    }
    public boolean desligar() {
        System.out.println("Você está desligando o Som!");
        return super.desligar(false);
    }
}

package u4pooebook;

public class U4pooEbook {
    public static void main(String[] args) {
        //criando uma instância de MiniSystem
        MiniSystem miniSystem = new MiniSystem(10, 100.0);
        
        //Ligando o MiniSystem
        boolean ligado = miniSystem.ligar();
        System.out.println("MiniSystem ligado " + ligado);
        
        //Desligando o MiniSystem
        boolean desligado = miniSystem.desligar();
        System.out.println("MiniSystem desligado " + desligado);
        
        //criando uma instância de SomCarro
        SomCarro somCarro = new SomCarro(20, 200.0);
        
        //liga o SomCarro
        ligado = somCarro.ligar();
        
        //Desliga o somCarro
        desligado = somCarro.desligar();
 
    }
}

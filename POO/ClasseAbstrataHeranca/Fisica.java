package POO.ClasseAbstrataHeranca;

public class Fisica extends Cliente {
    

    @Override
    public double desconto(){
        System.out.println("Autorizda desconto de 15%");
        return 0.15;
    }
}

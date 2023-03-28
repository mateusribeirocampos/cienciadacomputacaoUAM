package poo.classeabstrataheranca;

public class Juridica extends Cliente {



    //Método
    @Override
    public double desconto(){
        System.out.println("Autorizda desconto de 10%");
        return 0.10;
    }
}

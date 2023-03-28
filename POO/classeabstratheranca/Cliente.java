package poo.classeabstrataheranca;

public abstract class Cliente { //abstrata proibi que essa classe seja instanciada em código
    private String nome;
    private int documento;

    /*//Contrutores

    public Cliente(String nome, int documento) {
        this.nome = nome;
        this.documento = documento;
    }*/


    //Método getter e setter
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public int getDocumento(){
        return this.documento;
    }

    public void setDocumento(int documento){
        this.documento = documento;
    }

    //Método abstrato
    public abstract double desconto();

}

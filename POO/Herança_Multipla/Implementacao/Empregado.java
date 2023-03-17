package POO.Herança_Multipla.Implementacao;

public class Empregado {
    private int matricula;
    private String nome;
    private int cpf;
    private double salario;

    //Construtores
    public Empregado(int matricula, String nome, int cpf, double salario){
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    //Métodos
    public int getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return this.cpf;
    }
    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    public double salarioComBonificacao() {
        return salario = salario + (salario*0.1);
    }

    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}

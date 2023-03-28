package poo.herança_multipla.implementacao;

public class Auxiliar extends Empregado {
    private String departamento;

    //Contrutor
    public Auxiliar(int matricula, String nome, int cpf, double salario, String departamento) {
        super(matricula, nome, cpf, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Auxiliar() {
        super(0, " ", 0, 0.0);
        this.departamento = " ";
    }


}

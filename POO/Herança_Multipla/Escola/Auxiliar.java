package poo.herança_multipla.escola;

public class Auxiliar extends Funcionario {
    private String departamento;

    public Auxiliar(int matricula, String nome, String departamento) {
        super(matricula, nome);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}


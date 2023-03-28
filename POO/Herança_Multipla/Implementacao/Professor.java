package poo.herança_multipla.Implementacao;

public class Professor extends Empregado {
    private String disciplina;

    //Construtor
    public Professor(int matricula, String nome, int cpf, double salario, String disciplina) {
        super(matricula, nome, cpf, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public Professor() {
        super(0, " ", 0, 0.0);
        this.disciplina = " ";
    }
}

package POO.Herança_Multipla.Escola;

public class Professor extends Funcionario {
    private String disciplina;

    public Professor(int matricula, String nome, String disciplina) {
        super(matricula, nome);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}

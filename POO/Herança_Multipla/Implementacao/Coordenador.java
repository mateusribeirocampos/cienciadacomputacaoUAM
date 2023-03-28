package poo.herança_multipla.Implementacao;

public class Coordenador extends Empregado {
    private String curso;

    //Construtor
    public Coordenador(int matricula, String nome, int cpf, double salario, String curso) {
        super(matricula, nome, cpf, salario);
        this.curso = curso;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Coordenador(){
        super(0, " ", 0, 0.0);
        this.curso = " ";
    }

    //Método de subescrita
    @Override
    public double salarioComBonificacao() {
        return getSalario() + (getSalario()*0.15);
    }
}

package POO.Herança_Multipla.Escola;

public class Coordenador extends Funcionario {
    private String curso_vinculado;

    public Coordenador(int matricula, String nome, String curso_vinculado) {
        super(matricula, nome);
        this.curso_vinculado = curso_vinculado;
    }

    public String getCurso_vinculado() {
        return curso_vinculado;
    }

    public void setCurso_vinculado(String curso_vinculado) {
        this.curso_vinculado = curso_vinculado;
    }
}

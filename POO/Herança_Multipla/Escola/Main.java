package poo.herança_multipla.Escola;

public class Main {
    public static void main(String[] args) {
        //Criando instâncias de cada classe
        Coordenador coordenador = new Coordenador(123, "João", "Engenharia");
        Professor professor = new Professor(456, "Maria", "Matemática");
        Auxiliar auxiliar = new Auxiliar(789, "Pedro", "Administração");

        //Chamando a função para imprimir os dados
        imprimirDadosFuncionario(coordenador);
        imprimirDadosFuncionario(professor);
        imprimirDadosFuncionario(auxiliar);
    }

    public static void imprimirDadosFuncionario(Funcionario funcionario) {
        System.out.println("Matrícula: " + funcionario.getMatricula());
        System.out.println("Nome: " + funcionario.getNome());

        //Verificando o tipo do funcionário e imprimindo seus atributos exclusivos
        if (funcionario instanceof Coordenador) {
            Coordenador coordenador = (Coordenador) funcionario;
            System.out.println("Curso vinculado: " + coordenador.getCurso_vinculado());
        } else if (funcionario instanceof Professor) {
            Professor professor = (Professor) funcionario;
            System.out.println("Disciplina: " + professor.getDisciplina());
        } else if (funcionario instanceof Auxiliar) {
            Auxiliar auxiliar = (Auxiliar) funcionario;
            System.out.println("Departamento: " + auxiliar.getDepartamento());
        }

        System.out.println();
    }
}
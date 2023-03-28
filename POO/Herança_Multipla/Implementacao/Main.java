package poo.herança_multipla.Implementacao;
//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // Instânciando o objeto de classe filha
        Professor prof = new Professor(123, "Isadora", 123456789, 10500.50, "POO");
        Auxiliar aux = new Auxiliar(235, "Mateus", 987654321, 10500.50, "RH");
        Coordenador coor = new Coordenador(174, "Laura", 741852963, 10500.50, "TI");

        Empregado[] empregados = { prof, aux, coor };

        // Imprimir informações do método de verificação de valor dos objetos
        System.out.println("Salario do professor: " + prof.salarioComBonificacao());
        System.out.println("Matricula: " + prof.getMatricula());
        System.out.println("Disciplina: " + prof.getDisciplina());
        System.out.println();
        System.out.println("Salario do auxiliar: " + aux.salarioComBonificacao());
        System.out.println("Matricula: " + aux.getMatricula());
        System.out.println("Departamento: " + aux.getDepartamento());
        System.out.println();
        System.out.println("Salario do coordenador: " + coor.salarioComBonificacao());
        System.out.println("Matricula: " + coor.getMatricula());
        System.out.println("Curso: " + coor.getCurso());
        System.out.println();
        System.out.println("Nome de todos os empregados");
        
        /*public static void main(String[] args) {
            Empregado[] empregados = new Empregado[3];
            empregados[0] = new Professor(1234, "João", 123456789, 10000.50, "Doutorado");
            empregados[1] = new Auxiliar(5678, "Maria", 987654321, 5000.75, "Biblioteca");
            empregados[2] = new Coordenador(9012, "Pedro", 111222333, 15000.25, "Sistemas de Informação");
        
            for (Empregado empregado : empregados) {
                System.out.println("Matrícula: " + empregado.getMatricula());
                System.out.println("Nome: " + empregado.getNome());
                System.out.println("CPF: " + empregado.getCpf());
                System.out.println("Salário: " + empregado.salarioComBonificacao());
                System.out.println();
            }
        }*/
         
        
        // Criando um array de strings com o nome dos empregados
        String[] nomes = new String[empregados.length];
        for (int i = 0; i < empregados.length; i++) {
            nomes[i] = empregados[i].getNome();
        }

        // Imprimindo os nomes dos empregados
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        /*
        // Imprimir nomes dos empregados em formato de array
        String[] nomes = new String[empregados.length];
        for (int i = 0; i < empregados.length; i++) {
        nomes[i] = empregados[i].getNome();
        }
        System.out.println("Nome de todos os empregados: " + Arrays.toString(nomes));
        */

    }
}

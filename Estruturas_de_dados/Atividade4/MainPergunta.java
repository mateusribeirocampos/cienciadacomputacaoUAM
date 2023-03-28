package atividade4;

public class MainPergunta {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Qual e a sua cor favorita?", new String[] { "Azul", "Vermelho" },
                new String[] { "Dica 1", "Dica 2" }, null, null);
        pessoa.adicionarResposta("Verde", "Dica 3");


        pessoa.imprimirDados();
        pessoa.NoVazio();
    }
}
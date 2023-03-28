package unidade4_ed.ebook.genealogia;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        NoArvore raiz = new NoArvore();
        Pessoa primeiraPessoa = new Pessoa();
        primeiraPessoa.setNome("Jose Araujo");
        primeiraPessoa.setCpf("234.452.632-96");
        LocalDate data = LocalDate.of(1981, 5, 25);
        primeiraPessoa.setDataNascimento(data);

        raiz.setPessoa(primeiraPessoa);

        Pessoa primeiraP1N1 = new Pessoa();
        primeiraP1N1.setNome("Francisco Araujo");
        primeiraP1N1.setCpf("124.251.320-78");
        LocalDate data1 = LocalDate.of(1983, 9, 9);
        primeiraP1N1.setDataNascimento(data1);
        NoArvore filhoEsquerda = new NoArvore();
        filhoEsquerda.setPessoa(primeiraP1N1);
        raiz.setFilhoEsquerda(filhoEsquerda);

        Pessoa segundaPessoaP2N1 = new Pessoa();
        segundaPessoaP2N1.setNome("Maria Araujo");
        segundaPessoaP2N1.setCpf("536.958.841-98");
        LocalDate data2 = LocalDate.of(1982, 12, 23);
        segundaPessoaP2N1.setDataNascimento(data2);
        NoArvore filhoDireita = new NoArvore();
        filhoDireita.setPessoa(segundaPessoaP2N1);
        raiz.setFilhoDireita(filhoDireita);

        NoArvore.imprimirPessoasArvore(raiz); // Imprime a árvore completa
        NoArvore.imprimirPessoasArvore(filhoEsquerda); //Imprime o filho da esquerda da ávore
        NoArvore.imprimirPessoasArvore(filhoDireita); //Imprime o filho da direita da árvore

        ArvoreGenealogia vaziaCheia = new ArvoreGenealogia();
        vaziaCheia.estaVazia(raiz);
    }
}

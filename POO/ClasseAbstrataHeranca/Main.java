package POO.ClasseAbstrataHeranca;

public class Main {
    public static void main(String[] args) {
        Fisica pessoaFisica = new Fisica();
        Juridica pessoaJuridica = new Juridica();

        pessoaFisica.desconto();
        pessoaJuridica.desconto();
    }
}

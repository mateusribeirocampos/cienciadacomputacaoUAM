package unidade1_ed.veiculos;

public class Projeto {
    public static void main(String[] args) {
        Automovel fusca;
        fusca = new Automovel();
        fusca.cor = "Branco";
        fusca.marca = "Volkswagen";

        System.out.println("Cor do Automovel: " + fusca.cor);
    }
}

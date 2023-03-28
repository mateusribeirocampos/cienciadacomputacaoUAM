package unidade1_ed.felinos;

public class DadosGatos {
    public static void main(String[] args) {
        Gato Persa;
        Persa = new Gato();
        
        Gato Siames;
        Siames = new Gato();

        Gato Ragdool;
        Ragdool = new Gato();

        Persa.cor = "Branco";
        Persa.altura = 20;
        Persa.idade = 6;
        Persa.personalidade = "Afetivo";
        Persa.raca = "Puro";

        Siames.cor = "Marrom";
        Siames.altura = 50;
        Siames.idade = 3;
        Siames.personalidade = "Curioso";
        Siames.raca = "Siames + Anogora";

        Ragdool.cor = "Pardo";
        Ragdool.altura = 25;
        Ragdool.idade = 5;
        Ragdool.personalidade = "Teimoso";
        Ragdool.raca = "Ragdool + Persa";

        /*System.out.printf("As características do gato Persa:%n"
        + "Cor: %s%n"
        + "Altura: %d%n"
        + "Idade: %d%n"
        + "Personalidade: %s%n"
        + "Raça: %s%n",
        Persa.cor, Persa.altura, Persa.idade, Persa.personalidade, Persa.raca);

        System.out.printf("%nAs características do gato Siames:%n"
        + "Cor: %s%n"
        + "Altura: %d%n"
        + "Idade: %d%n"
        + "Personalidade: %s%n"
        + "Raça: %s%n",
        Siames.cor, Siames.altura, Siames.idade, Siames.personalidade, Siames.raca);

        System.out.printf("%nAs características do gato Ragdool:%n"
        + "Cor: %s%n"
        + "Altura: %d%n"
        + "Idade: %d%n"
        + "Personalidade: %s%n"
        + "Raça: %s%n",
        Ragdool.cor, Ragdool.altura, Ragdool.idade, Ragdool.personalidade, Ragdool.raca);*/

        Persa.MostarCaracteristicaGato();
        Siames.MostarCaracteristicaGato();
        Ragdool.MostarCaracteristicaGato();
    
    }
}

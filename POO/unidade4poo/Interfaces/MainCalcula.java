package unidade4poo.Interfaces;

public class MainCalcula {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        System.out.println("A area do quadrado de 5 x 5: " + quadrado.calcular());

        Retangulo retangulo = new Retangulo(4, 3);
        System.out.println("A area do retangulo de base 4 e altura 3: " + retangulo.calcular());
    }
}

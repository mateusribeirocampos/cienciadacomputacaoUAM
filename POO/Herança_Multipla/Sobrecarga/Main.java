package poo.herança_multipla.Sobrecarga;

public class Main {
    public static void main(String[] args) {
        Multiplicacao mult = new Multiplicacao(500, 500);
        Multiplicacao mult1 = new Multiplicacao(1000.5, 8.6);
        Multiplicacao mult2 = new Multiplicacao(250, 5.5);

        System.out.println("Multiplicacao");
        System.out.printf("500 x 500 = %d\n", mult.multiplicacao(500, 500));
        System.out.printf("1000 x 8 = %.2f\n", mult1.multiplicacao(1000.8, 8.6));
        System.out.printf("250 x 5.5 = %.2f", mult2.multiplicacao(250, 5.5));
    }
}
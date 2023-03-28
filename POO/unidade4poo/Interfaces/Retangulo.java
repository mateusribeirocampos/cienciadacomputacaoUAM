package unidade4poo.Interfaces;

public class Retangulo implements Area {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcular() {
        return this.base * this.altura;
    }
}
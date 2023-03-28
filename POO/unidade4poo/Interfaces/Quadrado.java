package unidade4poo.Interfaces;

public class Quadrado implements Area {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcular() {
        return this.lado * this.lado;
    }
}

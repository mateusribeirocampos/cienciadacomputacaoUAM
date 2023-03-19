package POO.Polimorfismo.Sobrecarga;

public class Area {
    private double x;
    private double y;

    //contructor
    public Area(double x, double y){
        this.x = x;
        this.y = y;
    }

    // Método com polimorfismo de sobrecarga
    // Métodos para calcular a área do quadrado e do retângulo usando sobrecarga
    public double calcularArea(double lado) {
        return lado * lado;
    }

    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    //getter and setter methods

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void getY(double y){
        this.y = y;
    }
}

package POO.Polimorfismo.CalculoArea;

public class Area {
    private double x;
    private double y;

    //contructor
    public Area(double x, double y){
        this.x = x;
        this.y = y;
    }

    // Método com polimorfismo de sobrecarga
    public double CalcularArae(double x) {
        return x * x;
    }

    public double CalcularArae(double x, double y) {
        return x * y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}

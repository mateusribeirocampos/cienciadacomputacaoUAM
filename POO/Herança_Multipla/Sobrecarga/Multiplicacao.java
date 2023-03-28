package poo.herança_multipla.Sobrecarga;

public class Multiplicacao {
    private int num1, num2;

    //Contrutor
    public Multiplicacao(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public Multiplicacao(double num1, double num2) {
        this.num1 = (int) num1;
        this.num2 = (int) num2;
    }

    public int multiplicacao(int num1, int num2) {
        int multiplicacao;
        multiplicacao = num1 * num2;
        return multiplicacao;
    }

    public double multiplicacao(double num1, double num2) {
        double multiplicacao;
        multiplicacao = num1 * num2;
        return multiplicacao;
    }

    //Métodos
    public int getNum1() {
        return this.num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return this.num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

}

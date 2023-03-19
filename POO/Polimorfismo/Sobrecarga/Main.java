package POO.Polimorfismo.Sobrecarga;

public class Main {
   public static void main(String[] args) {
         Area quatrado = new Area(5, 5);
         Area retangulo = new Area(50, 90);

         System.out.println("Area do quatrado: " + quatrado.calcularArea(5));
         System.out.println("Area do retangulo: " + retangulo.calcularArea(50, 90));
   } 
}

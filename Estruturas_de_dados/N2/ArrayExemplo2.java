package estruturas_de_dados.N2;

public class ArrayExemplo2 {
    public static void main(String[] args) {
        int x[] = {2, 5, 6, 8, 10, 6};
        x[1] = 9;
        x[3] = 10;

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + ", ");
        }
    }
}

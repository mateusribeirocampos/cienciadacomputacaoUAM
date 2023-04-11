package estruturas_de_dados.N2;

public class ArrayExmplo3 {
    public static void main(String[] args) {
        int x[] = {8, 3, 6, 5, 10, 6};
        x[1] = 1;
        x[3] = 4;

        for (int i = 5; i >= 0; i--) {
            System.out.print(x[i] + ", ");
        }
    }
}

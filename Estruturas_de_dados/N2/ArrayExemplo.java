package estruturas_de_dados.N2;

public class ArrayExemplo {
    public static void main(String[] args) {
        
        int x[] = {12, 2, 10, 3, 4};
        x[3] = 10;

        for (int i = 0; i < 10; i++) {
            System.out.println("x[" + i + "] " + x[i]);
        }
    }
}

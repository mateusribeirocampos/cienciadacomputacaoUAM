package Vetores.Matriz;

public class UsoMatriz {
    public static void main(String[] args) {
        int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        for(int linha = 0; linha < 4; linha++) {
            System.out.printf("%da. linha: ", (linha + 1));

            for(int coluna = 0; coluna < 3; coluna++) {
                System.out.printf(" %d ",  matriz[linha][coluna]);
            }
        System.out.println("\n");
        }
    }
}

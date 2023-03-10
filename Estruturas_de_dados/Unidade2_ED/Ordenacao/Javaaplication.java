package Ordenacao;

public class Javaaplication {
    public static void recursao(int i) {
        System.out.println(i);
        if(i == 0) {
            return;
        }else {
            recursao(i - 1);
        }
    }

    public static void main(String[] args) {
        for(int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        recursao(10);
    }
}

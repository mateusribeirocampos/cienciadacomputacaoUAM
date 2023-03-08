package Unidade1_POO.GetterSetter;
import java.util.Scanner;

public class GetterSetter {
    public static void main(String[] args) {
        String time;
        Futebol torcida = new Futebol();
        Scanner texto = new Scanner(System.in);

        System.out.println("Para qual time voce torce ");
        time = texto.nextLine();

        torcida.setTime(time);
        torcida.mostraTime();
        
        texto.close();
    }
}

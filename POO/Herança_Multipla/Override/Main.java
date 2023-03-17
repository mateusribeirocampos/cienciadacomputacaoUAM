package POO.Herança_Multipla.Override;

public class Main {
    public static void main(String[] args) {
        //Instanciando objeto de classe filha
        Celular cel = new Celular(100, 500, 16);
        Televisao tel = new Televisao(111, 300, 60);
        Pilha pil = new Pilha(110, 20, false);

        //imprimir informações do método de verificação de valor dos objetos
        System.out.println("\nInformacoes do Celular");
        System.out.println("Valor e considerado caro? \n" + cel.precoCaro());
        System.out.println("\nInformacoes do Televisao");
        System.out.println("Valor e considerado caro? \n" + tel.precoCaro());
        System.out.println("\nInformacoes do Pilha");
        System.out.println("Valor e considerado caro? \n" + pil.precoCaro());
    }
}

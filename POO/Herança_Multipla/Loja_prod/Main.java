package POO.Herança_Multipla.Loja_prod;

public class Main {
    public static void main(String[] args) {
        //Instanciando objeto de classe filha
        Celular cel = new Celular(100, 500, 16);
        Televisao tel = new Televisao(111, 300, 60);
        Pilha pil = new Pilha(110, 20, false);

        //imprimir informações do método de verificação de valor dos objetos
        System.out.println("Informacoes do Celular\n");
        System.out.println("Valor e considerado caro " + cel.precoCaro());
        System.out.println("Informacoes do Televisao\n");
        System.out.println("Valor e considerado caro " + tel.precoCaro());
        System.out.println("Informacoes do Pilha\n");
        System.out.println("Valor e considerado caro " + pil.precoCaro());
    }
}

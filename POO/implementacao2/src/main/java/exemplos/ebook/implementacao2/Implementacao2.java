package exemplos.ebook.implementacao2;

import java.util.Calendar;

public class Implementacao2 {

    public static void main(String[] args) {

        Comida lanche = new Comida("Hamburguer", 40.50, Calendar.getInstance().getTime(), 25);
        System.out.println("Descrição de todo o pedido: " + lanche.toString());

        Lanchonete conta = new Lanchonete();

        //Chamando as funções da classe lanchonete
        double totalConta = conta.calcularConta(1, 40.50);
        System.out.println("Conta: " + totalConta);
        conta.adicionarComida(lanche);
        Mesa mesa = new Mesa(1, totalConta);
        conta.fecharConta(mesa);

        try {
            if (lanche.estaVencida()) {
                System.out.println("O produto está vencido!");
            } else {
                String novoNome = "Pastel";
                lanche.setNome(novoNome);
                System.out.println("O nome da comida foi alterado para: " + novoNome);
            }
        } catch (ComidaVencidaException e) {
            System.out.println(e.getMessage());
        }
    }
}

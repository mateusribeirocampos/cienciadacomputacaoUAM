package poo.implementacao;

import java.util.Calendar;

public class MainComida {
    public static void main(String[] args) {
        Comida lanche = new Comida("Hamburguer", 40.00, Calendar.getInstance().getTime(), 23);
        System.out.println("Descrição de todo o pedido: " + lanche);
        
        Lanchonete conta = new Lanchonete();
        
        // Call functions from Lanchonete class
        conta.calcularConta(3, 40.00);
        System.out.println("Conta: " + conta.calcularConta(3, 40.02));
        conta.adicionarComida(lanche);
        conta.fecharConta(null);
        
        // Call functions from Comida class
        try {
            if (lanche.estaVencida()) {
                System.out.println("O produto está vencido!");
            } else {
                lanche.setNome("Pastel");
                lanche.imprimir();
            }
        } catch (ComidaVencidaException e) {
            System.out.println(e.getMessage());
        }
    }
}

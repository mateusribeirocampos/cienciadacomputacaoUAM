package poo.implementacao;

import java.util.Calendar;

public class MainComida {
    public static void main(String[] args) {
        Comida lanche = new Comida("Hamburguer", 40.00, Calendar.getInstance().getTime(), 23);
        System.out.println("Descrição de todo o pedido: " + lanche);
        Lanchonete conta = new Lanchonete();
        
        conta.calcularConta(3, 40.00);
        System.out.println("Conta: " + conta.calcularConta(3, 40.02));
        conta.adicionarComida(lanche);
        conta.fecharConta(null);
        lanche.setNome("Pastel");

        lanche.imprimir();



    }
}

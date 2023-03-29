/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exemplos.ebook.implementacao2;

import java.util.Calendar;

/**
 *
 * @author Mateus Campos
 */
public class Implementacao2 {

    public static void main(String[] args) {

        Comida lanche = new Comida("Hamburguer", 40.50, Calendar.getInstance().getTime(), 23);
        System.out.println("Descrição de todo o pedido: " + lanche);
        
        Lanchonete conta = new Lanchonete();
        
        //Chamando as funções da classe lanchonete
        conta.calcularConta(3, 40.12);
        System.out.println("Conta: " + conta.calcularConta(3, 40.12));
        conta.adicionarComida(lanche);
        Mesa mesa = new Mesa(1, 40);
        conta.fecharConta(mesa);
        
        try {
            if(lanche.estaVencida()) {
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

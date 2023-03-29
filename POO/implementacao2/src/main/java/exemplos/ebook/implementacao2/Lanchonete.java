package exemplos.ebook.implementacao2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Lanchonete {

    public List<Comida> comidas = new ArrayList<>();
    private int qtdPessoas;

    public double calcularConta(int pessoas, double valor) {
        return valor / pessoas;
    }

    public void adicionarComida(Comida comida) {
        try{
            if(!comida.estaVencida()) {
                comidas.add(comida);
            }
        } catch (ComidaVencidaException ex) {
            System.out.println(comida.getNome() + " " + ex.getMessage());
        }
    }
    
    public void fecharConta(Mesa mesa) {
        Scanner leitor = new Scanner(System.in);
        try {
            System.out.print("Informe a quantidade de pessoas: ");
            int qtdPessoas = leitor.nextInt();
            double total = calcularConta(qtdPessoas, mesa.valor);
            System.out.println("Mesa: " + mesa.numero + " Total a pagar cada pessoa: R$ " + total);
        } catch (ArithmeticException e) {
            System.out.println("Quantidade de pessoas não pode ser igual a 0");
        } catch (InputMismatchException e) {
            System.out.println("Verifique os valores digitados");
        } catch (Exception e) {
            System.out.println("Ocorreu algum problema na função");
        } finally {
            System.out.println("Mesa: " + mesa.numero + " Total a pagar: R$ " + mesa.valor);
        }
    }
}

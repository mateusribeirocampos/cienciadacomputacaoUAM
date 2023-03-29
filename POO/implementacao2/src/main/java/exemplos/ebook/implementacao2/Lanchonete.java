package exemplos.ebook.implementacao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lanchonete {

    public List<Comida> comidas = new ArrayList<>();
    private int qtdPessoas;

    public double calcularConta(int pessoas, double valor) {
        return valor / pessoas;
    }

    public void adicionarComida(Comida comida) {
        try {
            if (!comida.estaVencida()) {
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
            while (!leitor.hasNextInt()) {
                System.out.println("Por favor, informe um valor inteiro válido.");
                leitor.next(); // read the non-integer value so the loop can continue
            }
            int qtdPessoas = leitor.nextInt();
            if (qtdPessoas <= 0) {
                throw new ArithmeticException("Quantidade de pessoas não pode ser igual a 0");
            }
            double total = calcularConta(qtdPessoas, mesa.getValor());
            System.out.println("Mesa: " + mesa.getNumero() + " Total a pagar cada pessoa: R$ " + total);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu algum problema na função");
        } finally {
            System.out.println("Mesa: " + mesa.getNumero() + " Total a pagar: R$ " + mesa.getValor());
        }
    }
}

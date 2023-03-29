package poo.implementacao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Lanchonete {
    public List<Comida> comidas = new ArrayList<Comida>();
    public double calcularConta(int pessoas, double valor){
        return valor/pessoas;
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
            int qtdPessoas = leitor.nextInt();
            double total = calcularConta(qtdPessoas, qtdPessoas);
            System.out.println("Mesa: " + mesa.numero + "Total a pagar cada pessoa: R$ " + total);
            leitor.close();
        } catch (ArithmeticException e) {
            System.out.println("Quantidade de pessoas nao pode ser 0 ");
        } catch (InputMismatchException e) {
            System.out.println("Verifique os valores digitados ");
        } catch (Exception e) {
            System.out.println("Ocorreu algum problema na função");
        } finally {
            System.out.println("Mesa: " + mesa.numero + "Total a pagar: R$ " + mesa.valor);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos.ebook.implementacao2;

/**
 *
 * @author Mateus Campos
 */
public class Mesa {
    private double valor;
    private int numero;
    
    public Mesa(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
    }
    
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
}


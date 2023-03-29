/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos.ebook.implementacao2;

import java.util.Calendar;
import java.util.Date;

public class Comida {
    private String nome;
    private double valor;
    private Date dataFabricacao;
    private int diasValidade;
    Calendar calendar = Calendar.getInstance();
    
    public Comida(String nome, double valor, Date data, int dias) {
        this.nome = nome;
        this.valor = valor;
        this.dataFabricacao = data;
        this.diasValidade  = dias;
    }
    //Método para verificar se a comida está vencida
    public boolean estaVencida() throws ComidaVencidaException {
        Date dataAtual = calendar.getTime();
        calendar.setTime(this.dataFabricacao);
        calendar.add(Calendar.DAY_OF_MONTH, diasValidade);
        Date dataProdutoComValidade = calendar.getTime();
        if(dataProdutoComValidade.after(dataAtual)) {
            return false;
        } else {
            throw new ComidaVencidaException();
        }
    }
    //Getter e setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public Date getDataFabricacao() {
        return dataFabricacao;
    }
    
    public int getDiasValidade() {
        return diasValidade;
    }
    
    public void imprimir() {
        System.out.println("Produto: " + getNome() + "Valor: " + getValor());
    }

    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
}

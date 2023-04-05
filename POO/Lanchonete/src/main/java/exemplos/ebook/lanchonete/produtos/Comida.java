/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos.ebook.lanchonete.produtos;

import exemplos.ebook.lanchonete.exception.ComidaVencidaException;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Mateus Campos
 */
public class Comida {

    private String nome;
    private double valor;
    private Date dataFabricacao;
    private int diasValidade;
    Calendar calendar = Calendar.getInstance();
    
    public Comida(){};

    public Comida(String nome, double valor, Date data, int dias) {
        this.nome = nome;
        this.valor = valor;
        this.dataFabricacao = data;
        this.diasValidade = dias;
    }
    
    //Método para verificar se a comida está vencida
    public boolean estaVencida() throws ComidaVencidaException {
        Date dataAtual = calendar.getTime();
        calendar.setTime(this.dataFabricacao);
        calendar.add(calendar.DAY_OF_MONTH, diasValidade);
        Date dataProdutoComValidade = calendar.getTime();
        if(dataAtual.after(dataProdutoComValidade)) {
            throw new ComidaVencidaException();
        } else {
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

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

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getDiasValidade() {
        return diasValidade;
    }

    public void setDiasValidade(int diasValidade) {
        this.diasValidade = diasValidade;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}

package poo.implementacao;

import java.util.Date;
import java.util.Calendar;

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
        this.diasValidade = dias;
    }
    //Método para verificar se a comida está vencida
    public boolean estaVencida() throws ComidaVencidaException {
        Date dataAtual = calendar.getTime();
        calendar.setTime(this.dataFabricacao);
        calendar.add(Calendar.DAY_OF_MONTH, diasValidade);
        Date dataProdutoComValidade = calendar.getTime();
        if (dataProdutoComValidade.after(dataAtual)) {
            return false;
        } else {
            throw new ComidaVencidaException();
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

    public void imprimir() {
        System.out.println("Produto: " + getNome() + "Valor: " + getValor());
    }
}

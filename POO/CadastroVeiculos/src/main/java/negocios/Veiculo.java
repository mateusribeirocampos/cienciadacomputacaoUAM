/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocios;

/**
 *
 * @author Mateus Campos
 */
public class Veiculo {
    private String nome;
    private String marca;
    private int Placa;

    public Veiculo(String nome, String marca, int Placa) {
        this.nome = nome;
        this.marca = marca;
        this.Placa = Placa;
    }

    public Veiculo() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPlaca() {
        return Placa;
    }

    public void setPlaca(int Placa) {
        this.Placa = Placa;
    }
}

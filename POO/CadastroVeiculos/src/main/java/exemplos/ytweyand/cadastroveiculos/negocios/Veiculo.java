/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos.ytweyand.cadastroveiculos.negocios;

/**
 *
 * @author Mateus Campos
 */
public class Veiculo {
    String nome;
    String marca;
    
    public Veiculo(){};

    public Veiculo(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
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
}

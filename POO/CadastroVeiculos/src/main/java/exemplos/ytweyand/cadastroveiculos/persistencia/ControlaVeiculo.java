/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos.ytweyand.cadastroveiculos.persistencia;

import exemplos.ytweyand.cadastroveiculos.negocios.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author Mateus Campos
 */
public class ControlaVeiculo {
    ArrayList<Veiculo> veiculos = new ArrayList<>();
    
    public boolean salvar (Veiculo v) {
        if(v!=null) {
            veiculos.add(v);
            return true;
        } else {
            return false;
        }
    }
    public ArrayList<Veiculo> retornarTodos () {
        return veiculos;
    }
}

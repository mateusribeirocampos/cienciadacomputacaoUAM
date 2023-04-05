/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos.ebook.lanchonete.controle;

import exemplos.ebook.lanchonete.produtos.Comida;
import java.util.ArrayList;

/**
 *
 * @author Mateus Campos
 */
public class ControlaComida {
    
    private ArrayList<Comida> comida = new ArrayList<>();
    
    public boolean salvar (Comida c) {
        if(c != null) {
            comida.add(c);
            return true;
        } else {
            return false;
        }
    }
    public ArrayList<Comida> retornarTodos() {
        return comida;
    }
}

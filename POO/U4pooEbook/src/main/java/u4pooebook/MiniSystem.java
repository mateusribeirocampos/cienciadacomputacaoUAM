/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4pooebook;

/**
 *
 * @author Mateus Campos
 */
public class MiniSystem extends CaixaDeSom implements Controle {
    
    //Construtor
    public MiniSystem(int tamanho, double potencia) {
        super(tamanho, potencia);
    }
    //Métodos
    public boolean ligar(){
        setStatus(true);
        return getStatus();
    }
    public boolean desligar(){
        setStatus(false);
        return getStatus();
    }
}

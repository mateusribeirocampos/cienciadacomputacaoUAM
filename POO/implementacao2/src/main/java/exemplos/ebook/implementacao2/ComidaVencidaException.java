/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos.ebook.implementacao2;

/**
 *
 * @author Mateus Campos
 */
public class ComidaVencidaException extends Exception {
    @Override
    public String getMessage() {
        return "Está Vencida!";
    }
}

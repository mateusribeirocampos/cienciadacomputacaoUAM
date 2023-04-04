/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exemplos.yt.aulajtable;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Mateus Campos
 */
public class Aulajtable {

    public static void main(String[] args) {
        String[] nomeColunas = {"Nome", "Sobrenome", "Signo", "Idade", "Programa Java"};
        Object[][] dados = {{"Breno", "Maquias", "Gemeos", 43, true}, {"Jurandir", "Maurício", "Touro", 30, false},{"José", "Maria", "Aries", 89, true}};
        JTable jTable = new JTable(dados, nomeColunas);
        //jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        JFrame jFrame = new JFrame();
        jFrame.setSize(455, 300);
        
        jFrame.add(jTable);
        jFrame.setVisible(true);
        
    }
}

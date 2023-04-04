/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package exemplos.yt.aulajtable2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Mateus Campos
 */
public class Aulajtable2 {

    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(new Pessoa("Jurandir", 40));
        listaPessoas.add(new Pessoa("Fernanda", 25));
        listaPessoas.add(new Pessoa("Gustavo", 31));
        listaPessoas.add(new Pessoa("Larissa", 28));
        listaPessoas.add(new Pessoa("Ricardo", 36));
        
        MeuTableModel meuTableModel = new MeuTableModel(listaPessoas);
        
        JTable jTable = new JTable(meuTableModel);
        
        JFrame jFrame = new JFrame();
        jFrame.setSize(500, 300);
        jFrame.add(new JScrollPane(jTable));
        jFrame.setVisible(true);
        
    }
}

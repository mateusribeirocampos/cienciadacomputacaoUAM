/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package exemplos.yt.aulajtable1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mateus Campos
 */
public class Aulajtable1 {

    public static void main(String[] args) {
        //TableModel padrão = MVC
        // criar o DefaultTableModel objeto nossoTableModel
        DefaultTableModel nossoTableModel = new DefaultTableModel();

        //Adicionar colunas
        nossoTableModel.addColumn("Nome");
        nossoTableModel.addColumn("Sobrenome");
        nossoTableModel.addColumn("Idade");
        nossoTableModel.addColumn("Programa Java");

        // Criar o objeto JTable
        JTable nossaJTable = new JTable(nossoTableModel);

        //Inserir linhas na tabela
        Object[] linha0 = {"Marcolino", "Mago", 45, "Sim"};
        Object[] linha1 = {"Maria", "Mister", 25, "Não"};
        Object[] linha2 = {"Buno", "Almeira", 29, "Sim"};
        Object[] linha3 = {"João", "Barbosa", 35, "Não"};
        Object[] linha4 = {"Julia", "Santos", 28, "Sim"};
        Object[] linha5 = {"Ricardo", "Silva", 41, "Não"};
        Object[] linha6 = {"Fernanda", "Nunes", 32, "Sim"};
        Object[] linha7 = {"Luiz", "Ferreira", 47, "Não"};
        Object[] linha8 = {"Ana", "Mendes", 23, "Sim"};
        Object[] linha9 = {"Carlos", "Sousa", 39, "Não"};
        Object[] linha10 = {"Mariana", "Costa", 30, "Sim"};

        nossoTableModel.insertRow(0, linha0);
        nossoTableModel.insertRow(1, linha1);
        nossoTableModel.insertRow(2, linha2);
        nossoTableModel.insertRow(3, linha3);
        nossoTableModel.insertRow(4, linha4);
        nossoTableModel.insertRow(5, linha5);
        nossoTableModel.insertRow(6, linha6);
        nossoTableModel.insertRow(7, linha7);
        nossoTableModel.insertRow(8, linha8);
        nossoTableModel.insertRow(9, linha9);
        nossoTableModel.insertRow(10, linha10);
        
        JFrame jFrame = new JFrame();
        jFrame.setSize(500, 300);
        jFrame.add(new JScrollPane(nossaJTable));
        jFrame.setVisible(true);
    }
}

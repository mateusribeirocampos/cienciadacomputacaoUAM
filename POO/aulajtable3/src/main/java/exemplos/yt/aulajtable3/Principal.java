/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos.yt.aulajtable3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Mateus Campos
 */
public class Principal extends JFrame {

    private final JLabel labelNomeCliente;
    private final JLabel labelIdadeCliente;
    private final JLabel labelPesoCliente;

    private final JTextField txtNomeCliente;
    private final JTextField txtIdadeCliente;
    private final JTextField txtPesoCliente;
    private final JComboBox jcbEscolaridadeCliente;

    private final JButton BotaoSalvarCliente;

    public Principal() {
        super();
        this.setTitle("Clientes");
        this.setSize(500, 250);

        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        labelNomeCliente = new JLabel("Nome");
        txtNomeCliente = new JTextField();
        txtNomeCliente.setPreferredSize(new Dimension(450, 25));
        
        String[] escolaridades = {".Escolaridade..", "Graduação", "Ensino Médio", "Ensino Fundamental"};
                jcbEscolaridadeCliente = new JComboBox(escolaridades);

        labelIdadeCliente = new JLabel("Idade:");
        txtIdadeCliente = new JTextField();
        txtIdadeCliente.setPreferredSize(new Dimension(100, 25));

        labelPesoCliente = new JLabel("Peso:");
        txtPesoCliente = new JTextField();
        txtPesoCliente.setPreferredSize(new Dimension(100, 25));
        
        JLabel labelProdutos = new JLabel("Seleciona a categoria que você tem mais interesse");
        
        JCheckBox chkLivros = new JCheckBox("Livros");
        JCheckBox chkCozinha = new JCheckBox("Cozinha");
        JCheckBox chkEletronicos = new JCheckBox("Eletronicos");

        BotaoSalvarCliente = new JButton("Salvar");

        BotaoSalvarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nome = txtNomeCliente.getText();
                int idade = Integer.parseInt(txtIdadeCliente.getText());
                double peso = Double.parseDouble(txtPesoCliente.getText());
                String escolaridadeSelecionada = (String) jcbEscolaridadeCliente.getSelectedItem();
                
                //Checkbox selecionados ou nao
                boolean livros = chkLivros.isSelected();
                boolean cozinha = chkCozinha.isSelected();
                boolean eletronicos = chkEletronicos.isSelected();
                
                JOptionPane.showMessageDialog(null, "DADOS DO CLIENTE "
                        + "\n Nome: " + nome 
                        + "\n Idade: " + idade 
                        + "\n Peso: " + peso 
                        + "\n Escolaridade " 
                        + escolaridadeSelecionada 
                        + "\n\n PRODUTOS DE INTERESSE" 
                        + "\n Livros: " + livros 
                        + "\n Cozinha: " + (chkCozinha.isSelected() ? "sim" : "Não" )
                        + "\n Eletronicos: " + eletronicos);
                JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso", "Salvar", 1);
            }
        });

        this.add(labelNomeCliente);
        this.add(txtNomeCliente);
        
        this.add(jcbEscolaridadeCliente);

        this.add(labelIdadeCliente);
        this.add(txtIdadeCliente);
        
        this.add(labelPesoCliente);
        this.add(txtPesoCliente);
        
        this.add(labelProdutos);
        
        this.add(chkLivros);
        this.add(chkCozinha);
        this.add(chkEletronicos);

        this.add(BotaoSalvarCliente);

        this.setVisible(true);
    }
}

package POO.APP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame {
    private static JLabel directionsLabel = new JLabel("Insira seu nome: ");
    private static JLabel outputLabel = new JLabel();
    private static JTextField caixaNome = new JTextField(25);
    private static JButton nomeBotao = new JButton("Click");

    public static void main(String[] args) {
        App window = new App();
        window.setSize(500, 500);
        window.setVisible(true);
        window.setTitle("Caixa");

        window.setLayout(new FlowLayout());

        directionsLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));

        window.getContentPane().add(directionsLabel);
        window.getContentPane().add(nomeBotao);
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(caixaNome);
        window.getContentPane().add(outputLabel);

        nomeBotao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonClick(e);
            }
        });

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void buttonClick(ActionEvent e) {
        String seuNome = caixaNome.getText();
        String outputMensagem = "Ola, " + seuNome;
        outputLabel.setText(outputMensagem);
    }
}

/*JLabel: É uma classe que representa um componente de interface gráfica de usuário que exibe um texto não-editável. No código, foram criadas duas instâncias dessa classe. A directionsLabel exibe uma mensagem de instrução, enquanto a outputLabel será usada para exibir a saudação gerada quando o botão é clicado.

JTextField: É uma classe que representa um componente de interface gráfica de usuário que permite que o usuário insira/edita um texto. No código, foi criada uma instância dessa classe, chamada caixaNome, que será usada para coletar o nome do usuário.

JButton: É uma classe que representa um componente de interface gráfica de usuário que pode ser clicado pelo usuário. No código, foi criada uma instância dessa classe, chamada nomeBotao, que será usada para iniciar a geração da saudação quando clicada.

Todos esses componentes fazem parte do conjunto de classes e interfaces fornecidos pela biblioteca gráfica Swing do Java para criação de interfaces gráficas de usuário (GUIs). */

package POO.APP;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    private static JLabel directionsLabel = new JLabel("Insira seus dados:");
    private static JLabel nomeLabel = new JLabel("Nome:");
    private static JLabel emailLabel = new JLabel("Email:");
    private static JLabel dataNascLabel = new JLabel("Data de Nascimento:");
    private static JLabel outputLabel = new JLabel();
    private static JTextField nomeTextField = new JTextField(25);
    private static JTextField emailTextField = new JTextField(25);
    private static JTextField dataNascTextField = new JTextField(25);
    private static JButton nomeBotao = new JButton("Click");

    public static void main(String[] args) {

        App window = new App();
        window.setSize(500, 300);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Formulário");

        // Configurando o layout da janela como um GridBagLayout
        window.setLayout(new GridBagLayout());

        directionsLabel.setFont(new Font("Arial", Font.BOLD, 20));

        GridBagConstraints c = new GridBagConstraints();

        // Configurando restrições de layout para o directionsLabel
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.insets = new Insets(10, 10, 10, 10); // espaçamento interno
        window.add(directionsLabel, c);

        // Configurando restrições de layout para o nomeLabel
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.anchor = GridBagConstraints.LINE_END; // alinhamento do texto
        window.add(nomeLabel, c);

        // Configurando restrições de layout para o nomeTextField
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 1;
        c.anchor = GridBagConstraints.LINE_START; // alinhamento do texto
        c.fill = GridBagConstraints.HORIZONTAL; // preencher a largura
        c.insets = new Insets(0, 0, 10, 10); // espaçamento interno
        nomeTextField.setPreferredSize(new Dimension(200, 25)); // definindo a largura
        window.add(nomeTextField, c);

        // Configurando restrições de layout para o emailLabel
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        c.anchor = GridBagConstraints.LINE_END; // alinhamento do texto
        window.add(emailLabel, c);

        // Configurando restrições de layout para o emailTextField
        c.gridx = 1;
        c.gridy = 2;
        c.gridwidth = 1;
        c.anchor = GridBagConstraints.LINE_START; // alinhamento do texto
        c.fill = GridBagConstraints.HORIZONTAL; // preencher a largura
        c.insets = new Insets(0, 0, 10, 10); // espaçamento interno
        emailTextField.setPreferredSize(new Dimension(200, 25)); // definindo a largura
        window.add(emailTextField, c);

        // Configurando restrições de layout para o dataNascLabel
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        c.anchor = GridBagConstraints.LINE_END; // alinhamento do texto
        window.add(dataNascLabel, c);

        // Configurando restrições de layout para o dataNascLabel
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        c.anchor = GridBagConstraints.LINE_END; // alinhamento do texto
        window.add(dataNascLabel, c);

        // Configurando restrições de layout para o dataNascTextField
        c.gridx = 1;
        c.gridy = 3;
        c.gridwidth = 1;
        c.anchor = GridBagConstraints.LINE_START; // alinhamento do texto
        c.fill = GridBagConstraints.HORIZONTAL; // preencher a largura
        c.insets = new Insets(0, 0, 0, 10); // espaçamento interno
        dataNascTextField.setPreferredSize(new Dimension(200, 25)); // definindo a largura
        window.add(dataNascTextField, c);

        // Configurando restrições de layout para o nomeBotao
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.CENTER; // alinhamento do botão
        c.insets = new Insets(10, 0, 0, 0); // espaçamento interno
        window.add(nomeBotao, c);

        // Configurando restrições de layout para o outputLabel
        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.CENTER; // alinhamento do texto
        c.insets = new Insets(10, 0, 0, 0); // espaçamento interno
        window.add(outputLabel, c);

        // Configurando o comportamento do botão
        nomeBotao.addActionListener(e -> {
            String nome = nomeTextField.getText();
            String email = emailTextField.getText();
            String dataNasc = dataNascTextField.getText();
            outputLabel.setText("Nome: " + nome + " | Email: " + email + " | Data de Nascimento: " + dataNasc);
        });
    }
}

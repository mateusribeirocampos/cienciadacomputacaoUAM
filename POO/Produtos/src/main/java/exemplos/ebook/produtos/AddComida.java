/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exemplos.ebook.produtos;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mateus Campos
 */
public class AddComida extends javax.swing.JFrame {

    private javax.swing.JTable jTableComidas; // Tabela onde serão exibidas as comidas 
    public Comida comida; // Comida que está sendo adicionado/editada
    private Principal principal; //Referência à janela principal
    private List<Comida> listaComidas; // Lista de comidas que será exibida na tela

    // Cria a tela principal e inicializa os componentes
    public AddComida() {
        initComponents(); // inicializa os componentes da tela
        //Centraliza a tela no meio da tela do usuário
        this.setLocationRelativeTo(null);
        this.listaComidas = new ArrayList<>(); // Inicializa a lista de comidas vazia
    }

    AddComida(boolean rootPaneCheckingEnabled) {
        this.listaComidas = new ArrayList<>(); // Inicializa a lista de comida vazia
        initComponents();
        this.rootPaneCheckingEnabled = rootPaneCheckingEnabled; //é uma linha de código que atribui o valor do parâmetro rootPaneCheckingEnabled à variável rootPaneCheckingEnabled do objeto atual (this)
    }

    AddComida(JTable mainTable) {
        this.listaComidas = new ArrayList<>();
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //contrutor
    public AddComida(Principal principal) {
        this.listaComidas = new ArrayList<>();
        initComponents();// Inicializa os componentes da tela
        this.principal = principal; // Inicializa os componentes da tela
        atualizarTabelaComidas(); // Atualiza a tabela de comidas na tela
    }

    public void adicionarComida(Comida comida) {
        listaComidas.add(comida); // Adiciona a comida na lista
        atualizarTabelaComidas(); // Atualiza a tabela de comidas na tela
    }

    public AddComida(JTable tabelaComidas, List<Comida> listaComida) {
        this.listaComidas = listaComida; // Incializa a lista de comidas com a lista passada como parâmetro 
        this.jTableComidas = tabelaComidas;// Inicializa a tabela com a tabela passada como parâmetro
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        panelDadosProdutos = new javax.swing.JPanel();
        Nome = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        Valor = new javax.swing.JLabel();
        DiasValidade = new javax.swing.JLabel();
        textFieldValor = new javax.swing.JTextField();
        textFieldDiasValidade = new javax.swing.JTextField();
        Salvar = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDadosProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        Nome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Nome.setText("Nome");

        textFieldNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldNome.setToolTipText("");
        textFieldNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Valor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Valor.setText("Valor");

        DiasValidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DiasValidade.setText("Dias Validade");

        textFieldValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldValor.setToolTipText("");

        textFieldDiasValidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldDiasValidade.setToolTipText("");

        javax.swing.GroupLayout panelDadosProdutosLayout = new javax.swing.GroupLayout(panelDadosProdutos);
        panelDadosProdutos.setLayout(panelDadosProdutosLayout);
        panelDadosProdutosLayout.setHorizontalGroup(
            panelDadosProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosProdutosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelDadosProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDadosProdutosLayout.createSequentialGroup()
                        .addComponent(DiasValidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldDiasValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDadosProdutosLayout.createSequentialGroup()
                        .addComponent(Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDadosProdutosLayout.createSequentialGroup()
                        .addComponent(Valor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        panelDadosProdutosLayout.setVerticalGroup(
            panelDadosProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosProdutosLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelDadosProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Valor)
                    .addComponent(textFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiasValidade)
                    .addComponent(textFieldDiasValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        Salvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Salvar.setText("Salvar");
        Salvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Salvar.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                SalvarComponentMoved(evt);
            }
        });
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        Limpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Limpar.setText("Limpar");
        Limpar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        Cancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDadosProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDadosProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvar)
                    .addComponent(Limpar)
                    .addComponent(Cancelar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        // TODO add your handling code here:
        try {
            if (textFieldNome.getText().isEmpty() || textFieldValor.getText().isEmpty() || textFieldDiasValidade.getText().isEmpty()) {
                throw new NumberFormatException();
            }
            String nome = textFieldNome.getText(); //Pegar o texto referente ao nome da comida
            double valor = Double.parseDouble(textFieldValor.getText()); //Pegar o texto referente ao valor
            int data = Integer.parseInt(textFieldDiasValidade.getText()); //Pegar a data referente aos dias
            this.comida = new Comida(nome, valor, new Date(), data); // Cria um objeto Comida com os valores obtidos
            if (principal != null) {// Se houver uma instância de Principal, adiciona a Comida à lista de Comidas e atualiza a tabela
                principal.adicionarComida(comida);
            }
            JOptionPane.showMessageDialog(null, "Comida adicionada com sucesso", "Adicionar comida", 1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível adicionar comida, verifique os dados digitados", "Adicionar comida", JOptionPane.ERROR_MESSAGE);
        }
        this.dispose();
        this.setVisible(false);

    }//GEN-LAST:event_SalvarActionPerformed

    public void atualizarTabelaComidas() {
        DefaultTableModel model = (DefaultTableModel) jTableComidas.getModel();
        model.setRowCount(0); // Remove todas as linhas da tabela
        // Percorre a lista de Comidas e adiciona cada uma como uma nova linha da tabela
        for (Comida comida : listaComidas) {
            // Cria um array com os dados da Comida
            Object[] rowData = {comida.getNome(), comida.getValor(), comida.getDataFabricacao(), comida.getDiasValidade()};
            model.addRow(rowData); // Adiciona o array como uma nova linha da tabela
        }
    }

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
        //botão fechar
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        // TODO add your handling code here:
        //botão limpar
        textFieldNome.setText("");
        textFieldValor.setText("");
        textFieldDiasValidade.setText("");
    }//GEN-LAST:event_LimparActionPerformed

    private void SalvarComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_SalvarComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_SalvarComponentMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddComida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel DiasValidade;
    private javax.swing.JButton Limpar;
    private javax.swing.JLabel Nome;
    private javax.swing.JButton Salvar;
    private javax.swing.JLabel Valor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel panelDadosProdutos;
    private javax.swing.JTextField textFieldDiasValidade;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldValor;
    // End of variables declaration//GEN-END:variables
}

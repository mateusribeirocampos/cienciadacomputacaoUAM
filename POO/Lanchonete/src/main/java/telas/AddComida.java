/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import exemplos.ebook.lanchonete.controle.ControlaComida;
import exemplos.ebook.lanchonete.produtos.Comida;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateus Campos
 */
public class AddComida extends javax.swing.JFrame {

    ControlaComida cc = new ControlaComida();
    Comida comida;
    
    public AddComida() {
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

        jPanel1 = new javax.swing.JPanel();
        LabelNome = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        LabelValor = new javax.swing.JLabel();
        CampoValor = new javax.swing.JTextField();
        LabelValidade = new javax.swing.JLabel();
        CampoValidade = new javax.swing.JTextField();
        BtnSalvar = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnCadastrados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de comida");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da comida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        LabelNome.setText("Nome");

        LabelValor.setText("Valor");

        LabelValidade.setText("Data validade");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelValidade)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelValor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelNome)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoValidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNome)
                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelValor)
                    .addComponent(CampoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelValidade)
                    .addComponent(CampoValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        BtnLimpar.setText("Limpar");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnCadastrados.setText("Cadastrados");
        BtnCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastradosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnCadastrados)
                .addGap(15, 15, 15)
                .addComponent(BtnSalvar)
                .addGap(15, 15, 15)
                .addComponent(BtnLimpar)
                .addGap(15, 15, 15)
                .addComponent(BtnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalvar)
                    .addComponent(BtnLimpar)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnCadastrados))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        // TODO add your handling code here:
        CampoNome.setText("");
        CampoValor.setText("");
        CampoValidade.setText("");
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        // TODO add your handling code here:
        
        String nome = CampoNome.getText();
        double valor = Double.parseDouble(CampoValor.getText());
        int data = Integer.parseInt(CampoValidade.getText());
        Comida comida = new Comida(nome, valor, new Date(), data);
        if(cc.salvar(comida)) {
            JOptionPane.showMessageDialog(null, "Comida cadastrada com sucesso!");
            CampoNome.setText("");
            CampoValor.setText("");
            CampoValidade.setText("");
            CampoNome.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar a comida.");
        }
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void BtnCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastradosActionPerformed
        // TODO add your handling code here:
        Principal principal = new Principal(cc);
        principal.setVisible(true);
        
    }//GEN-LAST:event_BtnCadastradosActionPerformed

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
    private javax.swing.JButton BtnCadastrados;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoValidade;
    private javax.swing.JTextField CampoValor;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelValidade;
    private javax.swing.JLabel LabelValor;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

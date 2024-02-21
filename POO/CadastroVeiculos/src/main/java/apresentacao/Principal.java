/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apresentacao;

import Exception.CampoVazioException;
import javax.swing.JOptionPane;
import negocios.Veiculo;
import persistencia.ControlaVeiculo;

/**
 *
 * @author Mateus Campos
 */
public class Principal extends javax.swing.JFrame {

    ControlaVeiculo cv = new ControlaVeiculo();

    public Principal() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfdNome = new javax.swing.JTextField();
        tfdMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfdPlaca = new javax.swing.JTextField();
        BtnSalvar = new javax.swing.JButton();
        BtnCadastrados = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();
        BtnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Veículos");

        jLabel1.setText("Nome:");

        jLabel2.setText("Marca:");

        jLabel3.setText("Placa:");

        tfdPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdPlacaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdMarca)
                    .addComponent(tfdNome)
                    .addComponent(tfdPlaca)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfdMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfdPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        BtnCadastrados.setText("Cadastrados");
        BtnCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastradosActionPerformed(evt);
            }
        });

        BtnLimpar.setText("Limpar");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        BtnSair.setText("Sair");
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnCadastrados)
                        .addGap(10, 10, 10)
                        .addComponent(BtnSalvar)
                        .addGap(10, 10, 10)
                        .addComponent(BtnLimpar)
                        .addGap(10, 10, 10)
                        .addComponent(BtnSair)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalvar)
                    .addComponent(BtnCadastrados)
                    .addComponent(BtnLimpar)
                    .addComponent(BtnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSairActionPerformed

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        try {
            Veiculo veiculo = new Veiculo();
            String nome = tfdNome.getText();
            String marca = tfdMarca.getText();
            String placaStr = tfdPlaca.getText();
            if (nome.isEmpty() || marca.isEmpty() || placaStr.isEmpty()) {
                throw new CampoVazioException("Por favor, preencha todos os campos");
            }
            int placa = Integer.parseInt(placaStr);
            veiculo.setNome(nome);
            veiculo.setMarca(marca);
            veiculo.setPlaca(placa);

            if (cv.salvar(veiculo)) {
                JOptionPane.showMessageDialog(null, "Veiculo cadastrado com sucesso!");
                tfdNome.setText("");
                tfdMarca.setText("");
                tfdPlaca.setText("");
                tfdNome.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar o veículo!");
            }
        } catch (CampoVazioException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um numero da placa valido!");
        } 
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void tfdPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdPlacaActionPerformed

    private void BtnCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastradosActionPerformed
        // TODO add your handling code here:
        DlgMostraVeiculos dlg = new DlgMostraVeiculos(null, true, cv);
        dlg.setVisible(true);
    }//GEN-LAST:event_BtnCadastradosActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        // TODO add your handling code here:
        tfdNome.setText("");
        tfdMarca.setText("");
        tfdPlaca.setText("");
    }//GEN-LAST:event_BtnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastrados;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnSair;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfdMarca;
    private javax.swing.JTextField tfdNome;
    private javax.swing.JTextField tfdPlaca;
    // End of variables declaration//GEN-END:variables
}
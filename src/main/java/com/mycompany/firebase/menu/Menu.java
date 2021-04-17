package com.mycompany.firebase.menu;

import static com.mycompany.firebase.util.Common.initFirebase;
/**
 *
 * @author Diogo Enrico Marianna
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        
        initFirebase();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBackground = new javax.swing.JPanel();
        btnFechar = new javax.swing.JButton();
        btnConnect = new javax.swing.JButton();
        btnSync = new javax.swing.JButton();
        panPesquisa = new javax.swing.JPanel();
        lblPesquisa = new javax.swing.JLabel();
        lblFaunaFlora = new javax.swing.JLabel();
        cbFaunaFlora = new javax.swing.JComboBox<>();
        lblGrupo = new javax.swing.JLabel();
        cbGrupo = new javax.swing.JComboBox<>();
        lblFamilia = new javax.swing.JLabel();
        cbFamilia = new javax.swing.JComboBox<>();
        lblEspecie = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        lblBioma = new javax.swing.JLabel();
        txtBioma = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnLimparPesquisa = new javax.swing.JButton();
        lblCatAmeaca = new javax.swing.JLabel();
        txtAmeaca = new javax.swing.JTextField();
        lblPrinAmeaca = new javax.swing.JLabel();
        txtPrinAmeaca = new javax.swing.JTextField();
        lblNomeComum = new javax.swing.JLabel();
        txtNomeComum = new javax.swing.JTextField();
        lblEstadosOcorrencia = new javax.swing.JLabel();
        txtOcorrencia = new javax.swing.JTextField();
        panRespostaServer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panBackground.setToolTipText("");
        panBackground.setAutoscrolls(true);
        panBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panBackground.setMaximumSize(new java.awt.Dimension(1280, 720));
        panBackground.setMinimumSize(new java.awt.Dimension(1280, 720));
        panBackground.setName(""); // NOI18N
        panBackground.setPreferredSize(new java.awt.Dimension(1280, 720));
        panBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFechar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        panBackground.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 130, 30));

        btnConnect.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConnect.setText("Connect");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });
        panBackground.add(btnConnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 110, 30));

        btnSync.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSync.setText("Sincronizar Dados");
        btnSync.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSyncActionPerformed(evt);
            }
        });
        panBackground.add(btnSync, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 180, 30));

        panPesquisa.setLayout(null);

        lblPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPesquisa.setText(" [ Pesquisa ]");
        lblPesquisa.setToolTipText("");
        lblPesquisa.setMaximumSize(new java.awt.Dimension(120, 16));
        lblPesquisa.setMinimumSize(new java.awt.Dimension(120, 16));
        panPesquisa.add(lblPesquisa);
        lblPesquisa.setBounds(0, 0, 100, 30);

        lblFaunaFlora.setText("  Fauna/Flora");
        panPesquisa.add(lblFaunaFlora);
        lblFaunaFlora.setBounds(10, 30, 80, 20);

        cbFaunaFlora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fauna", "Flora" }));
        cbFaunaFlora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFaunaFloraActionPerformed(evt);
            }
        });
        panPesquisa.add(cbFaunaFlora);
        cbFaunaFlora.setBounds(0, 50, 130, 30);

        lblGrupo.setText("Grupo");
        panPesquisa.add(lblGrupo);
        lblGrupo.setBounds(170, 30, 40, 20);

        cbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "firebase..." }));
        cbGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGrupoActionPerformed(evt);
            }
        });
        panPesquisa.add(cbGrupo);
        cbGrupo.setBounds(160, 50, 140, 30);

        lblFamilia.setText("Familia");
        panPesquisa.add(lblFamilia);
        lblFamilia.setBounds(340, 30, 340, 20);

        cbFamilia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "firebase..." }));
        cbFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFamiliaActionPerformed(evt);
            }
        });
        panPesquisa.add(cbFamilia);
        cbFamilia.setBounds(330, 50, 290, 30);

        lblEspecie.setText("Especie");
        panPesquisa.add(lblEspecie);
        lblEspecie.setBounds(660, 30, 60, 16);

        txtEspecie.setText("input para pesquisa firebase...");
        txtEspecie.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        panPesquisa.add(txtEspecie);
        txtEspecie.setBounds(650, 50, 180, 30);

        lblBioma.setText("Bioma");
        panPesquisa.add(lblBioma);
        lblBioma.setBounds(860, 30, 60, 16);

        txtBioma.setText("input para pesquisa firebase...");
        txtBioma.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        panPesquisa.add(txtBioma);
        txtBioma.setBounds(850, 50, 180, 30);

        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        panPesquisa.add(btnPesquisar);
        btnPesquisar.setBounds(1100, 30, 140, 50);

        btnLimparPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimparPesquisa.setText("Limpar");
        btnLimparPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparPesquisaActionPerformed(evt);
            }
        });
        panPesquisa.add(btnLimparPesquisa);
        btnLimparPesquisa.setBounds(1100, 90, 140, 50);

        lblCatAmeaca.setText("Categoria de Ameaça");
        panPesquisa.add(lblCatAmeaca);
        lblCatAmeaca.setBounds(10, 90, 120, 16);

        txtAmeaca.setText("input para pesquisa firebase...");
        panPesquisa.add(txtAmeaca);
        txtAmeaca.setBounds(0, 110, 300, 30);

        lblPrinAmeaca.setText("Principais Ameaças");
        panPesquisa.add(lblPrinAmeaca);
        lblPrinAmeaca.setBounds(340, 90, 120, 16);

        txtPrinAmeaca.setText("input para pesquisa firebase...");
        panPesquisa.add(txtPrinAmeaca);
        txtPrinAmeaca.setBounds(330, 110, 290, 30);

        lblNomeComum.setText("Nome Comum");
        panPesquisa.add(lblNomeComum);
        lblNomeComum.setBounds(660, 90, 90, 16);

        txtNomeComum.setText("input para pesquisa firebase...");
        panPesquisa.add(txtNomeComum);
        txtNomeComum.setBounds(650, 110, 180, 30);

        lblEstadosOcorrencia.setText("Estado de Ocorrencia");
        panPesquisa.add(lblEstadosOcorrencia);
        lblEstadosOcorrencia.setBounds(860, 90, 90, 16);

        txtOcorrencia.setText("input para pesquisa firebase...");
        panPesquisa.add(txtOcorrencia);
        txtOcorrencia.setBounds(850, 110, 180, 30);

        panBackground.add(panPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 1240, 160));

        panRespostaServer.setBorder(new javax.swing.border.MatteBorder(null));
        panBackground.add(panRespostaServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 1240, 470));

        getContentPane().add(panBackground, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnConnectActionPerformed

    private void btnSyncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSyncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSyncActionPerformed

    private void cbFaunaFloraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFaunaFloraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFaunaFloraActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnLimparPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparPesquisaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void cbGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGrupoActionPerformed

    private void cbFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFamiliaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFamiliaActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimparPesquisa;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSync;
    private javax.swing.JComboBox<String> cbFamilia;
    private javax.swing.JComboBox<String> cbFaunaFlora;
    private javax.swing.JComboBox<String> cbGrupo;
    private javax.swing.JLabel lblBioma;
    private javax.swing.JLabel lblCatAmeaca;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblEstadosOcorrencia;
    private javax.swing.JLabel lblFamilia;
    private javax.swing.JLabel lblFaunaFlora;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblNomeComum;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JLabel lblPrinAmeaca;
    private javax.swing.JPanel panBackground;
    private javax.swing.JPanel panPesquisa;
    private javax.swing.JPanel panRespostaServer;
    private javax.swing.JTextField txtAmeaca;
    private javax.swing.JTextField txtBioma;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtNomeComum;
    private javax.swing.JTextField txtOcorrencia;
    private javax.swing.JTextField txtPrinAmeaca;
    // End of variables declaration//GEN-END:variables
}

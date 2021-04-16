package com.mycompany.firebase.menu;

import static com.mycompany.firebase.util.Common.initFirebase;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        
        initFirebase();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Fechar = new javax.swing.JButton();
        Connect = new javax.swing.JButton();
        Sync = new javax.swing.JButton();
        pesquisa = new javax.swing.JPanel();
        Pesquisa = new javax.swing.JLabel();
        faunaFlora1 = new javax.swing.JLabel();
        opFaunaFlora = new javax.swing.JComboBox<>();
        grupo = new javax.swing.JLabel();
        opGrupo = new javax.swing.JComboBox<>();
        familia = new javax.swing.JLabel();
        opFamilia = new javax.swing.JComboBox<>();
        especie = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        bioma = new javax.swing.JLabel();
        txtBioma = new javax.swing.JTextField();
        pesquisar = new javax.swing.JButton();
        limparPesquisa = new javax.swing.JButton();
        catAmeaca = new javax.swing.JLabel();
        txtAmeaca = new javax.swing.JTextField();
        prinAmeaca = new javax.swing.JLabel();
        txtPrinAmeaca = new javax.swing.JTextField();
        nomeComum = new javax.swing.JLabel();
        txtNomeComum = new javax.swing.JTextField();
        estadosOcorrencia = new javax.swing.JLabel();
        txtOcorrencia = new javax.swing.JTextField();
        respostaServer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        Background.setToolTipText("");
        Background.setAutoscrolls(true);
        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Background.setMaximumSize(new java.awt.Dimension(1280, 720));
        Background.setMinimumSize(new java.awt.Dimension(1280, 720));
        Background.setName(""); // NOI18N
        Background.setPreferredSize(new java.awt.Dimension(1280, 720));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fechar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Fechar.setText("Fechar");
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });
        Background.add(Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 130, 30));

        Connect.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Connect.setText("Connect");
        Connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectActionPerformed(evt);
            }
        });
        Background.add(Connect, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 110, 30));

        Sync.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Sync.setText("Sincronizar Dados");
        Sync.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SyncActionPerformed(evt);
            }
        });
        Background.add(Sync, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 180, 30));

        pesquisa.setLayout(null);

        Pesquisa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Pesquisa.setText(" [ Pesquisa ]");
        Pesquisa.setToolTipText("");
        Pesquisa.setMaximumSize(new java.awt.Dimension(120, 16));
        Pesquisa.setMinimumSize(new java.awt.Dimension(120, 16));
        pesquisa.add(Pesquisa);
        Pesquisa.setBounds(0, 0, 100, 30);

        faunaFlora1.setText("  Fauna/Flora");
        pesquisa.add(faunaFlora1);
        faunaFlora1.setBounds(10, 30, 80, 20);

        opFaunaFlora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fauna", "Flora" }));
        opFaunaFlora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opFaunaFloraActionPerformed(evt);
            }
        });
        pesquisa.add(opFaunaFlora);
        opFaunaFlora.setBounds(0, 50, 130, 30);

        grupo.setText("Grupo");
        pesquisa.add(grupo);
        grupo.setBounds(170, 30, 40, 20);

        opGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "firebase..." }));
        opGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opGrupoActionPerformed(evt);
            }
        });
        pesquisa.add(opGrupo);
        opGrupo.setBounds(160, 50, 140, 30);

        familia.setText("Familia");
        pesquisa.add(familia);
        familia.setBounds(340, 30, 340, 20);

        opFamilia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "firebase..." }));
        opFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opFamiliaActionPerformed(evt);
            }
        });
        pesquisa.add(opFamilia);
        opFamilia.setBounds(330, 50, 290, 30);

        especie.setText("Especie");
        pesquisa.add(especie);
        especie.setBounds(660, 30, 60, 16);

        txtEspecie.setText("input para pesquisa firebase...");
        txtEspecie.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pesquisa.add(txtEspecie);
        txtEspecie.setBounds(650, 50, 180, 30);

        bioma.setText("Bioma");
        pesquisa.add(bioma);
        bioma.setBounds(860, 30, 60, 16);

        txtBioma.setText("input para pesquisa firebase...");
        txtBioma.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pesquisa.add(txtBioma);
        txtBioma.setBounds(850, 50, 180, 30);

        pesquisar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });
        pesquisa.add(pesquisar);
        pesquisar.setBounds(1100, 30, 140, 50);

        limparPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        limparPesquisa.setText("Limpar");
        limparPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparPesquisaActionPerformed(evt);
            }
        });
        pesquisa.add(limparPesquisa);
        limparPesquisa.setBounds(1100, 90, 140, 50);

        catAmeaca.setText("Categoria de Ameaça");
        pesquisa.add(catAmeaca);
        catAmeaca.setBounds(10, 90, 120, 16);

        txtAmeaca.setText("input para pesquisa firebase...");
        pesquisa.add(txtAmeaca);
        txtAmeaca.setBounds(0, 110, 300, 30);

        prinAmeaca.setText("Principais Ameaças");
        pesquisa.add(prinAmeaca);
        prinAmeaca.setBounds(340, 90, 120, 16);

        txtPrinAmeaca.setText("input para pesquisa firebase...");
        pesquisa.add(txtPrinAmeaca);
        txtPrinAmeaca.setBounds(330, 110, 290, 30);

        nomeComum.setText("Nome Comum");
        pesquisa.add(nomeComum);
        nomeComum.setBounds(660, 90, 90, 16);

        txtNomeComum.setText("input para pesquisa firebase...");
        pesquisa.add(txtNomeComum);
        txtNomeComum.setBounds(650, 110, 180, 30);

        estadosOcorrencia.setText("Estado de Ocorrencia");
        pesquisa.add(estadosOcorrencia);
        estadosOcorrencia.setBounds(860, 90, 90, 16);

        txtOcorrencia.setText("input para pesquisa firebase...");
        pesquisa.add(txtOcorrencia);
        txtOcorrencia.setBounds(850, 110, 180, 30);

        Background.add(pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 1240, 160));

        respostaServer.setBorder(new javax.swing.border.MatteBorder(null));
        Background.add(respostaServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 1240, 470));

        getContentPane().add(Background, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConnectActionPerformed

    private void SyncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SyncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SyncActionPerformed

    private void opFaunaFloraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opFaunaFloraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opFaunaFloraActionPerformed

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FecharActionPerformed

    private void limparPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limparPesquisaActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarActionPerformed

    private void opGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opGrupoActionPerformed

    private void opFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opFamiliaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opFamiliaActionPerformed

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
    private javax.swing.JPanel Background;
    private javax.swing.JButton Connect;
    private javax.swing.JButton Fechar;
    private javax.swing.JLabel Pesquisa;
    private javax.swing.JButton Sync;
    private javax.swing.JLabel bioma;
    private javax.swing.JLabel catAmeaca;
    private javax.swing.JLabel especie;
    private javax.swing.JLabel estadosOcorrencia;
    private javax.swing.JLabel familia;
    private javax.swing.JLabel faunaFlora1;
    private javax.swing.JLabel grupo;
    private javax.swing.JButton limparPesquisa;
    private javax.swing.JLabel nomeComum;
    private javax.swing.JComboBox<String> opFamilia;
    private javax.swing.JComboBox<String> opFaunaFlora;
    private javax.swing.JComboBox<String> opGrupo;
    private javax.swing.JPanel pesquisa;
    private javax.swing.JButton pesquisar;
    private javax.swing.JLabel prinAmeaca;
    private javax.swing.JPanel respostaServer;
    private javax.swing.JTextField txtAmeaca;
    private javax.swing.JTextField txtBioma;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtNomeComum;
    private javax.swing.JTextField txtOcorrencia;
    private javax.swing.JTextField txtPrinAmeaca;
    // End of variables declaration//GEN-END:variables
}

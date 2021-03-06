/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisvendas.view.user.menu;

import java.awt.Toolkit;

/**
 *
 * @author Neto
 */
public class MenuUser extends javax.swing.JFrame {

    /**
     * Creates new form MenuUser
     */
    public MenuUser() {
        initComponents();
        setIcone();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        cadastroButton = new javax.swing.JButton();
        procuraButton = new javax.swing.JButton();
        reservaButton = new javax.swing.JButton();
        caixaButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SISVENDAS - Menu");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisvendas/view/user/menu/fundo_menu.png"))); // NOI18N

        jToolBar1.setRollover(true);

        cadastroButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisvendas/view/user/menu/cadastro.png"))); // NOI18N
        cadastroButton.setText("Meus dados");
        cadastroButton.setToolTipText("Clique aqui para atualizar seus dados cadastrais");
        cadastroButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cadastroButton.setFocusable(false);
        cadastroButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cadastroButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(cadastroButton);

        procuraButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisvendas/view/user/menu/search2.png"))); // NOI18N
        procuraButton.setText("Procurar");
        procuraButton.setToolTipText("Clique aqui para procurar algum item da livraria");
        procuraButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        procuraButton.setFocusable(false);
        procuraButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        procuraButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        procuraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procuraButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(procuraButton);

        reservaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisvendas/view/user/menu/reserva.png"))); // NOI18N
        reservaButton.setText("Reservar");
        reservaButton.setToolTipText("Clique aqui para fazer alguma reserva");
        reservaButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reservaButton.setFocusable(false);
        reservaButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reservaButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        reservaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservaButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(reservaButton);

        caixaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisvendas/view/user/menu/cashbox.png"))); // NOI18N
        caixaButton.setText("Abrir caixa");
        caixaButton.setToolTipText("Clique aqui para abrir o caixa");
        caixaButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        caixaButton.setFocusable(false);
        caixaButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        caixaButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        caixaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(caixaButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))))
        );

        setSize(new java.awt.Dimension(396, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reservaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservaButtonActionPerformed
       String args[] = new String[2];
       args[0] = "SISVENDAS - Reserva de Itens";
       args[1] = jLabel2.getText();
             ReservaSimples.main(args); 
    }//GEN-LAST:event_reservaButtonActionPerformed

    private void procuraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procuraButtonActionPerformed
       String args[] = new String[1];
       args[0] = "SISVENDAS - Busca de Itens";
             ConsultaProduto.main(args); 
    }//GEN-LAST:event_procuraButtonActionPerformed

    private void cadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtonActionPerformed
        String args[] = new String[1];
       args[0] = jLabel2.getText();
             AlteraDadosCadastrais.main(args);   
        
            
    }//GEN-LAST:event_cadastroButtonActionPerformed

    private void caixaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaButtonActionPerformed
        String args[] = new String[1];
       args[0] = jLabel2.getText();
        ViewCaixa.main(args);
        dispose();
    }//GEN-LAST:event_caixaButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(final String args[]) {
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
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUser().setVisible(true);
                jLabel2.setVisible(false);
                jLabel2.setText(args[0]);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroButton;
    private javax.swing.JButton caixaButton;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton procuraButton;
    private javax.swing.JButton reservaButton;
    // End of variables declaration//GEN-END:variables


private void setIcone() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("finance.png")));
    }


}

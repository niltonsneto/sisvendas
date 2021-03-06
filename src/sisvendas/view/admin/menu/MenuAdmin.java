/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisvendas.view.admin.menu;

import java.awt.Toolkit;

/**
 *
 * @author Neto
 */
public class MenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdmin
     */
    public MenuAdmin() {
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

        jToolBar1 = new javax.swing.JToolBar();
        usrButton = new javax.swing.JButton();
        cargoButton = new javax.swing.JButton();
        categoriaButton = new javax.swing.JButton();
        estoqueButton = new javax.swing.JButton();
        relatButton = new javax.swing.JButton();
        reservaButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISVENDAS - Área restrita");

        jToolBar1.setRollover(true);

        usrButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisvendas/view/admin/menu/usuario.png"))); // NOI18N
        usrButton.setText("Usuários");
        usrButton.setToolTipText("Clique aqui para administrar os usuários do sistema");
        usrButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        usrButton.setFocusable(false);
        usrButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        usrButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        usrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(usrButton);

        cargoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisvendas/view/admin/menu/cargos.png"))); // NOI18N
        cargoButton.setText("Cargos");
        cargoButton.setToolTipText("Clique aqui para registrar um novo cargo");
        cargoButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cargoButton.setFocusable(false);
        cargoButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cargoButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cargoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(cargoButton);

        categoriaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisvendas/view/admin/menu/categories.png"))); // NOI18N
        categoriaButton.setText("Categoria");
        categoriaButton.setToolTipText("Clique aqui para incluir uma nova categoria");
        categoriaButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        categoriaButton.setFocusable(false);
        categoriaButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        categoriaButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        categoriaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(categoriaButton);

        estoqueButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisvendas/view/admin/menu/produtos.png"))); // NOI18N
        estoqueButton.setText("Estoque");
        estoqueButton.setToolTipText("Clique aqui para fazer manutenção do estoque");
        estoqueButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        estoqueButton.setFocusable(false);
        estoqueButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        estoqueButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        estoqueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoqueButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(estoqueButton);

        relatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisvendas/view/admin/menu/reports.png"))); // NOI18N
        relatButton.setText("Relatórios");
        relatButton.setToolTipText("Clique aqui para obter os movimentos de caixa");
        relatButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        relatButton.setFocusable(false);
        relatButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        relatButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(relatButton);

        reservaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisvendas/view/admin/menu/list.png"))); // NOI18N
        reservaButton.setText("Reservas");
        reservaButton.setToolTipText("Clique aqui para atualizar as reservas efetuadas");
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

        sairButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisvendas/view/admin/menu/LogOut.png"))); // NOI18N
        sairButton.setText("Sair");
        sairButton.setToolTipText("Clique aqui para fazer logout");
        sairButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sairButton.setFocusable(false);
        sairButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sairButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(sairButton);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisvendas/view/admin/menu/vendas.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(394, 329));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
       System.exit(0);
    }//GEN-LAST:event_sairButtonActionPerformed

    private void usrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrButtonActionPerformed
        String args[] = new String[1];
        args[0] = "SISVENDAS - Cadastro de usuários";
        CadastroUsr.main(args);
    }//GEN-LAST:event_usrButtonActionPerformed

    private void cargoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoButtonActionPerformed
        String args[] = new String[1];
        args[0] = "SISVENDAS - Cadastro de cargos";
        CargoView.main(args);
    }//GEN-LAST:event_cargoButtonActionPerformed

    private void estoqueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoqueButtonActionPerformed
         String args[] = new String[1];
        args[0] = "SISVENDAS - Cadastro de produtos no estoque";
        CadastroProduto.main(args);
    }//GEN-LAST:event_estoqueButtonActionPerformed

    private void categoriaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaButtonActionPerformed
        String args[] = new String[1];
        args[0] = "SISVENDAS - Cadastro de categorias";
        CadTipo.main(args);
    }//GEN-LAST:event_categoriaButtonActionPerformed

    private void reservaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservaButtonActionPerformed
        String args[] = new String[1];
        args[0] = "SISVENDAS - Controle de reservas";
        ControleReservas.main(args);
    }//GEN-LAST:event_reservaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargoButton;
    private javax.swing.JButton categoriaButton;
    private javax.swing.JButton estoqueButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton relatButton;
    private javax.swing.JButton reservaButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JButton usrButton;
    // End of variables declaration//GEN-END:variables

private void setIcone() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("finance.png")));
    }

}

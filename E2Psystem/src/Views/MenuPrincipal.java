package Views;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class MenuPrincipal extends javax.swing.JFrame {
    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        decoratedDesktopPane11 = new Models.DecoratedDesktopPane1();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemFrenteCaixa = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemProdutos = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E2P System");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jDesktopPane1.setLayer(decoratedDesktopPane11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(decoratedDesktopPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(decoratedDesktopPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );

        jMenu1.setText("Controle de Vendas");

        jMenuItemFrenteCaixa.setText("Frente de Caixa");
        jMenuItemFrenteCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFrenteCaixaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemFrenteCaixa);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadastros");

        jMenuItemCliente.setText("Clientes");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCliente);
        jMenu2.add(jSeparator1);

        jMenuItemProdutos.setText("Produtos");
        jMenuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutosActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemProdutos);
        jMenu2.add(jSeparator3);

        jMenuItem2.setText("Funcionários");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Opções");
        jMenu3.add(jSeparator2);

        jMenu4.setText("Relatórios");

        jMenuItem3.setText("Vendas");
        jMenu4.add(jMenuItem3);

        jMenu3.add(jMenu4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void centralizarInternalFrame(JFrame parent, JInternalFrame internalFrame){
        int lDesk = this.getWidth();
        int aDesk = this.getHeight();
        int lIFrame = internalFrame.getWidth();
        int aIFrame = internalFrame.getHeight();
        internalFrame.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
    }
    
    private void jMenuItemFrenteCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFrenteCaixaActionPerformed
        // TODO add your handling code here:
        FrenteCaixa tela = new FrenteCaixa();
        jDesktopPane1.add(tela);
        centralizarInternalFrame(this, tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemFrenteCaixaActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        // TODO add your handling code here:
        ConsultaClientes tela = new ConsultaClientes();
        jDesktopPane1.add(tela);
        centralizarInternalFrame(this, tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutosActionPerformed
        // TODO add your handling code here:
        CadastroProdutos tela = new CadastroProdutos();
        jDesktopPane1.add(tela);
        centralizarInternalFrame(this, tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemProdutosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
        jDesktopPane1.add(cadastroFuncionario);
        centralizarInternalFrame(this, cadastroFuncionario);
        cadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Models.DecoratedDesktopPane1 decoratedDesktopPane11;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemFrenteCaixa;
    private javax.swing.JMenuItem jMenuItemProdutos;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}

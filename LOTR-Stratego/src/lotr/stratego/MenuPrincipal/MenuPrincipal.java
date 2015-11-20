/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotr.stratego.MenuPrincipal;

import MiPerfil.MiPerfil;

/**
 *
 * @author samuelborjas
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        cmdStrategoLOTR = new javax.swing.JButton();
        cmdMiPerfil = new javax.swing.JButton();
        cmdConfiguracion = new javax.swing.JButton();
        cmdTierraMedia = new javax.swing.JButton();
        cmdCerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdStrategoLOTR.setFont(new java.awt.Font("Baskerville", 0, 18)); // NOI18N
        cmdStrategoLOTR.setText("* STRATEGO - LOTR!");
        cmdStrategoLOTR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdStrategoLOTRActionPerformed(evt);
            }
        });
        getContentPane().add(cmdStrategoLOTR, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        cmdMiPerfil.setFont(new java.awt.Font("Baskerville", 0, 18)); // NOI18N
        cmdMiPerfil.setText("Mi Perfil");
        cmdMiPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMiPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(cmdMiPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        cmdConfiguracion.setFont(new java.awt.Font("Baskerville", 0, 18)); // NOI18N
        cmdConfiguracion.setText("Configuracion");
        cmdConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConfiguracionActionPerformed(evt);
            }
        });
        getContentPane().add(cmdConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        cmdTierraMedia.setFont(new java.awt.Font("Baskerville", 0, 18)); // NOI18N
        cmdTierraMedia.setText("Tierra Media");
        cmdTierraMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTierraMediaActionPerformed(evt);
            }
        });
        getContentPane().add(cmdTierraMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        cmdCerrarSesion.setFont(new java.awt.Font("Baskerville", 0, 18)); // NOI18N
        cmdCerrarSesion.setText("Cerrar Sesion");
        cmdCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lotr/stratego/VisualAssets/principal.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdMiPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMiPerfilActionPerformed
        
    }//GEN-LAST:event_cmdMiPerfilActionPerformed

    private void cmdConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConfiguracionActionPerformed
         System.out.println("CONFIGURAR");
    }//GEN-LAST:event_cmdConfiguracionActionPerformed

    private void cmdStrategoLOTRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdStrategoLOTRActionPerformed
        System.out.println("ESTRATEGO");
    }//GEN-LAST:event_cmdStrategoLOTRActionPerformed

    private void cmdTierraMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTierraMediaActionPerformed
        System.out.println("TIERRA");
    }//GEN-LAST:event_cmdTierraMediaActionPerformed

    private void cmdCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCerrarSesionActionPerformed
        this.dispose();
        System.out.println("Cerrar sesion");
    }//GEN-LAST:event_cmdCerrarSesionActionPerformed

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
    private javax.swing.JButton cmdCerrarSesion;
    private javax.swing.JButton cmdConfiguracion;
    private javax.swing.JButton cmdMiPerfil;
    private javax.swing.JButton cmdStrategoLOTR;
    private javax.swing.JButton cmdTierraMedia;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

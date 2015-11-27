/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotr.stratego;

import MiPerfil.MiPerfil;
import javax.swing.JOptionPane;
import lotr.stratego.Player;

/**
 *
 * @author samuelborjas
 */
public class CambiarPass extends javax.swing.JFrame {

    /**
     * Creates new form CambiarPass
     */
    public CambiarPass() {
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

        cmdCambiarPass = new javax.swing.JButton();
        cmdRegresar = new javax.swing.JButton();
        txtCambiarPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCambiarPass.setFont(new java.awt.Font("Baskerville", 0, 18)); // NOI18N
        cmdCambiarPass.setText("Cambiar Contraseña");
        cmdCambiarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCambiarPassActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCambiarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 230, -1));

        cmdRegresar.setFont(new java.awt.Font("Baskerville", 0, 18)); // NOI18N
        cmdRegresar.setText("Regresar a menu Perfil");
        cmdRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, 30));

        txtCambiarPass.setFont(new java.awt.Font("Baskerville", 0, 18)); // NOI18N
        getContentPane().add(txtCambiarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, -1));

        jLabel2.setFont(new java.awt.Font("Baskerville", 1, 24)); // NOI18N
        jLabel2.setText("Ingresar nueva contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lotr/stratego/VisualAssets/cambiarpass.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegresarActionPerformed
        this.dispose();
        MiPerfil mp = new MiPerfil();
        mp.setVisible(true);
    }//GEN-LAST:event_cmdRegresarActionPerformed

    private void cmdCambiarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCambiarPassActionPerformed
       
        
        if(txtCambiarPass.getPassword().length == 0){
            JOptionPane.showMessageDialog(null, "No puede dejar vacio. Porfavor ingrese una contraseña valida!");
            txtCambiarPass.setText("");
            return;
        }
      
        if(txtCambiarPass.getPassword().length <5){
            JOptionPane.showMessageDialog(null, "Contraseña muy corta. Debe de ser exactamente de 5 caracteres!");
            txtCambiarPass.setText("");
            return;
        }
            
        if(txtCambiarPass.getPassword().length>5){
            JOptionPane.showMessageDialog(null, "Contraseña muy larga. Debe de ser exactamente de 5 caracteres!");
            txtCambiarPass.setText("");
            return;
        }
        
        int reply = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere cambiar la contraseña?", "Cambiar Contraseña", JOptionPane.YES_NO_OPTION);        
            
        if (reply == JOptionPane.YES_OPTION) {
            Player.currentPlayer.setPass(String.valueOf(txtCambiarPass.getPassword()));
            JOptionPane.showMessageDialog(null, "Contraseña cambiada exitosamente!!");
            txtCambiarPass.setText(null);
            this.dispose();
        }
    }//GEN-LAST:event_cmdCambiarPassActionPerformed

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
            java.util.logging.Logger.getLogger(CambiarPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambiarPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambiarPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambiarPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCambiarPass;
    private javax.swing.JButton cmdRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtCambiarPass;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotr.stratego;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import static lotr.stratego.Player.currentPlayer;

/**
 *
 * @author Roberto Melara
 */
public class SignInForm extends javax.swing.JFrame {

    /**
     * Creates new form SignInForm
     */
    public SignInForm() {
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

        jLabelTitle = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabelSignIn = new javax.swing.JLabel();
        jLabelWarning = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Baskerville", 0, 48)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(18, 11, 11));
        jLabelTitle.setText("LOTR  Stratego");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabelUser.setFont(new java.awt.Font("Baskerville", 0, 36)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(174, 153, 108));
        jLabelUser.setText("Username");
        getContentPane().add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jLabelPassword.setFont(new java.awt.Font("Baskerville", 0, 36)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(174, 153, 108));
        jLabelPassword.setText("Password");
        getContentPane().add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));
        getContentPane().add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 160, 30));
        getContentPane().add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 160, 30));

        jLabelSignIn.setFont(new java.awt.Font("Baskerville", 0, 36)); // NOI18N
        jLabelSignIn.setForeground(new java.awt.Color(174, 153, 108));
        jLabelSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSignIn.setText("Sign In");
        jLabelSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelSignInMousePressed(evt);
            }
        });
        getContentPane().add(jLabelSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 400, 210, 210));

        jLabelWarning.setFont(new java.awt.Font("Ringbearer", 0, 16)); // NOI18N
        jLabelWarning.setForeground(new java.awt.Color(174, 153, 108));
        jLabelWarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 750, 40));

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lotr/stratego/VisualAssets/SignIn.png"))); // NOI18N
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelSignInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignInMousePressed
        String user = jTextFieldUsername.getText();
        String pass = String.valueOf(jPasswordFieldPassword.getPassword());
        
        if(Player.validar(user,pass)){  
            JOptionPane.showMessageDialog(null, "Bienvenido!!!"); 
                MenuPrincipal mp = new MenuPrincipal();
                mp.setVisible(true); 
                jTextFieldUsername.setText("");
                jPasswordFieldPassword.setText(null);
                this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta...intente de nuevo!!");
            jTextFieldUsername.setText("");
            jPasswordFieldPassword.setText(null);
        }
 
    }//GEN-LAST:event_jLabelSignInMousePressed

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
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignInForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelSignIn;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelWarning;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}

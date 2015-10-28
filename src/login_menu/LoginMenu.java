/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_menu;


/**
 *
 * @author Jorge
 */


import javax.swing.JOptionPane;


public class LoginMenu extends javax.swing.JFrame {
    
    Object[] options = { "Intentar de Nuevo", "Cancelar" };
    MainMenu open = new MainMenu();
    
    
    public static Player currentPlayer, secondPlayer;
   
    public LoginMenu() {
        initComponents();
        Login_Pane.setVisible(false);
        NewPlayer_Pane.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginMenu_Pane = new javax.swing.JLayeredPane();
        btnLogin = new javax.swing.JButton();
        btnNewPlayer = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Login_Pane = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLoginPlayer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        NewPlayer_Pane = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        txtNewUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JPasswordField();
        btnCreatePlayer = new javax.swing.JButton();
        btn_regresaralmenuinicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnLogin.setText("Iniciar Sesión");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnNewPlayer.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnNewPlayer.setText("Crear Jugador");
        btnNewPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPlayerActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 102, 0));
        jLabel5.setText("GO-CHESS");

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/samuelborjas/Desktop/tablero_lleno.jpg")); // NOI18N

        javax.swing.GroupLayout LoginMenu_PaneLayout = new javax.swing.GroupLayout(LoginMenu_Pane);
        LoginMenu_Pane.setLayout(LoginMenu_PaneLayout);
        LoginMenu_PaneLayout.setHorizontalGroup(
            LoginMenu_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginMenu_PaneLayout.createSequentialGroup()
                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginMenu_PaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LoginMenu_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginMenu_PaneLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginMenu_PaneLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(67, 67, 67))))
        );
        LoginMenu_PaneLayout.setVerticalGroup(
            LoginMenu_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(LoginMenu_PaneLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginMenu_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNewPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        LoginMenu_Pane.setLayer(btnLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LoginMenu_Pane.setLayer(btnNewPlayer, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LoginMenu_Pane.setLayer(btnExit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LoginMenu_Pane.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LoginMenu_Pane.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(LoginMenu_Pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 390));

        Login_Pane.setPreferredSize(new java.awt.Dimension(406, 369));

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        btnLoginPlayer.setText("Iniciar Sesión");
        btnLoginPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginPlayerActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar al menu de inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Login_PaneLayout = new javax.swing.GroupLayout(Login_Pane);
        Login_Pane.setLayout(Login_PaneLayout);
        Login_PaneLayout.setHorizontalGroup(
            Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Login_PaneLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLoginPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPassword)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(95, 95, 95))
        );
        Login_PaneLayout.setVerticalGroup(
            Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_PaneLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoginPlayer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        Login_Pane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Login_Pane.setLayer(txtUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Login_Pane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Login_Pane.setLayer(txtPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Login_Pane.setLayer(btnLoginPlayer, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Login_Pane.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(Login_Pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        NewPlayer_Pane.setPreferredSize(new java.awt.Dimension(406, 369));

        jLabel3.setText("Usuario:");

        jLabel4.setText("Contraseña:");

        txtNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPasswordActionPerformed(evt);
            }
        });

        btnCreatePlayer.setText("Crear Usuario");
        btnCreatePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePlayerActionPerformed(evt);
            }
        });

        btn_regresaralmenuinicio.setText("Regresar al menu Inicio");
        btn_regresaralmenuinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresaralmenuinicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NewPlayer_PaneLayout = new javax.swing.GroupLayout(NewPlayer_Pane);
        NewPlayer_Pane.setLayout(NewPlayer_PaneLayout);
        NewPlayer_PaneLayout.setHorizontalGroup(
            NewPlayer_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewPlayer_PaneLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(NewPlayer_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NewPlayer_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCreatePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_regresaralmenuinicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NewPlayer_PaneLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(NewPlayer_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        NewPlayer_PaneLayout.setVerticalGroup(
            NewPlayer_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewPlayer_PaneLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreatePlayer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_regresaralmenuinicio)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        NewPlayer_Pane.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        NewPlayer_Pane.setLayer(txtNewUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        NewPlayer_Pane.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        NewPlayer_Pane.setLayer(txtNewPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        NewPlayer_Pane.setLayer(btnCreatePlayer, javax.swing.JLayeredPane.DEFAULT_LAYER);
        NewPlayer_Pane.setLayer(btn_regresaralmenuinicio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(NewPlayer_Pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPlayerActionPerformed
        LoginMenu_Pane.setVisible(false);
        NewPlayer_Pane.setVisible(true);
    }//GEN-LAST:event_btnNewPlayerActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        LoginMenu_Pane.setVisible(false);
        Login_Pane.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginPlayerActionPerformed
        if(Player.authenticatePlayer(txtUsername.getText(),String.valueOf(txtPassword.getPassword()))){
            open.setVisible(true);
            this.dispose();
        }else{         
            txtPassword.setText("");
        }
    }//GEN-LAST:event_btnLoginPlayerActionPerformed

    private void btnCreatePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePlayerActionPerformed
        
        if(txtNewUsername.getText().isEmpty() || txtNewPassword.getPassword().length==0){ 
            JOptionPane.showMessageDialog(null, "No pueden haber casillas en blanco!!");                          
        }else{ 
        
        if(Player.findPlayer(txtNewUsername.getText()) != null){
            if(JOptionPane.showOptionDialog(null, "Usuario ya existe.\nPresione Cancelar para regresar al menu.", "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]) == 1){
                NewPlayer_Pane.setVisible(false);
                LoginMenu_Pane.setVisible(true);
            }
        }else{
                
        if(txtNewPassword.getPassword().length>5){
            if(JOptionPane.showOptionDialog(null, "Contrase\u00f1a debe ser igual a 5 caracteres.\nPresione Cancelar para regresar al menu.", "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0])==1){
                NewPlayer_Pane.setVisible(false);
                LoginMenu_Pane.setVisible(true);
                                
                txtNewPassword.setText("");
            }
        }else{
            currentPlayer = new Player(txtNewUsername.getText(), String.valueOf(txtNewPassword.getPassword()));
            Player.players.add(currentPlayer);
            open.setVisible(true);
            this.dispose();   
                }
            }
        }
        
    }//GEN-LAST:event_btnCreatePlayerActionPerformed

    private void txtNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPasswordActionPerformed

    private void btn_regresaralmenuinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresaralmenuinicioActionPerformed
        NewPlayer_Pane.setVisible(false);
        LoginMenu_Pane.setVisible(true);
    }//GEN-LAST:event_btn_regresaralmenuinicioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login_Pane.setVisible(false);
        LoginMenu_Pane.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane LoginMenu_Pane;
    private javax.swing.JLayeredPane Login_Pane;
    private javax.swing.JLayeredPane NewPlayer_Pane;
    private javax.swing.JButton btnCreatePlayer;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLoginPlayer;
    private javax.swing.JButton btnNewPlayer;
    private javax.swing.JButton btn_regresaralmenuinicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtNewUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

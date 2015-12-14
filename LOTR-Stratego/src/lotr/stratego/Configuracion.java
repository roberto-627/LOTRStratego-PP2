/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotr.stratego;

/**
 *
 * @author Roberto Melara
 */
public class Configuracion extends javax.swing.JFrame {

    /**
     * Creates new form Configuracion
     */
    public Configuracion() {
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

        jLabelModoTtuorial = new javax.swing.JLabel();
        jLabelModoTutorialTxt = new javax.swing.JLabel();
        jLabelModoCalsicoTxt = new javax.swing.JLabel();
        jLabelTittle = new javax.swing.JLabel();
        jLabelModoClasico = new javax.swing.JLabel();
        jLabelSeleccion = new javax.swing.JLabel();
        jLabelRegresar = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Configuracion");
        setMaximumSize(new java.awt.Dimension(889, 520));
        setMinimumSize(new java.awt.Dimension(889, 520));
        setPreferredSize(new java.awt.Dimension(889, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelModoTtuorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lotr/stratego/Modo Clasico.png"))); // NOI18N
        jLabelModoTtuorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelModoTtuorialMousePressed(evt);
            }
        });
        getContentPane().add(jLabelModoTtuorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabelModoTutorialTxt.setFont(new java.awt.Font("Ringbearer", 0, 24)); // NOI18N
        jLabelModoTutorialTxt.setForeground(new java.awt.Color(185, 167, 129));
        jLabelModoTutorialTxt.setText("Modo Tutorial");
        getContentPane().add(jLabelModoTutorialTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jLabelModoCalsicoTxt.setFont(new java.awt.Font("Ringbearer", 0, 24)); // NOI18N
        jLabelModoCalsicoTxt.setForeground(new java.awt.Color(185, 167, 129));
        jLabelModoCalsicoTxt.setText("Modo Clasico");
        getContentPane().add(jLabelModoCalsicoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, -1));

        jLabelTittle.setFont(new java.awt.Font("Ringbearer", 0, 48)); // NOI18N
        jLabelTittle.setForeground(new java.awt.Color(185, 167, 129));
        jLabelTittle.setText("Configuracion");
        getContentPane().add(jLabelTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabelModoClasico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lotr/stratego/Modo Tutorial.png"))); // NOI18N
        jLabelModoClasico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelModoClasicoMousePressed(evt);
            }
        });
        getContentPane().add(jLabelModoClasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        jLabelSeleccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSeleccion.setForeground(new java.awt.Color(185, 167, 129));
        getContentPane().add(jLabelSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        jLabelRegresar.setFont(new java.awt.Font("Ringbearer", 0, 36)); // NOI18N
        jLabelRegresar.setForeground(new java.awt.Color(185, 167, 129));
        jLabelRegresar.setText("Regresar");
        jLabelRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelRegresarMousePressed(evt);
            }
        });
        getContentPane().add(jLabelRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, -1, -1));

        jLabelBackground.setForeground(new java.awt.Color(185, 167, 129));
        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lotr/stratego/ElementosVisuales/Submenus_Background2.png"))); // NOI18N
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelModoTtuorialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelModoTtuorialMousePressed
        //Configurar Modo Tutorial
        MainMenu.ModoJuego = "TUTORIAL";
        jLabelSeleccion.setText("Modo Tutorial seleccionado.");
    }//GEN-LAST:event_jLabelModoTtuorialMousePressed

    private void jLabelModoClasicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelModoClasicoMousePressed
        //Configurar Modo Clasico.
        MainMenu.ModoJuego = "CLASICO";
        jLabelSeleccion.setText("Modo Clasico seleccionado.");
    }//GEN-LAST:event_jLabelModoClasicoMousePressed

    private void jLabelRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegresarMousePressed
        //Regresar al menu principal.
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelRegresarMousePressed

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
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelModoCalsicoTxt;
    private javax.swing.JLabel jLabelModoClasico;
    private javax.swing.JLabel jLabelModoTtuorial;
    private javax.swing.JLabel jLabelModoTutorialTxt;
    private javax.swing.JLabel jLabelRegresar;
    private javax.swing.JLabel jLabelSeleccion;
    private javax.swing.JLabel jLabelTittle;
    // End of variables declaration//GEN-END:variables
}


package GUI.Ventana;

import BusinessLogic.BDunbog;
import Data.Usuario;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    public static Usuario usuario = new Usuario();

    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        VentanaPrincipal.usuario = usuario;
    }
    
    public VentanaPrincipal() {
        initComponents();
        
        BDunbog conex = new BDunbog();
        conex.CrearBD();
        
        this.setLocationRelativeTo(null);
        setResizable(false);
      
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnInvitado = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/GUI/Imagenes/logo.png")).getImage());
        setMaximumSize(new java.awt.Dimension(600, 700));
        setMinimumSize(new java.awt.Dimension(600, 700));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInvitado.setBackground(new java.awt.Color(0, 51, 51));
        btnInvitado.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 24)); // NOI18N
        btnInvitado.setForeground(new java.awt.Color(255, 255, 255));
        btnInvitado.setText("INVITADO");
        btnInvitado.setActionCommand("invitados");
        btnInvitado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInvitado.setMargin(new java.awt.Insets(5, 5, 5, 5));
        btnInvitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInvitadoMouseClicked(evt);
            }
        });
        btnInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvitadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInvitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 200, 80));
        btnInvitado.getAccessibleContext().setAccessibleName("boton1");

        btnUsuario.setBackground(new java.awt.Color(0, 51, 51));
        btnUsuario.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 24)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuario.setText("USUARIO");
        btnUsuario.setHideActionText(true);
        btnUsuario.setMaximumSize(new java.awt.Dimension(155, 35));
        btnUsuario.setMinimumSize(new java.awt.Dimension(155, 35));
        btnUsuario.setPreferredSize(new java.awt.Dimension(155, 35));
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 200, 80));

        btnRegistro.setBackground(new java.awt.Color(0, 51, 51));
        btnRegistro.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 22)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("REGISTRARSE");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 200, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 200, 110));

        btnSalir.setBackground(new java.awt.Color(51, 0, 0));
        btnSalir.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 100, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/wall2.jpg"))); // NOI18N
        Fondo.setFocusTraversalPolicyProvider(true);
        Fondo.setMaximumSize(new java.awt.Dimension(600, 700));
        Fondo.setMinimumSize(new java.awt.Dimension(600, 700));
        Fondo.setPreferredSize(new java.awt.Dimension(600, 700));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 700));
        Fondo.getAccessibleContext().setAccessibleName("Inicio");

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/xredes.png"))); // NOI18N
        jPanel2.add(jLabel4);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 640, 270, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/zzz.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 270, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvitadoActionPerformed
        
        VentanaMenú ventana = new VentanaMenú(); 
        Usuario invitado = new Usuario("--", "--", "--", 0000, "--", "--", "--", new ArrayList<>(), new ArrayList<>());
        setUsuario(invitado);
      
        ventana.Verificar(invitado);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInvitadoActionPerformed

    private void btnInvitadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvitadoMouseClicked
      
    }//GEN-LAST:event_btnInvitadoMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

   System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        InicioSesión ventana = new InicioSesión(); 
     Usuario usuario = new Usuario("aa", "aa", "aa", 111, "--", "--", "--", new ArrayList<>(), new ArrayList<>());
        setUsuario(usuario);
       
     ventana.setVisible(true);
        this.setVisible(false);
      
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        Registro ventana = new Registro(); 
        ventana.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnInvitado;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

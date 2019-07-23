
package GUI.Ventana;

import BusinessLogic.BDunbog;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InicioSesión extends javax.swing.JFrame {

    private static String texto;

    public static String getTexto() {
        return texto;
    }

    public static void setTexto(String texto) {
        InicioSesión.texto = texto;
    }
    
    
    public InicioSesión() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtusuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnvalidar = new javax.swing.JButton();
        jpfcontraseña = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 700));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 160, 30));

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INICIO SESIÓN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        btnVolver.setBackground(new java.awt.Color(102, 0, 0));
        btnVolver.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 607, 100, 30));

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        btnvalidar.setBackground(new java.awt.Color(0, 0, 51));
        btnvalidar.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        btnvalidar.setForeground(new java.awt.Color(255, 255, 255));
        btnvalidar.setText("VALIDAR");
        btnvalidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvalidarActionPerformed(evt);
            }
        });
        getContentPane().add(btnvalidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 607, 100, 30));

        jpfcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfcontraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(jpfcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 160, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/perfilphoto.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 150, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/fondo.jpg"))); // NOI18N
        jLabel1.setText("Inicio Sesión");
        jLabel1.setMaximumSize(new java.awt.Dimension(600, 700));
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 700));
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 700));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed

    }//GEN-LAST:event_txtusuarioActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnvalidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvalidarActionPerformed
                    
        BDunbog conexion = new BDunbog();
        Connection conex2 = conexion.conectarBD();
   
        if(conex2 != null )
        {
            try 
            {
                Statement orden = conex2.createStatement();
                ResultSet r = orden.executeQuery("SELECT* FROM Usuarios WHERE Usuario= '"+txtusuario.getText()+"'");
                
                if(r.next())
                {
                    String contraseña = r.getString("Contraseña");
                    
                    if(contraseña.equals(jpfcontraseña.getText()))
                    {
                        this.setTexto( txtusuario.getText());
                        VentanaMenú ventana = new VentanaMenú();
                        ventana.setVisible(true);
                        this.setVisible(false);
                        
                    }else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Nombre de usuario o contraseña incorrecta","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }                                
                r.close();
                orden.close();
                
            } catch (SQLException ex) 
            {
                Logger.getLogger(InicioSesión.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
        
        
    }//GEN-LAST:event_btnvalidarActionPerformed

    private void jpfcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfcontraseñaActionPerformed
      
    }//GEN-LAST:event_jpfcontraseñaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnvalidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jpfcontraseña;
    public static javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}

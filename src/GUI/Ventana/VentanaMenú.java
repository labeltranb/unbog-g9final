
package GUI.Ventana;

import BusinessLogic.BDunbog;
import BusinessLogic.ControlBD;
import Data.Actividad;
import Data.Edificio;
import Data.Lugar;
import Data.Usuario;
import java.util.ArrayList;
import BusinessLogic.Inventario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import sun.swing.UIAction;

public class VentanaMenú extends javax.swing.JFrame {

String [] botones= {"Volver","Guardar"};
InicioSesión user = new InicioSesión();

    public VentanaMenú() {
        initComponents();
        this.setLocationRelativeTo(null);  
        UIManager UI=new UIManager();
    UI.put("OptionPane.backgroung",new ColorUIResource(51,153,153));
    UI.put("Panel.background",new ColorUIResource(51,153,153));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bytPerfil = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnActividades = new javax.swing.JButton();
        btnLugares = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtrecibe = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bytPerfil.setBackground(new java.awt.Color(0, 0, 51));
        bytPerfil.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        bytPerfil.setForeground(new java.awt.Color(255, 255, 255));
        bytPerfil.setText("PERFIL");
        bytPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bytPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(bytPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 90, 40));

        btnSalir.setBackground(new java.awt.Color(51, 0, 0));
        btnSalir.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, 90, 40));

        jButton3.setBackground(new java.awt.Color(0, 0, 51));
        jButton3.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("VOLVER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, 90, 40));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 250, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/lugares.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 200, 170));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/actividades.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 170, 160));

        btnActividades.setBackground(new java.awt.Color(0, 51, 51));
        btnActividades.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        btnActividades.setForeground(new java.awt.Color(255, 255, 255));
        btnActividades.setText("ACTIVIDADES");
        btnActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadesActionPerformed(evt);
            }
        });
        getContentPane().add(btnActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 150, 40));

        btnLugares.setBackground(new java.awt.Color(0, 51, 51));
        btnLugares.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        btnLugares.setForeground(new java.awt.Color(255, 255, 255));
        btnLugares.setText("LUGARES");
        btnLugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLugaresActionPerformed(evt);
            }
        });
        getContentPane().add(btnLugares, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 130, 40));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 51));
        btnBuscar.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 90, 40));
        getContentPane().add(txtrecibe, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 124, 120, 30));

        jLabel2.setFont(new java.awt.Font("Meiryo", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MENÚ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/lupaicon.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 470, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bytPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bytPerfilActionPerformed
      String recibe=InicioSesión.getTexto();
        txtrecibe.setText(recibe);
        System.out.println("este "+txtrecibe.getText());
        Perfil ventana = new Perfil(recibe);
        
        ventana.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_bytPerfilActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesActionPerformed
        VentanaActividades ventana = new VentanaActividades(); 
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnActividadesActionPerformed

    private void btnLugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLugaresActionPerformed
      VentanaLugares ventana = new VentanaLugares(); 
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLugaresActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      
       String valor = this.txtBuscar.getText();
      
       Inventario inventario= new Inventario();
       ArrayList<Lugar> listaLugares = new ArrayList<>(inventario.CrearLugar());
       ArrayList<Actividad> listaActividades = new ArrayList<>(inventario.CrearActividades());
       
        for (Lugar lista : listaLugares) {
            if (lista.getNombre().equalsIgnoreCase(valor)){
                  JFrame parentFrame = new JFrame(); 
           Icon icono=new ImageIcon (getClass().getResource("/GUI/Imagenes/logo.png"));
 
                   
                    int variable= JOptionPane.showOptionDialog(parentFrame, lista.toString() 
                     , "Edificio", JOptionPane.YES_NO_CANCEL_OPTION,
                      JOptionPane.WARNING_MESSAGE, icono, botones, botones[0]);
                    if (variable == 1){
                        ControlBD control = new ControlBD();
                      try 
                      {
                        control.guardarEdificios(txtrecibe.getText(), lista);
                      } catch (ClassNotFoundException ex) 
                      {
                          
                      }
                    }else{
                        
                    }
                
            }else
            {
            if (lista instanceof Edificio)
            {
                if (((Edificio) lista).getCódigo().contains(valor))
                {
                    JFrame parentFrame = new JFrame();
                    
                      Icon icono=new ImageIcon (getClass().getResource("/GUI/Imagenes/logo.png"));
 
                   
                    int variable= JOptionPane.showOptionDialog(parentFrame, lista.toString() 
                     , "Edificio", JOptionPane.YES_NO_CANCEL_OPTION,
                      JOptionPane.WARNING_MESSAGE, icono, botones, botones[0]);
                        if (variable==1){
                        ControlBD control = new ControlBD();
                        
                      try {
                          control.guardarEdificios(txtrecibe.getText(), lista);
                      } catch (ClassNotFoundException ex) {
                          Logger.getLogger(VentanaMenú.class.getName()).log(Level.SEVERE, null, ex);
                      }
                    }else{
                        
                    }
                }
            } 
            } 
        } 
        for (Actividad alista : listaActividades) {
            if (alista.getNombre().equalsIgnoreCase(valor)){
                  JFrame parentFrame = new JFrame(); 
                    Icon icono=new ImageIcon (getClass().getResource("/GUI/Imagenes/logo.png"));
 
                   
                    int variable= JOptionPane.showOptionDialog(parentFrame, listaActividades.toString() 
                     , "Edificio", JOptionPane.YES_NO_CANCEL_OPTION,
                      JOptionPane.WARNING_MESSAGE, icono, botones, botones[0]);
                    if (variable==1){
                        ControlBD control = new ControlBD();
                        
                      try {
                          control.guardarActividades(txtrecibe.getText(), listaActividades);
                      } catch (ClassNotFoundException ex) {
                          Logger.getLogger(VentanaMenú.class.getName()).log(Level.SEVERE, null, ex);
                      }
                    }else{
                        
                    }
     
            }
        
        }


        
       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

     
      public void Verificar(Usuario usuario){
        Usuario invitado = new Usuario("--", "--", "--", 0000, "--", "--", "--", new ArrayList<>(), new ArrayList<>());
        if ( invitado.getNombre().equals(usuario.getNombre())){
            deshabilitar();
            
        }else{
            habilitar();
        }
    }
    
    private void deshabilitar() 
    {
       
        this.bytPerfil.setEnabled(false);
    }  

    private void habilitar() 
    {
      
     
      this.bytPerfil.setEnabled(true);
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLugares;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton bytPerfil;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBuscar;
    public static javax.swing.JLabel txtrecibe;
    // End of variables declaration//GEN-END:variables
}

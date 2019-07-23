/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Ventana;

import BusinessLogic.ControlBD;
import BusinessLogic.Inventario;
import Data.Edificio;
import Data.Lugar;
import static GUI.Ventana.VentanaMenú.txtrecibe;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lau
 */
public class VentanaMapaAuditorios extends javax.swing.JFrame {
 String [] botones= {"Volver","Guardar"};
 Inventario inventario= new Inventario();
 ArrayList<Lugar> listaEdificios = new ArrayList<>(inventario.CrearA());
    /**
     * Creates new form VentanaMapaEd
     */
    public VentanaMapaAuditorios() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(51, 0, 0));
        btnSalir.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, 90, 40));

        btnVolver.setBackground(new java.awt.Color(0, 0, 51));
        btnVolver.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 90, 40));

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AUDITORIOS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HAGA CLICK SOBRE  ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 910, -1, -1));

        btn.setBackground(new java.awt.Color(0, 153, 0));
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 620, 20, 10));

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EL AUDITORIO QUE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        jLabel9.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DESEA VER. ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        btn1.setBackground(new java.awt.Color(0, 153, 0));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 20, 10));

        btn2.setBackground(new java.awt.Color(0, 153, 0));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 20, 10));

        btn3.setBackground(new java.awt.Color(0, 153, 0));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 20, 10));

        btn4.setBackground(new java.awt.Color(0, 153, 0));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 20, 10));

        btn5.setBackground(new java.awt.Color(0, 153, 0));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 520, 20, 10));

        btn6.setBackground(new java.awt.Color(0, 153, 0));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, 20, 10));

        btn7.setBackground(new java.awt.Color(0, 153, 0));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 540, 20, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/MAPITAxd.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 790, 810));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/auditorioicon.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaEdificios ventana = new VentanaEdificios();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
      for (Lugar lista : listaEdificios) {
           Icon icono=new ImageIcon (getClass().getResource("/GUI/Imagenes/logo.png"));
           
                JFrame parentFrame = new JFrame();
               if (lista.getNombre().equals("leon de greiff")){
                   
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
    }//GEN-LAST:event_btnActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        for (Lugar lista : listaEdificios) {
           Icon icono=new ImageIcon (getClass().getResource("/GUI/Imagenes/logo.png"));
           
                JFrame parentFrame = new JFrame();
               if (lista.getNombre().equals("auditorio a")){
                   
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
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       for (Lugar lista : listaEdificios) {
           Icon icono=new ImageIcon (getClass().getResource("/GUI/Imagenes/logo.png"));
           
                JFrame parentFrame = new JFrame();
               if (lista.getNombre().equals("auditorio b")){
                   
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
       } // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        for (Lugar lista : listaEdificios) {
           Icon icono=new ImageIcon (getClass().getResource("/GUI/Imagenes/logo.png"));
           
                JFrame parentFrame = new JFrame();
               if (lista.getNombre().equals("auditorio c")){
                   
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
       }// TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        for (Lugar lista : listaEdificios) {
           Icon icono=new ImageIcon (getClass().getResource("/GUI/Imagenes/logo.png"));
           
                JFrame parentFrame = new JFrame();
               if (lista.getNombre().equals("auditorio cyt")){
                   
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
       }// TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
       for (Lugar lista : listaEdificios) {
           Icon icono=new ImageIcon (getClass().getResource("/GUI/Imagenes/logo.png"));
           
                JFrame parentFrame = new JFrame();
               if (lista.getNombre().equals("auditorio 01")){
                   
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
       } // TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        for (Lugar lista : listaEdificios) {
           Icon icono=new ImageIcon (getClass().getResource("/GUI/Imagenes/logo.png"));
           
                JFrame parentFrame = new JFrame();
               if (lista.getNombre().equals("auditorio 02")){
                   
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
       }// TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        for (Lugar lista : listaEdificios) {
           Icon icono=new ImageIcon (getClass().getResource("/GUI/Imagenes/logo.png"));
           
                JFrame parentFrame = new JFrame();
               if (lista.getNombre().equals("auditorio 03")){
                   
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
       }// TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
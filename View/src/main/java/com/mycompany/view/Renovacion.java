/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 54234
 */
public class Renovacion extends javax.swing.JFrame {

    private JDateChooser dateChooser;
    Date fechaLocal;

    /**
     * Creates new form ModificarDatos
     */
    public Renovacion() {
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

        jPanel1 = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        botonCalendario = new javax.swing.JButton();
        labelFecha = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton2.setBackground(new java.awt.Color(217, 217, 217));
        jToggleButton2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jToggleButton2.setText("MENU");
        jToggleButton2.setBorder(null);
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel3.setText(">");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 10, 30));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("RENOVACIÓN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 130, 30));

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel13.setText("NUEVA FECHA:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 110, 30));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("RENOVAR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 90, 40));

        jLabel16.setFont(new java.awt.Font("Edwardian Script ITC", 1, 200)); // NOI18N
        jLabel16.setText("B");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 260, 190));

        jLabel17.setFont(new java.awt.Font("Edwardian Script ITC", 1, 200)); // NOI18N
        jLabel17.setText("F");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 260, 190));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 250, 30));

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel14.setText("INGRESE EL ID DEL LIBRO:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 240, 30));

        botonCalendario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonCalendario.setText("Calendario");
        botonCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalendarioActionPerformed(evt);
            }
        });
        jPanel1.add(botonCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        labelFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 236, 100, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        fondo.setText("jLabel1");
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void botonCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalendarioActionPerformed
        // Crear e invocar el diálogo
        FechaNacimientoDialog dialog = new FechaNacimientoDialog(Renovacion.this);
        dialog.setVisible(true);  // Al ser modal, el programa se "pausa" aquí hasta que se cierre el diálogo

        // Actualizar la variable fechaNacimiento después de cerrar el diálogo
        fechaLocal = dialog.getFechaNacimiento();

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");  // Formato deseado
        labelFecha.setText(formato.format(fechaLocal));// convierto el Date en String
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCalendarioActionPerformed

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
            java.util.logging.Logger.getLogger(Renovacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Renovacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Renovacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Renovacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Renovacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalendario;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel labelFecha;
    // End of variables declaration//GEN-END:variables
}

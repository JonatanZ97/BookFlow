
package com.mycompany.view;

import BusinessObjects.LibroLocal;
import BusinessObjects.PrestamoBusiness;
import ModelException.ModelException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Devolucion extends javax.swing.JFrame {

   
    public Devolucion() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        campoNumero = new javax.swing.JTextField();
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
        jLabel4.setText("DEVOLUCIÓN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 130, 30));

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel13.setText("Ingrese número de identificacion :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 270, 40));

        botonBuscar.setBackground(new java.awt.Color(204, 255, 204));
        botonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonBuscar.setText("DEVOLVER");
        botonBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 110, 40));

        jLabel16.setFont(new java.awt.Font("Edwardian Script ITC", 1, 200)); // NOI18N
        jLabel16.setText("B");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 260, 190));

        jLabel17.setFont(new java.awt.Font("Edwardian Script ITC", 1, 200)); // NOI18N
        jLabel17.setText("F");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 260, 190));

        campoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumeroActionPerformed(evt);
            }
        });
        jPanel1.add(campoNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, 40));

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

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
    PrestamoBusiness prestamo = new PrestamoBusiness();
    LibroLocal singleton = LibroLocal.getInstance();
    long numeroIdent = singleton.getNumIdentificacion();
        try {
            boolean respuesta = prestamo.devolver(numeroIdent);
            if (respuesta == true) {
                JOptionPane.showMessageDialog(null, "El libro se ha devuelto con éxito.");
                MenuPrincipal menuPrincipal = new MenuPrincipal();
                menuPrincipal.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "El libro no se ha podido devolver. Ingrese un ID correcto.");
            }        
        } catch (ModelException ex) {
            Logger.getLogger(Devolucion.class.getName()).log(Level.SEVERE, null, ex);
        }
               
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void campoNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumeroActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Devolucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import BusinessObjects.LibrosBusiness;
import BusinessObjects.ReservaBusiness;
import BusinessObjects.SociosBusiness;
import ModelException.ModelException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 54234
 */
public class ReservarLibro extends javax.swing.JFrame {

    /**
     * Creates new form ReservarLibro
     */
    public ReservarLibro() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campIdentificacion = new javax.swing.JTextField();
        campDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botonDni = new javax.swing.JRadioButton();
        botonId = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton3.setBackground(new java.awt.Color(217, 217, 217));
        jToggleButton3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jToggleButton3.setText("MENU");
        jToggleButton3.setBorder(null);
        jToggleButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        jToggleButton2.setBackground(new java.awt.Color(217, 217, 217));
        jToggleButton2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jToggleButton2.setText("RESERVAS");
        jToggleButton2.setBorder(null);
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 30));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel4.setText("Numero de identificación del libro:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 260, 30));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel3.setText(">");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 10, 30));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel7.setText(">");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 10, 30));
        jPanel1.add(campIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 280, 50));
        jPanel1.add(campDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 280, 50));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("NUEVA RESERVA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 130, 30));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel6.setText("Datos del socio:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 30));

        buttonGroup1.add(botonDni);
        botonDni.setText("DNI");
        jPanel1.add(botonDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        buttonGroup1.add(botonId);
        botonId.setText("ID");
        botonId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIdActionPerformed(evt);
            }
        });
        jPanel1.add(botonId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("RESERVAR");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 130, 40));

        jLabel14.setFont(new java.awt.Font("Edwardian Script ITC", 1, 200)); // NOI18N
        jLabel14.setText("B");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 260, 190));

        jLabel15.setFont(new java.awt.Font("Edwardian Script ITC", 1, 200)); // NOI18N
        jLabel15.setText("F");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 260, 190));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        FONDO.setText("jLabel1");
        jPanel1.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 990, 620));

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

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        Reservas reservas = new Reservas();
        reservas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void botonIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String texto;
        String texto1;
        SociosBusiness socio = new SociosBusiness();
        LibrosBusiness libro = new LibrosBusiness();
        if (botonId.isSelected()) {//boton id
            try {
                //obtengo los numeros de los campos de textos
                texto = campDni.getText();

                texto1 = campIdentificacion.getText();

                // Convierto el texto a int
                int id = Integer.parseInt(texto);
                // Convierto el texto a long
                long identificacion = Long.parseLong(texto1);

                boolean respuestaS = socio.existeSocioID(id);
                if (respuestaS) {
                    boolean respuestaL = libro.existeLibro(identificacion);
                    if (respuestaL) {
                        ReservaBusiness reserva = new ReservaBusiness();
                        boolean respuestaR = reserva.agregarReserva(id, identificacion);
                        if (respuestaR) {
                            JOptionPane.showMessageDialog(null, "Reserva exitosa");
                            Reservas menu = new Reservas();
                            menu.setVisible(true);
                            this.dispose();
                        } else if (!respuestaR) {
                            JOptionPane.showMessageDialog(null, "Fallo al realizar la reserva");
                        }
                    } else if (!respuestaL) {
                        JOptionPane.showMessageDialog(null, "Libro no encontrado");
                    }
                } else if (!respuestaS) {
                    JOptionPane.showMessageDialog(null, "Socio no encontrado");
                }
            } catch (NumberFormatException e) {
                // Manejar el error si el texto no es un número válido
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
            } catch (ModelException ex) {
                Logger.getLogger(Prestamo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (botonDni.isSelected()) {//boton dni
            try {
                //obtengo los numeros de los campos de textos
                texto = campDni.getText();

                texto1 = campIdentificacion.getText();

                // Convierto el texto a long
                long dni = Long.parseLong(texto);
                // Convierto el texto a long
                long identificacion = Long.parseLong(texto1);

                boolean respuestaS = socio.existeSocioDNI(dni);
                if (respuestaS) {
                    int dniConvertido = socio.buscarID(dni);
                    boolean respuestaL = libro.existeLibro(identificacion);
                    if (respuestaL) {
                        ReservaBusiness reserva = new ReservaBusiness();
                        boolean respuestaR = reserva.agregarReserva(dniConvertido, identificacion);
                        if (respuestaR) {
                            JOptionPane.showMessageDialog(null, "Reserva exitosa");
                            Reservas menu = new Reservas();
                            menu.setVisible(true);
                            this.dispose();
                        } else if (!respuestaR) {
                            JOptionPane.showMessageDialog(null, "Fallo al realizar la reserva");
                        }
                    } else if (!respuestaL) {
                        JOptionPane.showMessageDialog(null, "Libro no encontrado");
                    }
                } else if (!respuestaS) {
                    JOptionPane.showMessageDialog(null, "Socio no encontrado");
                }
            } catch (NumberFormatException e) {
                // Manejar el error si el texto no es un número válido
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
            } catch (ModelException ex) {
                Logger.getLogger(Prestamo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una opcion de busqueda");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ReservarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JRadioButton botonDni;
    private javax.swing.JRadioButton botonId;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campDni;
    private javax.swing.JTextField campIdentificacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
}

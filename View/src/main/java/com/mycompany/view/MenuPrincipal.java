/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import javax.swing.JOptionPane;

/**
 *
 * @author 54234
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        devolucion = new javax.swing.JButton();
        socios = new javax.swing.JButton();
        renovarPrestamo = new javax.swing.JButton();
        configuracion = new javax.swing.JButton();
        prestamo = new javax.swing.JButton();
        informes = new javax.swing.JButton();
        historial = new javax.swing.JButton();
        biblioteca = new javax.swing.JButton();
        Socios8 = new javax.swing.JButton();
        reservas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Edwardian Script ITC", 1, 70)); // NOI18N
        jLabel3.setText("F");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 90, 100));

        jLabel6.setFont(new java.awt.Font("Edwardian Script ITC", 1, 70)); // NOI18N
        jLabel6.setText("B");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 100));

        devolucion.setBackground(new java.awt.Color(153, 153, 153));
        devolucion.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        devolucion.setText("Devolución");
        devolucion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        devolucion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        devolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolucionActionPerformed(evt);
            }
        });
        jPanel1.add(devolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 330, 70));

        socios.setBackground(new java.awt.Color(153, 153, 153));
        socios.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        socios.setText("Socios");
        socios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        socios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        socios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sociosActionPerformed(evt);
            }
        });
        jPanel1.add(socios, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 330, 70));

        renovarPrestamo.setBackground(new java.awt.Color(153, 153, 153));
        renovarPrestamo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        renovarPrestamo.setText("Renovar préstamo");
        renovarPrestamo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        renovarPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        renovarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renovarPrestamoActionPerformed(evt);
            }
        });
        jPanel1.add(renovarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 330, 70));

        configuracion.setBackground(new java.awt.Color(153, 153, 153));
        configuracion.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        configuracion.setText("Configuración");
        configuracion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        configuracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracionActionPerformed(evt);
            }
        });
        jPanel1.add(configuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 330, 70));

        prestamo.setBackground(new java.awt.Color(153, 153, 153));
        prestamo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        prestamo.setText("Préstamo");
        prestamo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        prestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamoActionPerformed(evt);
            }
        });
        jPanel1.add(prestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 330, 70));

        informes.setBackground(new java.awt.Color(153, 153, 153));
        informes.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        informes.setText("Informes");
        informes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        informes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        informes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informesActionPerformed(evt);
            }
        });
        jPanel1.add(informes, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 330, 70));

        historial.setBackground(new java.awt.Color(153, 153, 153));
        historial.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        historial.setText("Historial de préstamos");
        historial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        historial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialActionPerformed(evt);
            }
        });
        jPanel1.add(historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 330, 70));

        biblioteca.setBackground(new java.awt.Color(153, 153, 153));
        biblioteca.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        biblioteca.setText("Biblioteca");
        biblioteca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        biblioteca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bibliotecaActionPerformed(evt);
            }
        });
        jPanel1.add(biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 330, 70));

        Socios8.setBackground(new java.awt.Color(153, 153, 153));
        Socios8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        Socios8.setText("Salir");
        Socios8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Socios8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Socios8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Socios8ActionPerformed(evt);
            }
        });
        jPanel1.add(Socios8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, 330, 70));

        reservas.setBackground(new java.awt.Color(153, 153, 153));
        reservas.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        reservas.setText("Reservas");
        reservas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservasActionPerformed(evt);
            }
        });
        jPanel1.add(reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 330, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

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

    private void devolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolucionActionPerformed
        Devolucion devolucion = new Devolucion();
        devolucion.setVisible(true);
        this.dispose();     
    }//GEN-LAST:event_devolucionActionPerformed

    private void sociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sociosActionPerformed
        Socios socios = new Socios();
        socios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sociosActionPerformed

    private void renovarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renovarPrestamoActionPerformed
        Renovacion renovacion = new Renovacion();
        renovacion.setVisible(true);
        this.dispose();
            
    }//GEN-LAST:event_renovarPrestamoActionPerformed

    private void configuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracionActionPerformed
        Configuracion configuracion = new Configuracion();
        configuracion.setVisible(true);
        this.dispose();    
        
    }//GEN-LAST:event_configuracionActionPerformed

    private void prestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamoActionPerformed
        Prestamo prestamo = new Prestamo();
        prestamo.setVisible(true);
        this.dispose();   
    }//GEN-LAST:event_prestamoActionPerformed

    private void informesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informesActionPerformed
        
        JOptionPane.showMessageDialog(null, "EN DESARROLLO");
        
        /*
        Informes informes = new Informes();
        informes.setVisible(true);
        this.dispose();
        */
        
    }//GEN-LAST:event_informesActionPerformed

    private void historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialActionPerformed
        HistorialPrestamos historialPrestamos = new HistorialPrestamos();
        historialPrestamos.setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_historialActionPerformed

    private void bibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bibliotecaActionPerformed
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setVisible(true);
        this.dispose();
           
    }//GEN-LAST:event_bibliotecaActionPerformed

    private void Socios8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Socios8ActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Socios8ActionPerformed

    private void reservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservasActionPerformed
        Reservas reservas = new Reservas();
        reservas.setVisible(true);
        this.dispose();     
    }//GEN-LAST:event_reservasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Socios8;
    private javax.swing.JButton biblioteca;
    private javax.swing.JButton configuracion;
    private javax.swing.JButton devolucion;
    private javax.swing.JButton historial;
    private javax.swing.JButton informes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton prestamo;
    private javax.swing.JButton renovarPrestamo;
    private javax.swing.JButton reservas;
    private javax.swing.JButton socios;
    // End of variables declaration//GEN-END:variables
}

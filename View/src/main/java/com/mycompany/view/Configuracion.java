/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import BusinessObjects.UsuarioLocal;

/**
 *
 * @author 54234
 */
public class Configuracion extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        devolucion = new javax.swing.JButton();
        socios = new javax.swing.JButton();
        configuracion = new javax.swing.JButton();
        prestamo = new javax.swing.JButton();
        biblioteca = new javax.swing.JButton();
        reservas = new javax.swing.JButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        devolucion1 = new javax.swing.JButton();
        biblioteca1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Edwardian Script ITC", 1, 70)); // NOI18N
        jLabel3.setText("F");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, 90, 100));

        jLabel6.setFont(new java.awt.Font("Edwardian Script ITC", 1, 70)); // NOI18N
        jLabel6.setText("B");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 90, 100));

        devolucion.setBackground(new java.awt.Color(153, 153, 153));
        devolucion.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        devolucion.setText("Vaciar lista de Socios");
        devolucion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        devolucion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        devolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolucionActionPerformed(evt);
            }
        });
        jPanel1.add(devolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 400, 70));

        socios.setBackground(new java.awt.Color(153, 153, 153));
        socios.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        socios.setText("Borrar historial de prestamos");
        socios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        socios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        socios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sociosActionPerformed(evt);
            }
        });
        jPanel1.add(socios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 400, 70));

        configuracion.setBackground(new java.awt.Color(153, 153, 153));
        configuracion.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        configuracion.setText("Cambiar contraseña");
        configuracion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        configuracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracionActionPerformed(evt);
            }
        });
        jPanel1.add(configuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 400, 70));

        prestamo.setBackground(new java.awt.Color(153, 153, 153));
        prestamo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        prestamo.setText("Vaciar lista de reservas");
        prestamo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        prestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamoActionPerformed(evt);
            }
        });
        jPanel1.add(prestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 400, 70));

        biblioteca.setBackground(new java.awt.Color(153, 153, 153));
        biblioteca.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        biblioteca.setText("Mostrar usuarios");
        biblioteca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        biblioteca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bibliotecaActionPerformed(evt);
            }
        });
        jPanel1.add(biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 330, 70));

        reservas.setBackground(new java.awt.Color(153, 153, 153));
        reservas.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        reservas.setText("Nuevo usuario del sistema");
        reservas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservasActionPerformed(evt);
            }
        });
        jPanel1.add(reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 330, 70));

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

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel4.setText(">");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 10, 30));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("CONFIGURACIÓN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 200, 30));

        devolucion1.setBackground(new java.awt.Color(153, 153, 153));
        devolucion1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        devolucion1.setText("Vaciar lista de Libros");
        devolucion1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        devolucion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        devolucion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolucion1ActionPerformed(evt);
            }
        });
        jPanel1.add(devolucion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 400, 70));

        biblioteca1.setBackground(new java.awt.Color(153, 153, 153));
        biblioteca1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        biblioteca1.setText("Eliminar usuario");
        biblioteca1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        biblioteca1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        biblioteca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biblioteca1ActionPerformed(evt);
            }
        });
        jPanel1.add(biblioteca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 330, 70));

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
        // TODO add your handling code here:
    }//GEN-LAST:event_devolucionActionPerformed

    private void sociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sociosActionPerformed
        Socios socios = new Socios();
        socios.setVisible(true);
    }//GEN-LAST:event_sociosActionPerformed

    private void configuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracionActionPerformed

        CambiarContrasenia contrasenia = new CambiarContrasenia();
        contrasenia.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_configuracionActionPerformed

    private void prestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prestamoActionPerformed

    private void bibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bibliotecaActionPerformed
        MostrarUsuarios mostrar = new MostrarUsuarios();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bibliotecaActionPerformed

    private void reservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservasActionPerformed
        NuevoUsuario nuevoUsuario = new NuevoUsuario();
        nuevoUsuario.setVisible(true);
        this.dispose();;
             
    }//GEN-LAST:event_reservasActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void devolucion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolucion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_devolucion1ActionPerformed

    private void biblioteca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biblioteca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_biblioteca1ActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton biblioteca;
    private javax.swing.JButton biblioteca1;
    private javax.swing.JButton configuracion;
    private javax.swing.JButton devolucion;
    private javax.swing.JButton devolucion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JButton prestamo;
    private javax.swing.JButton reservas;
    private javax.swing.JButton socios;
    // End of variables declaration//GEN-END:variables
}

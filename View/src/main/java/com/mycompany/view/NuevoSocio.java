package com.mycompany.view;

import BusinessObjects.SociosBusiness;
import ModelException.ModelException;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author 54234
 */
public class NuevoSocio extends javax.swing.JFrame {

    // Agregar el JDateChooser como atributo de la clase
    private JDateChooser dateChooser;
    Date fechaLocal;

    public NuevoSocio() {
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
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campApellido = new javax.swing.JTextField();
        campDni = new javax.swing.JTextField();
        campMail = new javax.swing.JTextField();
        campTelefono = new javax.swing.JTextField();
        nombreUsuario10 = new javax.swing.JTextField();
        campNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        botonCalendario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setBackground(new java.awt.Color(217, 217, 217));
        jToggleButton1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jToggleButton1.setText("SOCIOS");
        jToggleButton1.setBorder(null);
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 30));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("ACEPTAR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 110, 40));

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

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("NUEVO SOCIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 100, 30));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel10.setText(">");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 10, 30));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel3.setText(">");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 10, 30));

        campApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(campApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 270, 40));

        campDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campDniActionPerformed(evt);
            }
        });
        jPanel1.add(campDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 270, 40));

        campMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campMailActionPerformed(evt);
            }
        });
        jPanel1.add(campMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 270, 40));

        campTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(campTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 270, 40));

        nombreUsuario10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreUsuario10ActionPerformed(evt);
            }
        });
        jPanel1.add(nombreUsuario10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 270, 40));

        campNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campNombreActionPerformed(evt);
            }
        });
        jPanel1.add(campNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 270, 40));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        jLabel5.setText("Nombre:");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 270, 20));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        jLabel6.setText("Apellido:");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 270, 20));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        jLabel7.setText("DNI:");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 270, 20));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        jLabel8.setText("Mail:");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 270, 20));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        jLabel9.setText("Telefono:");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 270, 20));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 12)); // NOI18N
        jLabel4.setText("Dirección:");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 270, 20));

        jLabel11.setFont(new java.awt.Font("Edwardian Script ITC", 1, 70)); // NOI18N
        jLabel11.setText("B");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 90, 100));

        jLabel12.setFont(new java.awt.Font("Edwardian Script ITC", 1, 70)); // NOI18N
        jLabel12.setText("F");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, 90, 100));

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel13.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        botonCalendario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonCalendario.setText("Calendario");
        botonCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalendarioActionPerformed(evt);
            }
        });
        jPanel1.add(botonCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 640));

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

    private void campNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campNombreActionPerformed

    private void campApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campApellidoActionPerformed

    private void campDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campDniActionPerformed

    private void campMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campMailActionPerformed

    private void campTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campTelefonoActionPerformed

    private void nombreUsuario10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreUsuario10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreUsuario10ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // zona de variable
        String nombre;
        String apellido;
        long dni;
        String mail;
        long telefono;
        String direccion;

        //zona de codigo
        // obtengo lod datos de los campos de textos
        nombre = campNombre.getText();
        apellido = campApellido.getText();
        mail = campMail.getText();
        direccion = nombreUsuario10.getText();

        try {
            //obtengo los numeros de los campos de textos
            String texto = campDni.getText();

            String texto1 = campTelefono.getText();

            // Convierto el texto a long
            telefono = Long.parseLong(texto1);

            dni = Long.parseLong(texto);

            if (fechaLocal == null || nombre == null || apellido == null || mail == null || direccion == null) {// compruebo que no sean null
                JOptionPane.showMessageDialog(null, "Campo vacio");
            } else {
                SociosBusiness socios = new SociosBusiness();
                boolean resultado = socios.guardarSocio(nombre, apellido, dni, fechaLocal, telefono, mail, direccion);
                if (resultado) {
                    JOptionPane.showMessageDialog(null, "socio guardado correctamente");
                    Socios socio = new Socios();
                    socio.setVisible(true);
                    this.dispose();
                } else {
                    if (!resultado) {
                        JOptionPane.showMessageDialog(null, "no se pudo guardar el socio, verifique los datos ingresados");
                    }
                }

            }

        } catch (NumberFormatException e) {
            // Manejar el error si el texto no es un número válido
            JOptionPane.showMessageDialog(null, "ingrese un numero valido");
        } catch (ModelException ex) {
            Logger.getLogger(NuevoSocio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalendarioActionPerformed

        // Crear e invocar el diálogo
        FechaNacimientoDialog dialog = new FechaNacimientoDialog(NuevoSocio.this);
        dialog.setVisible(true);  // Al ser modal, el programa se "pausa" aquí hasta que se cierre el diálogo

        // Actualizar la variable fechaNacimiento después de cerrar el diálogo
        fechaLocal = dialog.getFechaNacimiento();
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
            java.util.logging.Logger.getLogger(NuevoSocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoSocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoSocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoSocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoSocio().setVisible(true);
            }
        });

    }

    public class MyCalendarExample extends JFrame {

        public MyCalendarExample() {
            // Crear un JDateChooser

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalendario;
    private javax.swing.JTextField campApellido;
    private javax.swing.JTextField campDni;
    private javax.swing.JTextField campMail;
    private javax.swing.JTextField campNombre;
    private javax.swing.JTextField campTelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField nombreUsuario10;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import BusinessObjects.SocioLocal;
import BusinessObjects.SociosBusiness;
import ModelException.ModelException;
import com.toedter.calendar.JDateChooser;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 54234
 */
public class ModificarDatos extends javax.swing.JFrame {

    private JDateChooser dateChooser;
    Date fechaLocal;
    int id;
    long dniOriginal;

    /**
     * Creates new form ModificarDatos
     */
    public ModificarDatos() {
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
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        campDni = new javax.swing.JTextField();
        campMail = new javax.swing.JTextField();
        campTelefono = new javax.swing.JTextField();
        campDireccion = new javax.swing.JTextField();
        campMotivoPenalizacion = new javax.swing.JTextField();
        campApellido = new javax.swing.JTextField();
        campNombre = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        penalizadoCaja = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campPenalizacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        botonMostrar = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        botonCalendario = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        campFecha = new javax.swing.JTextField();

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

        jToggleButton3.setBackground(new java.awt.Color(217, 217, 217));
        jToggleButton3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jToggleButton3.setText("MODIFICAR SOCIO");
        jToggleButton3.setBorder(null);
        jToggleButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, 30));

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel11.setText(">");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 10, 30));
        jPanel1.add(campDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 210, 50));
        jPanel1.add(campMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 270, 50));
        jPanel1.add(campTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 210, 50));
        jPanel1.add(campDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 210, 50));
        jPanel1.add(campMotivoPenalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 540, 50));
        jPanel1.add(campApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 210, 50));

        campNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campNombreActionPerformed(evt);
            }
        });
        jPanel1.add(campNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 210, 50));

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

        penalizadoCaja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENALIZADO", "NO PENALIZADO" }));
        penalizadoCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penalizadoCajaActionPerformed(evt);
            }
        });
        jPanel1.add(penalizadoCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 160, 30));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel10.setText(">");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 10, 30));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel2.setText("APELLIDO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 130, 30));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("MODIFICAR DATOS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 130, 30));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel5.setText("DNI:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 130, 30));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel6.setText("MAIL:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 130, 30));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel7.setText("TELEFONO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 130, 30));

        campPenalizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campPenalizacionActionPerformed(evt);
            }
        });
        jPanel1.add(campPenalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 210, 50));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel8.setText("DIRECCIÓN:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 130, 30));
        jPanel1.add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 170, 40));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel9.setText("Fecha de Nacimiento:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 150, 40));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel12.setText("NOMBRE:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 130, 30));

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel13.setText("PENALIZACIÓN:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 130, 30));

        jLabel14.setFont(new java.awt.Font("Edwardian Script ITC", 1, 70)); // NOI18N
        jLabel14.setText("B");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 90, 100));

        jLabel15.setFont(new java.awt.Font("Edwardian Script ITC", 1, 70)); // NOI18N
        jLabel15.setText("F");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, 90, 100));

        jToggleButton4.setBackground(new java.awt.Color(102, 255, 102));
        jToggleButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jToggleButton4.setText("Guardar");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 573, 90, 40));

        botonMostrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonMostrar.setText("Mostrar datos");
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, -1, -1));

        jLabel16.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel16.setText("RAZON DE PENALIZACIÓN:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 200, 30));

        botonCalendario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonCalendario.setText("Calendario");
        botonCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalendarioActionPerformed(evt);
            }
        });
        jPanel1.add(botonCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        fondo.setText("jLabel1");
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1010, 640));
        jPanel1.add(campFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 210, 50));

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
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Socios socio = new Socios();
        socio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        ModificacionSocio socio = new ModificacionSocio();
        socio.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void campNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campNombreActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        String nombre;
        String apellido;
        long dni;
        String mail;
        long telefono;
        String direccion;
        boolean penalizado;
        String motivoPenalizado;

        try {
            nombre = campNombre.getText();
            apellido = campApellido.getText();
            mail = campMail.getText();
            direccion = campDireccion.getText();
            motivoPenalizado = campMotivoPenalizacion.getText();
            String temporal = penalizadoCaja.getSelectedItem().toString();

            if (temporal.equalsIgnoreCase("penalizado")) {
                penalizado = true;
            } else if (temporal.equalsIgnoreCase("no penalizado")) {
                penalizado = false;
            } else {
                penalizado = true;
            }

            //obtengo los numeros de los campos de textos
            String texto = campDni.getText();

            String texto1 = campTelefono.getText();

            // Convierto el texto a long
            telefono = Long.parseLong(texto1);

            dni = Long.parseLong(texto);

            if (fechaLocal == null || nombre == null || apellido == null || mail == null || direccion == null) {// compruebo que no sean null
                JOptionPane.showMessageDialog(null, "Campo vacio");
            } else {
                SociosBusiness socio = new SociosBusiness();
                boolean resultado = socio.cambiarDatosSocios(id, nombre, apellido, dni, fechaLocal, telefono, mail, direccion, penalizado, motivoPenalizado, dniOriginal);
                if (resultado) {
                    JOptionPane.showMessageDialog(null, "socio guardado correctamente");
                    Socios socio1 = new Socios();
                    socio1.setVisible(true);
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
            Logger.getLogger(ModificarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
        SociosBusiness business = new SociosBusiness();
        SocioLocal local = SocioLocal.getInstance();
        if (botonMostrar.isSelected()) {
            business = business.traerDatos(local.getId());
            id = business.getIdsocio();
            campNombre.setText(business.getNombre());
            campApellido.setText(business.getApellido());
            dniOriginal = business.getDni();
            campDni.setText(Long.toString(business.getDni()));
            campMail.setText(business.getMail());
            campTelefono.setText(Long.toString(business.getTelefono()));
            campDireccion.setText(business.getDireccion());
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");  // Formato deseado
            labelFecha.setText(formato.format(business.getFechaNacimiento()));// convierto el Date en String
            if (business.getPenalizado()) {
                campPenalizacion.setText("Penalizado");
            } else if (!business.getPenalizado()) {
                campPenalizacion.setText("No Penalizado");
            }
            campMotivoPenalizacion.setText(business.getMotivoPenalizado());
        }     // TODO add your handling code here:
    }//GEN-LAST:event_botonMostrarActionPerformed

    private void campPenalizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campPenalizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campPenalizacionActionPerformed

    private void botonCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalendarioActionPerformed
        FechaNacimientoDialog dialog = new FechaNacimientoDialog(ModificarDatos.this);
        dialog.setVisible(true);  // Al ser modal, el programa se "pausa" aquí hasta que se cierre el diálogo

        // Actualizar la variable fechaNacimiento después de cerrar el diálogo
        fechaLocal = dialog.getFechaNacimiento();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");  // Formato deseado
        labelFecha.setText(formato.format(fechaLocal));// convierto el Date en String
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCalendarioActionPerformed

    private void penalizadoCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penalizadoCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penalizadoCajaActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalendario;
    private javax.swing.JRadioButton botonMostrar;
    private javax.swing.JTextField campApellido;
    private javax.swing.JTextField campDireccion;
    private javax.swing.JTextField campDni;
    private javax.swing.JTextField campFecha;
    private javax.swing.JTextField campMail;
    private javax.swing.JTextField campMotivoPenalizacion;
    private javax.swing.JTextField campNombre;
    private javax.swing.JTextField campPenalizacion;
    private javax.swing.JTextField campTelefono;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JComboBox<String> penalizadoCaja;
    // End of variables declaration//GEN-END:variables
}

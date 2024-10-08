/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import BusinessObjects.LibrosBusiness;
import BusinessObjects.PrestamoBusiness;
import BusinessObjects.ReservaBusiness;
import BusinessObjects.SociosBusiness;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 54234
 */
public class HistorialPrestamos extends javax.swing.JFrame {

    /**
     * Creates new form ModificarDatos
     */
    public HistorialPrestamos() {
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
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mostrarTodo = new javax.swing.JButton();
        campoDatos = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        botonId = new javax.swing.JRadioButton();
        botonDni = new javax.swing.JRadioButton();
        botonIdentificacion = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jLabel4.setText("HISTORIAL DE PRESTAMOS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 200, 30));

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel13.setText("BUSCAR POR:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 240, 30));

        mostrarTodo.setBackground(new java.awt.Color(204, 255, 204));
        mostrarTodo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrarTodo.setText("MOSTRAR TODO");
        mostrarTodo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mostrarTodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarTodoActionPerformed(evt);
            }
        });
        jPanel1.add(mostrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 140, 40));

        campoDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDatosActionPerformed(evt);
            }
        });
        jPanel1.add(campoDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 250, 30));

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel14.setText("RESULTADO DE BUSQUEDA:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 240, 30));

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 610, 560));

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel15.setText("INGRESE EL DATO SELECCIONADO:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, 30));

        buttonGroup1.add(botonId);
        botonId.setText("ID SOCIO");
        jPanel1.add(botonId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        buttonGroup1.add(botonDni);
        botonDni.setText("DNI");
        jPanel1.add(botonDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        buttonGroup1.add(botonIdentificacion);
        botonIdentificacion.setText("NUMERO DE IDENTIFICACIÓN DEL LIBRO");
        jPanel1.add(botonIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("BUSCAR");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 90, 40));

        jLabel6.setFont(new java.awt.Font("Edwardian Script ITC", 1, 70)); // NOI18N
        jLabel6.setText("B");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 90, 100));

        jLabel5.setFont(new java.awt.Font("Edwardian Script ITC", 1, 70)); // NOI18N
        jLabel5.setText("F");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 90, 100));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        fondo.setText("jLabel1");
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1010, 640));

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

    private void mostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTodoActionPerformed
        PrestamoBusiness prestamo = new PrestamoBusiness();
        areaTexto.setText("");
        String texto;
        texto = areaTexto.getText();
        ArrayList<String> listaString = prestamo.obtenerHistrorial();

        StringBuilder contenido = new StringBuilder();
        for (String elemento : listaString) {
            contenido.append(elemento).append("\n");  // Cada elemento en una nueva línea
        }

        // Mostrar el contenido en el TextArea
        areaTexto.setText(contenido.toString());
    }//GEN-LAST:event_mostrarTodoActionPerformed

    private void campoDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDatosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String texto;
        SociosBusiness socio = new SociosBusiness();
        LibrosBusiness libro = new LibrosBusiness();
        if (botonId.isSelected()) {//boton id
            try {
                //obtengo los numeros de los campos de textos
                texto = areaTexto.getText();

                // Convierto el texto a int
                int id = Integer.parseInt(texto);

                boolean respuestaS = socio.existeSocioID(id);

                if (respuestaS) {
                    areaTexto.setText("");
                    PrestamoBusiness prestamo = new PrestamoBusiness();
                    ArrayList<String> listaString = prestamo.obtenerHistrorial();
                    StringBuilder contenido = new StringBuilder();
                    for (String elemento : listaString) {
                        contenido.append(elemento).append("\n");  // Cada elemento en una nueva línea
                    }

                    // Mostrar el contenido en el TextArea
                    areaTexto.setText(contenido.toString());
                } else if (!respuestaS) {
                    JOptionPane.showMessageDialog(null, "No existe un socio con ese id");
                }
            } catch (NumberFormatException e) {
                // Manejar el error si el texto no es un número válido
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
            }
        } else if (botonDni.isSelected()) {
            try {
                //obtengo los numeros de los campos de textos
                texto = areaTexto.getText();

                // Convierto el texto a long
                Long dni = Long.parseLong(texto);

                boolean respuestaS = socio.existeSocioDNI(dni);

                if (respuestaS) {
                    areaTexto.setText("");
                    int id = socio.buscarID(dni);
                    ReservaBusiness reserva = new ReservaBusiness();
                    ArrayList<String> listaString = reserva.buscarPorDNI(dni);
                    StringBuilder contenido = new StringBuilder();
                    for (String elemento : listaString) {
                        contenido.append(elemento).append("\n");  // Cada elemento en una nueva línea
                    }

                    // Mostrar el contenido en el TextArea
                    areaTexto.setText(contenido.toString());
                } else if (!respuestaS) {
                    JOptionPane.showMessageDialog(null, "No existe un socio con ese dni");
                }
            } catch (NumberFormatException e) {
                // Manejar el error si el texto no es un número válido
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
            }
        } else if (botonIdentificacion.isSelected()) {
            try {
                //obtengo los numeros de los campos de textos
                texto = areaTexto.getText();

                // Convierto el texto a long
                Long identificacion = Long.parseLong(texto);

                boolean respuestaL = libro.existeLibro(identificacion);

                if (respuestaL) {
                    areaTexto.setText("");
                    ReservaBusiness reserva = new ReservaBusiness();
                    ArrayList<String> listaString = reserva.buscarPorNumeroIdentificacion(identificacion);
                    StringBuilder contenido = new StringBuilder();
                    for (String elemento : listaString) {
                        contenido.append(elemento).append("\n");  // Cada elemento en una nueva línea
                    }

                    // Mostrar el contenido en el TextArea
                    areaTexto.setText(contenido.toString());
                } else if (!respuestaL) {
                    JOptionPane.showMessageDialog(null, "No existe un libro con ese numero de identificacion");
                }
            } catch (NumberFormatException e) {
                // Manejar el error si el texto no es un número válido
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(HistorialPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new HistorialPrestamos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JRadioButton botonDni;
    private javax.swing.JRadioButton botonId;
    private javax.swing.JRadioButton botonIdentificacion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoDatos;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JButton mostrarTodo;
    // End of variables declaration//GEN-END:variables
}

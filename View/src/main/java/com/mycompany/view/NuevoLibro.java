
package com.mycompany.view;

import BusinessObjects.LibrosBusiness;
import ModelException.ModelException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 54234
 */
public class NuevoLibro extends javax.swing.JFrame {

    /**
     * Creates new form NuevoLibro
     */
    public NuevoLibro() {
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
        jLabel4 = new javax.swing.JLabel();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AutorLibro = new javax.swing.JTextField();
        EditorialLibro = new javax.swing.JTextField();
        IdentificadorLibro = new javax.swing.JTextField();
        GeneroLibro = new javax.swing.JTextField();
        TituloLibro = new javax.swing.JTextField();
        EstadoLibro = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        AceptarLibro = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel4.setText("AUTOR:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 100, 20));

        jToggleButton3.setBackground(new java.awt.Color(217, 217, 217));
        jToggleButton3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jToggleButton3.setText("BIBLIOTECA");
        jToggleButton3.setBorder(null);
        jToggleButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 30));

        jToggleButton4.setBackground(new java.awt.Color(217, 217, 217));
        jToggleButton4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jToggleButton4.setText("MENU");
        jToggleButton4.setBorder(null);
        jToggleButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel5.setText(">");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 10, 30));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel3.setText(">");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 10, 30));
        jPanel1.add(AutorLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 240, 40));
        jPanel1.add(EditorialLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 240, 40));
        jPanel1.add(IdentificadorLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 240, 40));
        jPanel1.add(GeneroLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 240, 40));

        TituloLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloLibroActionPerformed(evt);
            }
        });
        jPanel1.add(TituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 240, 40));

        EstadoLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Reservado", "Prestado", "En reparacion", "Perdido" }));
        EstadoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoLibroActionPerformed(evt);
            }
        });
        jPanel1.add(EstadoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 120, -1));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("NUEVO LIBRO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 100, 30));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel7.setText("EDITORIAL:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 100, 20));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel8.setText("NUMEO DE IDENTIFICACIÓN:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 200, 20));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel9.setText("CDU:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 40, 20));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel10.setText("ESTADO:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 100, 20));

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel11.setText("TITULO:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 100, 20));

        AceptarLibro.setBackground(new java.awt.Color(204, 255, 204));
        AceptarLibro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AceptarLibro.setText("ACEPTAR");
        AceptarLibro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AceptarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AceptarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarLibroActionPerformed(evt);
            }
        });
        jPanel1.add(AceptarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 110, 40));

        jLabel12.setFont(new java.awt.Font("Edwardian Script ITC", 1, 70)); // NOI18N
        jLabel12.setText("F");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, 90, 100));

        jLabel13.setFont(new java.awt.Font("Edwardian Script ITC", 1, 70)); // NOI18N
        jLabel13.setText("B");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 90, 100));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        FONDO.setText("jLabel1");
        jPanel1.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

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
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void AceptarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarLibroActionPerformed

        LibrosBusiness datosLibros = new LibrosBusiness();
        String titulo,autor,editorial,identificador,genero,estado; 
        boolean respuestaLibro = false;
        titulo = TituloLibro.getText();
        autor = AutorLibro.getText();
        editorial = EditorialLibro.getText();
        identificador = IdentificadorLibro.getText();
        genero = GeneroLibro.getText();
        estado = EstadoLibro.getSelectedItem().toString();
        
        System.out.println(estado);
        //falta terminar de enviar los datos como parametros.
        try {
            respuestaLibro = datosLibros.guardarLibro(titulo, autor, genero, editorial, identificador, estado);
        } catch (ModelException ex) {
            Logger.getLogger(NuevoLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(respuestaLibro == false){
        JOptionPane.showMessageDialog(null, "Los datos ingresados no son correctos. Verifique los campos por favor.");
            
        }else{
        JOptionPane.showMessageDialog(null, "El libro se ha registrado correctamente");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setVisible(true);
        this.dispose(); 
        }
        
        
    }//GEN-LAST:event_AceptarLibroActionPerformed

    private void TituloLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloLibroActionPerformed
     
        
    }//GEN-LAST:event_TituloLibroActionPerformed

    private void EstadoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadoLibroActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarLibro;
    private javax.swing.JTextField AutorLibro;
    private javax.swing.JTextField EditorialLibro;
    private javax.swing.JComboBox<String> EstadoLibro;
    private javax.swing.JLabel FONDO;
    private javax.swing.JTextField GeneroLibro;
    private javax.swing.JTextField IdentificadorLibro;
    private javax.swing.JTextField TituloLibro;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}

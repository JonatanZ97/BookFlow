/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

/**
 *
 * @author 54234
 */
public class Socios extends javax.swing.JFrame {

    /**
     * Creates new form Socios
     */
    public Socios() {
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
        socios = new javax.swing.JButton();
        socios1 = new javax.swing.JButton();
        socios2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        socios.setBackground(new java.awt.Color(153, 153, 153));
        socios.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        socios.setText("Nuevo Socio");
        socios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        socios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        socios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sociosActionPerformed(evt);
            }
        });
        jPanel1.add(socios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 330, 70));

        socios1.setBackground(new java.awt.Color(204, 0, 0));
        socios1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        socios1.setText("Eliminar Socio");
        socios1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        socios1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        socios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socios1ActionPerformed(evt);
            }
        });
        jPanel1.add(socios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 330, 70));

        socios2.setBackground(new java.awt.Color(153, 153, 153));
        socios2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        socios2.setText("Modificar Socio");
        socios2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        socios2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        socios2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socios2ActionPerformed(evt);
            }
        });
        jPanel1.add(socios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 330, 70));

        jToggleButton1.setBackground(new java.awt.Color(217, 217, 217));
        jToggleButton1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jToggleButton1.setText("MENU");
        jToggleButton1.setBorder(null);
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel3.setText(">");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 10, 30));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("SOCIOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 30));

        jLabel7.setFont(new java.awt.Font("Edwardian Script ITC", 1, 200)); // NOI18N
        jLabel7.setText("F");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 260, 190));

        jLabel6.setFont(new java.awt.Font("Edwardian Script ITC", 1, 200)); // NOI18N
        jLabel6.setText("B");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 260, 190));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sociosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sociosActionPerformed

    private void socios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_socios1ActionPerformed

    private void socios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socios2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_socios2ActionPerformed

    //autor JONATAN ZAMORA
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Socios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Socios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Socios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Socios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Socios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton socios;
    private javax.swing.JButton socios1;
    private javax.swing.JButton socios2;
    // End of variables declaration//GEN-END:variables
}

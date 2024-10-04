package com.mycompany.view;

import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class FechaNacimientoDialog extends JDialog {

    private JDateChooser dateChooser;
    private JButton confirmarButton;
    private Date fechaNacimiento;

    public FechaNacimientoDialog(JFrame parentFrame) {
        // Configuración del diálogo
        super(parentFrame, "Seleccionar Fecha de Nacimiento", true);  // Modal true
        setSize(300, 200);
        setLayout(null);
        setLocationRelativeTo(parentFrame);  // Centrar la ventana respecto al frame principal

        // JDateChooser para seleccionar la fecha
        dateChooser = new JDateChooser();
        dateChooser.setBounds(50, 30, 200, 30);
        add(dateChooser);

        // Botón de confirmar
        confirmarButton = new JButton("Confirmar");
        confirmarButton.setBounds(100, 100, 100, 30);
        add(confirmarButton);

        // Acción del botón de confirmar
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener la fecha seleccionada
                fechaNacimiento = dateChooser.getDate();
                if (fechaNacimiento != null) {
                    JOptionPane.showMessageDialog(parentFrame, "Fecha seleccionada: " + fechaNacimiento);
                    dispose();  // Cerrar la ventana
                } else {
                    JOptionPane.showMessageDialog(parentFrame, "Por favor, selecciona una fecha.");
                }
            }
        });
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
}


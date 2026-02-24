package Interface_Grafica.U2_E0;

import javax.swing.*;
import java.awt.*;

public class Ejercicio_15 {
    public static void main() {
        SwingUtilities.invokeLater(() ->
                new Ventana_EventoBoton("Evento_Botón", 600, 400)
        );
    }

    //SubClases
    public static class Ventana_EventoBoton extends JFrame {
        public Ventana_EventoBoton(String nombre, int ancho, int alto) {
            // Comportamiento básico
            setTitle(nombre);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
            setLayout(new BorderLayout());  // AbsoluteLayout

            JButton boton_Izq = new JButton("Haz clic");
            JButton boton_Dch = new JButton("Haz clic");
            JLabel etiqueta = new JLabel("");  // Texto vacío inicial
            // Evento lambda
            boton_Izq.addActionListener(e -> etiqueta.setText("¡Botón IZQ clicado!"));
            boton_Dch.addActionListener(e -> etiqueta.setText("¡Botón DCH clicado!"));

            add(boton_Izq,BorderLayout.WEST);
            add(boton_Dch,BorderLayout.EAST);
            add(etiqueta, BorderLayout.CENTER);

            setVisible(true);
        }
    }
}


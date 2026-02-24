package Interface_Grafica.U2_E0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ejercicio_16 {
    public static void main() {
        SwingUtilities.invokeLater(() ->
                new Ventana_EventoTeclado("Evento_Teclado", 600, 400)
        );
    }

    //SubClases
    public static class Ventana_EventoTeclado extends JFrame {
        public Ventana_EventoTeclado(String nombre, int ancho, int alto) {
            // Comportamiento básico
            setTitle(nombre);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
            setLayout(new BorderLayout());

            JTextField campoTexto = new JTextField();
            JLabel etiqueta = new JLabel("Escribe algo...");


            campoTexto.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    etiqueta.setText("Tecla presionada: " + e.getKeyChar());
                }
            });

            add(campoTexto, BorderLayout.NORTH);
            add(etiqueta, BorderLayout.SOUTH);

            setVisible(true);
        }
    }
}


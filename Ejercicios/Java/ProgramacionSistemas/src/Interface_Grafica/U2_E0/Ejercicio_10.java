package Interface_Grafica.U2_E0;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ejercicio_10 {
    public static void main() {
        SwingUtilities.invokeLater(() ->
                new Evento_Listener("Anidados", 600, 400)
        );
    }

    //SubClases
    public static class Evento_Listener extends JFrame {
        public Evento_Listener(String nombre, int alto, int ancho) {
            //Comportamiento básico
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
            //Añadimos layout
            setLayout(null);  // AbsoluteLayout (coordenadas fijas)

            JTextField campo = new JTextField();
            campo.setBounds(50, 50, 200, 30);

            JLabel etiqueta = new JLabel("");
            etiqueta.setBounds(50, 100, 200, 30);

            // ✅ Evento: Tecla presionada → Muestra carácter
            campo.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    etiqueta.setText("Tecla: " + e.getKeyChar());
                }

            });

            add(campo);
            add(etiqueta);

            setVisible(true);
        }
    }
}


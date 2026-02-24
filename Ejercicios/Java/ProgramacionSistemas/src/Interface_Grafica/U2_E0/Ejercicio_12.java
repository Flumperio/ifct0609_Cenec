package Interface_Grafica.U2_E0;

import javax.swing.*;

public class Ejercicio_12 {
    public static void main() {
        SwingUtilities.invokeLater(() ->
                new Ventana_Box("Ventana - Box", 600, 400)
        );
    }

    //SubClases
    public static class Ventana_Box extends JFrame {
        public Ventana_Box(String nombre, int ancho, int alto) {
            // Comportamiento básico
            setTitle(nombre);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
            setLayout(null);  // Como en tus ejercicios (aunque BoxLayout va en el panel)

            // Panel con BoxLayout en X_AXIS
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
            panel.setBounds(10, 20, ancho - 40, 40);  // Posición/tamaño a tu estilo

            panel.add(new JButton("Botón A"));
            panel.add(new JButton("Botón B"));
            panel.add(new JButton("Botón C"));
            panel.add(new JButton("Botón D"));

            add(panel);

            // Panel con BoxLayout en y_AXIS
            JPanel panel_Y = new JPanel();
            panel_Y.setLayout(new BoxLayout(panel_Y, BoxLayout.Y_AXIS));
            panel_Y.setBounds(10, 60, ancho - 40 , alto - 40);  // Posición/tamaño a tu estilo

            panel_Y.add(new JButton("Botón 1"));
            panel_Y.add(new JButton("Botón 2"));
            panel_Y.add(new JButton("Botón 3"));
            panel_Y.add(new JButton("Botón 4"));

            add(panel_Y);

            setVisible(true);
        }
    }
}


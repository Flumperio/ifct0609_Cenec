package Interface_Grafica.U2_E0;

import javax.swing.*;

public class Ejercicio_14 {
    public static void main() {
        SwingUtilities.invokeLater(() ->
                new Ventana_Componentes("Ventana - Box", 600, 400)
        );
    }

    //SubClases
    public static class Ventana_Componentes extends JFrame {
        public Ventana_Componentes(String nombre, int ancho, int alto) {
            // Comportamiento básico
            setTitle(nombre);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
            setLayout(null);  // Tu estilo AbsoluteLayout

            // Panel con componentes Swing (FlowLayout por defecto)
            JPanel panel = new JPanel();
            panel.setBounds(20, 20, 260, 150);  // Posicionado manualmente

            JLabel etiqueta = new JLabel("Nombre:");
            JTextField campoTexto = new JTextField(15);
            JButton boton = new JButton("Enviar");
            JCheckBox check = new JCheckBox("Aceptar términos");

            String[] opciones = {"Rojo", "Verde", "Azul"};
            JComboBox<String> combo = new JComboBox<>(opciones);

            // Añadir al panel (FlowLayout automático)
            panel.add(etiqueta);
            panel.add(campoTexto);
            panel.add(boton);
            panel.add(check);
            panel.add(combo);

            add(panel);

            setVisible(true);
        }
    }
}


package Interface_Grafica.U2_E0;

import javax.swing.*;

public class Ejercicio_13 {
    public static void main() {
        SwingUtilities.invokeLater(() ->
                new Ventana_Null("Ventana - Box", 600, 400)
        );
    }

    //SubClases
    public static class Ventana_Null extends JFrame {
        public Ventana_Null(String nombre, int ancho, int alto) {
            // Comportamiento básico
            setTitle(nombre);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
            setLayout(null);  // Null Layout (posiciones absolutas)

            // Botones con coordenadas fijas
            JButton boton1 = new JButton("Botón 1");
            boton1.setBounds(30, 30, 100, 30);

            JButton boton2 = new JButton("Botón 2");
            boton2.setBounds(150, 80, 100, 30);

            JButton boton3 = new JButton("Botón 3");
            boton3.setBounds(200, 130, 100, 30);

            JButton boton4 = new JButton("Botón 4");
            boton4.setBounds(350, 180, 100, 30);

            add(boton1);
            add(boton2);
            add(boton3);
            add(boton4);

            setVisible(true);
        }
    }
}


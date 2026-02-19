package Interface_Grafica.U2_E2;

import javax.swing.*;
import java.awt.*;

public class Ejercicio_7 {
    public static void main() {
        new Evento_Teclado("Anidados", 600, 400);
    }

    //SubClases
    public static class Evento_Teclado extends JFrame {
        public Evento_Teclado(String nombre, int alto, int ancho) {
            //Comportamiento básico
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
            //Añadimos layout
            setLayout(new GridLayout(2,2));  // AbsoluteLayout (coordenadas fijas)

            JButton boton1 = new JButton("Haz clic");
            boton1.setBounds(50, 50, 100, 30);
            JButton boton2 = new JButton("Haz clic");
            boton2.setBounds(250, 50, 100, 30);
            JLabel etiqueta1 = new JLabel("¡Boton sin Click!");  // Texto vacío inicial
            etiqueta1.setBounds(50, 100, 200, 30);
            JLabel etiqueta2 = new JLabel("¡Boton sin Click!");  // Texto vacío inicial
            etiqueta2.setBounds(250, 100, 200, 30);

            boton1.addActionListener(e -> etiqueta1.setText("¡Botón clicado!"));
            boton2.addActionListener(e -> etiqueta2.setText("¡Botón clicado!"));
            add(boton1);
            add(etiqueta1);
            add(boton2);
            add(etiqueta2);

            setVisible(true);
        }

        }
    }


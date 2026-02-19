package Interface_Grafica.U2_E2;

import javax.swing.*;
import java.awt.*;

public class Ejercicio_6 {
    public static void main (){
        new Ejemplo_Anidados("Anidados", 600,400);
    }
    //SubClases
    public static class Ejemplo_Anidados extends JFrame{
        public Ejemplo_Anidados(String nombre, int alto, int ancho){
            super(nombre);
            //Comportamiento básico
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
            //Añadimos layout
            setLayout(new BorderLayout());

            //Creamos los paneles para el layout
            //Panel norte
            JPanel norte = new JPanel(new FlowLayout());
            norte.add(new JButton("Botón 1"));
            norte.add(new JButton("Botón 2"));
            norte.setPreferredSize(new Dimension(600, 200));
            add(norte, BorderLayout.NORTH);
            //Panel Centro
            JPanel centro = new JPanel(new GridLayout(2, 2));
            centro.add(new JLabel("Nombre:"));
            centro.add(new JTextField(10));
            centro.add(new JLabel("Edad:"));
            centro.add(new JTextField(3));
            add(centro, BorderLayout.CENTER);
            //Panel Sur
            JPanel sur = new JPanel(new FlowLayout());
            sur.add(new JLabel("Hola", JLabel.CENTER));
            sur.setPreferredSize(new Dimension(600, 200));
            add(sur, BorderLayout.SOUTH);

            setVisible(true);
        }
    }
}

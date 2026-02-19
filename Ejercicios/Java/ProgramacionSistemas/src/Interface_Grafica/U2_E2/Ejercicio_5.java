package Interface_Grafica.U2_E2;

import javax.swing.*;
import java.awt.*;

public class Ejercicio_5 {
    public static void main (){
        new Ejemplo_GridLayout("GridLayout", 600,400);
    }
    //SubClases
    public static class Ejemplo_GridLayout extends JFrame{
        public Ejemplo_GridLayout(String nombre, int alto, int ancho){
            super(nombre);
            //Comportamiento básico
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
            //Añadimos layout
            setLayout(new GridLayout(3, 3));  // 2 filas, 3 columnas

            add(new JButton("1"));
            add(new JButton("2"));
            add(new JButton("3"));
            add(new JButton("4"));
            add(new JButton("5"));
            add(new JButton("6"));

            setVisible(true);
        }
    }
}

package Interface_Grafica.U2_E2;

import javax.swing.*;
import java.awt.*;

public class Ejercicio_4 {
    public static void main (){
        new Ejemplo_BorderLayout("BorderLayout", 600,400);
    }
    //SubClases
    public static class Ejemplo_BorderLayout extends JFrame{
        public Ejemplo_BorderLayout (String nombre, int alto, int ancho){
            super(nombre);
            //Comportamiento básico
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
            //Añadimos layout
            setLayout(new BorderLayout());
            add(new JButton("Norte"), BorderLayout.NORTH);
            add(new JButton("Sur"), BorderLayout.SOUTH);
            add(new JButton("Este"), BorderLayout.EAST);
            add(new JButton("Oeste"), BorderLayout.WEST);
            add(new JButton("Centro"), BorderLayout.CENTER);

            setVisible(true);
        }
    }
}

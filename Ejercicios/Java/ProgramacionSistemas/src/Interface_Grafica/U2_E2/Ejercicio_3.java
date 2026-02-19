package Interface_Grafica.U2_E2;

import javax.swing.*;
import java.awt.*;

public class Ejercicio_3 {
    public static void main (){
        new Ejmplo_FlowLayout("FlowLayout", 400, 300);
    }
    //SubClases
    public static class Ejmplo_FlowLayout extends JFrame{
        public Ejmplo_FlowLayout(String nombre, int alto, int ancho){
            super(nombre);
            //Comportamiento básico
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
            //Añadimos layout
            setLayout(new FlowLayout());
            add(new JButton("Uno"));
            add(new JButton("Dos"));
            add(new JButton("Tres"));
            add(new JButton("Cuatro"));

            setVisible(true);
        }
    }
}

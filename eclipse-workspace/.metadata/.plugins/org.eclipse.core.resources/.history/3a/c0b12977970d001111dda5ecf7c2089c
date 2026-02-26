package Interface_Grafica.U2_E3;

import Banco.VentanaEntrada;

import javax.swing.*;
import java.awt.*;

public class Ejercicio_1 {
    public static void main (){
        new Ventana_Flow("Ventana_Flow", 600, 400);

    }
    static class Ventana_Flow extends JFrame {
        public Ventana_Flow(String nombre, int alto, int ancho) {
            super(nombre);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
            //Añadimos layout
            setLayout(new BorderLayout()); //Ponemos el BorderLayout para probar
            //Creamos los panels correspondientes
            JPanel center_Panel = new JPanel();
            JPanel up_Panel = new JPanel();
            JPanel left_Panel = new JPanel();

            //Creamos los botones correspondientes
            //North
            up_Panel.setLayout(new FlowLayout());
            JLabel label1 = new JLabel("Que Pasa Majo");
            //Center
            center_Panel.setLayout(new FlowLayout());
            JButton button1 = new JButton("Botón 1");
            JButton button2 = new JButton("Botón 2");
            JButton button3 = new JButton("Botón 3");
            JButton button4 = new JButton("Botón 4");
            JButton button5 = new JButton("Botón 5");
            //Right
            left_Panel.setLayout(new FlowLayout());
            JLabel l_label1 = new JLabel("IZQ");


            //Añadimos los botones al panel
            //Arriba
            up_Panel.add(label1);
            //Centro
            center_Panel.add(button1);
            center_Panel.add(button2);
            center_Panel.add(button3);
            center_Panel.add(button4);
            center_Panel.add(button5);
            //IZQ
            left_Panel.add(l_label1);



            add(up_Panel,BorderLayout.NORTH);
            add(center_Panel,BorderLayout.CENTER);
            add(left_Panel,BorderLayout.WEST);
            setVisible(true);
        }
    }
}

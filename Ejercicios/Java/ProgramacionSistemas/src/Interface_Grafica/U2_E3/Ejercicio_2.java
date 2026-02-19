package Interface_Grafica.U2_E3;

import javax.swing.*;
import java.awt.*;

public class Ejercicio_2 {
    public static void main (){
        new Ventana_Bordeer("Ejercicio 2", 250, 450);

    }
    static class Ventana_Bordeer extends JFrame {
        public Ventana_Bordeer(String nombre, int alto, int ancho) {
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
            JPanel right_Panel = new JPanel();

            //Creamos los botones correspondientes
            //North
            up_Panel.setLayout(new FlowLayout());
            JLabel label1 = new JLabel("Entrada de Datos");
            //IZQ
            left_Panel.setLayout(new GridLayout(4,1));
            JLabel l_label1 = new JLabel("Nombre:");
            JLabel l_label2 = new JLabel("Apellidos:");
            JLabel l_label3 = new JLabel("Dirección:");
            JLabel l_label4 = new JLabel("eMail:");
            //Center
            center_Panel.setLayout(new GridLayout(4,1));
            JTextField c_field1 = new JTextField();
            JTextField c_field2 = new JTextField();
            JTextField c_field3 = new JTextField();
            JTextField c_field4 = new JTextField();
            //DCH
            right_Panel.setLayout(new GridLayout(4,1));
            JButton button1 = new JButton("Botón 1");
            JButton button2 = new JButton("Botón 2");
            JButton button3 = new JButton("Botón 3");
            JButton button4 = new JButton("Botón 4");

            //Añadimos los botones al panel
            //Arriba
            up_Panel.add(label1);
            //IZQ
            left_Panel.add(l_label1);
            left_Panel.add(l_label2);
            left_Panel.add(l_label3);
            left_Panel.add(l_label4);
            //Centro
            center_Panel.add(c_field1);
            center_Panel.add(c_field2);
            center_Panel.add(c_field3);
            center_Panel.add(c_field4);
            //Derecha
            right_Panel.add(button1);
            right_Panel.add(button2);
            right_Panel.add(button3);
            right_Panel.add(button4);


            //Añadimos al Frame.
            add(up_Panel,BorderLayout.NORTH);
            add(center_Panel,BorderLayout.CENTER);
            add(left_Panel,BorderLayout.WEST);
            add(right_Panel, BorderLayout.EAST);
            setVisible(true);
        }
    }
}

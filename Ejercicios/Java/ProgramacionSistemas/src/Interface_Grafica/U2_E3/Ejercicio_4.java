package Interface_Grafica.U2_E3;

import javax.swing.*;
import java.awt.*;

public class Ejercicio_4 {
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
            JPanel up_Panel = new JPanel();
            JPanel left_Panel = new JPanel();
            JPanel center_Panel = new JPanel();
            JPanel right_Panel = new JPanel();
            JPanel down_Panel = new JPanel();

            //Creamos los botones correspondientes
            //North
            up_Panel.setLayout(new GridLayout(1,1));
            JButton up_button = new JButton("Pause");
            //IZQ
            left_Panel.setLayout(new GridLayout(1,1));
            JButton left_button = new JButton("Rewind");
            //Center
            center_Panel.setLayout(new GridLayout(1,1));
            JButton center_button = new JButton("Play");
            //DCH
            right_Panel.setLayout(new GridLayout(1,1));
            JButton right_button = new JButton("Forward");
            //Down
            down_Panel.setLayout(new GridLayout(1,1));
            JButton down_button = new JButton("Stop");

            //Añadimos los botones al panel
            //Arriba
            up_Panel.add(up_button);
            //IZQ
            left_Panel.add(left_button);
            //Centro
            center_Panel.add(center_button);
            //Derecha
            right_Panel.add(right_button);
            //Down
            down_Panel.add(down_button);



            //Añadimos al Frame.
            add(up_Panel,BorderLayout.NORTH);
            add(left_Panel,BorderLayout.WEST);
            add(center_Panel,BorderLayout.CENTER);
            add(right_Panel, BorderLayout.EAST);
            add(down_Panel,BorderLayout.SOUTH);
            setVisible(true);
        }
    }
}

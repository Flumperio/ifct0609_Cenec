package Interface_Grafica.U2_E3;

import javax.swing.*;
import java.awt.*;

public class Ejercicio_XX {
        public static void main(String[] args) {
//creamos el JFrame
            JFrame frame = new JFrame("BorderLayout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
// creamos el layout
            frame.setLayout(new BorderLayout());
//creamos los button
            JButton northButton = new JButton("NORTH");
            JButton southButton = new JButton("SOUTH");
            JButton eastButton = new JButton("EAST");
            JButton westButton = new JButton("WEST");
            JButton centerButton = new JButton("CENTER");

//posicionamos los button en el borderlayout
            frame.add(northButton, BorderLayout.NORTH);
            frame.add(southButton, BorderLayout.SOUTH);
            frame.add(eastButton, BorderLayout.EAST);
            frame.add(westButton, BorderLayout.WEST);
            frame.add(centerButton, BorderLayout.CENTER);

            frame.setVisible(true);
        }
    }

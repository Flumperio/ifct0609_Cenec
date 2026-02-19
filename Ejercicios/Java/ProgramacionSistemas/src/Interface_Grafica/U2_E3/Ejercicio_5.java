package Interface_Grafica.U2_E3;

import javax.swing.*;
import java.awt.*;

public class Ejercicio_5 {
    public static void main (){
        SwingUtilities.invokeLater(() -> new Ventana_Bordeer("Ejercicio 5", 450, 300));
    }

    static class Ventana_Bordeer extends JFrame {
        private JTextField down_field;  // ← 1. Declaración global

        public Ventana_Bordeer(String nombre, int alto, int ancho) {
            super(nombre);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
            //Añadimos layout
            setLayout(new BorderLayout());

            //North
            JPanel up_Panel = new JPanel();
            up_Panel.setLayout(new FlowLayout());
            JTextField up_field = new JTextField("Calculadora");
            up_Panel.add(up_field);
            add(up_Panel,BorderLayout.NORTH);

            //Center
            JPanel center_Panel = new JPanel();
            center_Panel.setLayout(new GridLayout(4,4));
            String[] buttons = {
                    "7", "8", "9", "/",
                    "4", "5", "6", "*",
                    "1", "2", "3", "-",
                    "0", "C", "=", "+"
            };
            for (String texto : buttons) {
                JButton btn = new JButton(texto);
                // ✅ Evento: Clic → Muestra en SOUTH
                btn.addActionListener(e -> down_field.setText(down_field.getText() + texto));
                center_Panel.add(btn);
            }
            add(center_Panel,BorderLayout.CENTER);

            //Down
            JPanel down_Panel = new JPanel();
            down_Panel.setLayout(new GridLayout(1,1));
            down_field = new JTextField("");
            down_Panel.add(down_field);
            add(down_Panel, BorderLayout.SOUTH);

            //Hacemos visible la ventana
            setVisible(true);
        }
    }
}

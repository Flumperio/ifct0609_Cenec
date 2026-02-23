package Interface_Grafica.U2_E3;

import javax.swing.*;
import java.awt.*;

public class Ejercicio_5_5 {
    public static void main (){
        SwingUtilities.invokeLater(() -> new Ventana_Bordeer("Ejercicio 5", 450, 450));
    }

    static class Ventana_Bordeer extends JFrame {
        private JTextField down_field, center_field;   // ← 1. Declaración global
        private JComboBox<String> comboBox;

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
            center_Panel.setLayout(new GridLayout(2,1));
            String[] opciones = {"","Java", "Kotlin", "PHP", "JAVASCRIPT"};
            comboBox = new JComboBox<>(opciones);
            //Construimos el panel
            center_Panel.add(comboBox);
            center_field = new JTextField("Elige una opción...");
            center_Panel.add(center_field);
            //Añadimos el panel creado.
            add(center_Panel, BorderLayout.CENTER);
            //Down
            JPanel down_Panel = new JPanel();
            down_Panel.setLayout(new GridLayout(1,1));
            down_field = new JTextField("");
            down_Panel.add(down_field);
            add(down_Panel, BorderLayout.SOUTH);
            //Una vez definidos todos los paneles, Añadimos los listeners,
            comboBox.addActionListener(e -> {
                String seleccionado = (String) comboBox.getSelectedItem();
                if (seleccionado != null && !seleccionado.isEmpty()) {
                    center_field.setText("Has elegido: " + seleccionado);
                } else {
                    center_field.setText("No has elegido nada. Piltrafa.");
                }
            });
            //Hacemos visible la ventana
            setVisible(true);
        }
    }
}

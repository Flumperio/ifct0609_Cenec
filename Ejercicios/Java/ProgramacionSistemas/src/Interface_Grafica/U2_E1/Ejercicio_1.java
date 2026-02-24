package Interface_Grafica.U2_E1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Ejercicio_1 {
	public static void main() {
        SwingUtilities.invokeLater(() ->
                new Ventana_TextField("Ejemplo JTextField", 500, 300)
        );
    }

    public static class Ventana_TextField extends JFrame {
        public Ventana_TextField(String nombre, int ancho, int alto) {
            // Comportamiento básico
            setTitle(nombre);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			//Layout por defecto
			setLayout(null);

            // JLabel
            JLabel label = new JLabel("Indica tu nombre:");
            label.setBounds(10, 10, 150, 20);
            add(label);

            // JTextField
            JTextField textField = new JTextField();
            textField.setBounds(160, 10, 120, 20);
            add(textField);

			//Hacemos visible la ventana.
            setVisible(true);
        }
    }

}

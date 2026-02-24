package Interface_Grafica.U2_E0;

import javax.swing.*;

public class Ejercicio_11 {
    public static void main() {
        SwingUtilities.invokeLater(() ->
                new Ventana_Menu("Menús", 600, 400)
        );
    }

    //SubClases
    public static class Ventana_Menu extends JFrame {
        public Ventana_Menu(String nombre, int ancho, int alto) {
            // Comportamiento básico
            setTitle(nombre);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
            setLayout(null);  // Igual que en tus ejercicios (AbsoluteLayout)

            // Barra de menú
            JMenuBar barra = new JMenuBar();
            JMenu archivo = new JMenu("Archivo");

            JMenuItem nuevo = new JMenuItem("Nuevo");
            JMenuItem salir = new JMenuItem("Salir");

            salir.addActionListener(e -> System.exit(0));

            archivo.add(nuevo);
            archivo.addSeparator();
            archivo.add(salir);

            barra.add(archivo);
            setJMenuBar(barra);  // Se coloca arriba de la ventana

            // (Opcional) contenido básico en la ventana
            JLabel etiqueta = new JLabel("Ventana con menú");
            etiqueta.setBounds(20, 40, 200, 30);
            add(etiqueta);

            setVisible(true);
        }
    }
}


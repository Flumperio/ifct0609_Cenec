package Interface_Grafica.U2_E0;

import javax.swing.*;
import java.awt.*;

public class Ejercicio_17 {
    public static void main() {
        SwingUtilities.invokeLater(() ->
                new Ventana_MenuCompleto("Menús.", 600, 400)
        );
    }

    //SubClases
    public static class Ventana_MenuCompleto extends JFrame {
        public Ventana_MenuCompleto(String nombre, int ancho, int alto) {
            // Comportamiento básico
            setTitle(nombre);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
            setLayout(new BorderLayout());

            JMenuBar menuBar = new JMenuBar();
            JMenu menuArchivo = new JMenu("Archivo");
            JMenu menuEdicion = new JMenu("Edicion");

            JMenuItem itemNuevo = new JMenuItem("Nuevo");
            JMenuItem itemAbrir = new JMenuItem("Abrir");
            JMenuItem itemSalir = new JMenuItem("Salir");

            itemNuevo.addActionListener(e ->
                    JOptionPane.showMessageDialog(this, "Has hecho clic en 'Nuevo'")
            );
            itemAbrir.addActionListener(e ->
                    JOptionPane.showMessageDialog(this, "Has hecho clic en 'Abrir'")
            );

            itemSalir.addActionListener(e -> System.exit(0));

            menuArchivo.add(itemNuevo);
            menuArchivo.add(itemAbrir);
            menuArchivo.addSeparator();
            menuArchivo.add(itemSalir);

            menuBar.add(menuArchivo);
            menuBar.add(menuEdicion);

            setJMenuBar(menuBar);

            // Contenido opcional (tu estilo)
            JLabel etiqueta = new JLabel("Prueba el menú Archivo...");

            add(etiqueta, BorderLayout.CENTER);

            setVisible(true);
        }
    }
}


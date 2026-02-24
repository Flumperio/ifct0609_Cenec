package Interface_Grafica.U2_E0;

import javax.swing.*;

public class Ejercicio_18 {
    public static void main() {
        SwingUtilities.invokeLater(() ->
                new Ventana_MenuAvanzado("Menús.", 600, 400)
        );
    }

    //SubClases
    public static class Ventana_MenuAvanzado extends JFrame {
        public Ventana_MenuAvanzado(String nombre, int ancho, int alto) {
            // Comportamiento básico
            setTitle(nombre);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
            setLayout(null);

            JMenuBar menuBar = new JMenuBar();

            JMenu menuArchivo = new JMenu("Archivo");
            JMenu menuEdicion = new JMenu("Edición");

            JMenuItem itemNuevo = new JMenuItem("Nuevo");
            JMenuItem itemSalir = new JMenuItem("Salir");

            JMenuItem itemCortar = new JMenuItem("Cortar");
            JMenuItem itemCopiar = new JMenuItem("Copiar");
            JMenuItem itemPegar = new JMenuItem("Pegar");

            itemNuevo.addActionListener(e ->
                    JOptionPane.showMessageDialog(this, "Has hecho clic en 'Nuevo'"));
            itemCortar.addActionListener(e ->
                    JOptionPane.showMessageDialog(this, "Has hecho clic en 'Cortar'"));
            itemCopiar.addActionListener(e ->
                    JOptionPane.showMessageDialog(this, "Has hecho clic en 'Copiar'"));
            itemPegar.addActionListener(e ->
                    JOptionPane.showMessageDialog(this, "Has hecho clic en 'Pegar'"));

            itemSalir.addActionListener(e -> System.exit(0));

            menuArchivo.add(itemNuevo);
            menuArchivo.addSeparator();
            menuArchivo.add(itemSalir);

            menuEdicion.add(itemCortar);
            menuEdicion.add(itemCopiar);
            menuEdicion.add(itemPegar);

            menuBar.add(menuArchivo);
            menuBar.add(menuEdicion);

            setJMenuBar(menuBar);

            // Etiqueta informativa
            JLabel etiqueta = new JLabel("Prueba menús: Archivo y Edición");
            etiqueta.setBounds(20, 40, 300, 30);
            add(etiqueta);

            setVisible(true);
        }
    }
}


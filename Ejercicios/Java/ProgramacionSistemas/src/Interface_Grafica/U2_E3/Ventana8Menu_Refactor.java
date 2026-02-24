package Interface_Grafica.U2_E3;

import javax.swing.*;
import java.util.ArrayList;

public class Ventana8Menu_Refactor extends JFrame {
    // Declaración de la MenuBar
    private JMenuBar mb = new JMenuBar();
    // Declaración de los Menús
    private String[] menus = {"Archivo", "Edición", "Herramientas", "Ayuda"};
    //Declaración de los submenús
    private String[] itemsArchivo = {"Abrir", "Guardar", "Salir"};
    private String[] itemsEdicion = {"Cortar", "Copiar", "Pegar"};
    private String[] itemsHerramientas = {"Crear", "Borrar", "Modificar"};
     private String[] itemsAyuda = {"Back-UP", "Restaurar", "Version"};
    // Lista de menús creados (para acceder por índice)
    private ArrayList<JMenu> menusCreados = new ArrayList<>(); //archivo, ediciom etc, array de objetos, tipo jmenu

    //Constructor
    public Ventana8Menu_Refactor() {
        setTitle("Refactor de Ventana8"); // Establece el título de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define la operación de cierre de la ventana
        setLayout(null); // Layout nulo para posicionar manualmente los componentes
        setJMenuBar(mb); // Asigna la barra de menú al JFrame
        //Crear Menús.
        crearMenus(menus);
        // 3) Crear items en cada menú con un solo método,
        crearItems(menusCreados.get(0), itemsArchivo);
        crearItems(menusCreados.get(1), itemsEdicion);
        crearItems(menusCreados.get(2),itemsHerramientas);
        crearItems(menusCreados.get(3), itemsAyuda);

        setBounds(10, 20, 400, 250);
        setLocationRelativeTo(null);

    }
    //Métodos
    private void crearMenus(String[] nombres) {
        for (String nomb : nombres) {
            JMenu menu = new JMenu(nomb);
            mb.add(menu);
            menusCreados.add(menu); //los añadimos al array menus creados
        }
    }
    // Crea todos los items de un menú desde un array + listener lambda
    private void crearItems(JMenu menu, String[] nombresItems) {
        for (String nombreItem : nombresItems) {
            JMenuItem item = new JMenuItem(nombreItem);
            // ✅ Lambda: al pulsar, muestra qué has pulsado
            item.addActionListener(e ->
                    JOptionPane.showMessageDialog(
                            this,
                            "Has pulsado \"" + nombreItem + "\""
                    )
            );
            menu.add(item);
        }
    }
    //Main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ventana8Menu_Refactor().setVisible(true));
            }
    }

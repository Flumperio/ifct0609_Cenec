package Interface_Grafica.U2_E3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ventana8Menu_Refactor extends JFrame implements ActionListener {
    // Declaración de componentes del menú
    private JMenuBar mb = new JMenuBar(); // Barra de menú
    private ArrayList<JMenu> menus = new ArrayList<>();
    private JMenu menuClientes, menuProveedores, menuProductos, menuInventario, menuAyuda;
    private JMenuItem itemAbrir, itemGuardar,
            itemCortar, itemCopiar, itemPegar;
    public Ventana8Menu_Refactor() {
        setTitle("Ejemplo de Menú con JFrame"); // Establece el título de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define la operación de cierre de la ventana
        setLayout(null); // Layout nulo para posicionar manualmente los componentes
        setJMenuBar(mb); // Asigna la barra de menú al JFrame
        JPanel panelPrincipal = new JPanel(new GridLayout(8,8,4,8));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        setContentPane(panelPrincipal);
        // Configuración del menú "Clientes"
        menuClientes = crearMenu(mb, "Clientes");
        menus.add(menuClientes);
        menuProveedores = crearMenu(mb, "Proveedores");
        menus.add(menuProveedores);
        menuProductos = crearMenu(mb, "Productos");
        menus.add(menuProductos);
        menuInventario = crearMenu(mb, "Inventario");
        menus.add(menuInventario);
        menuAyuda = crearMenu(mb, "Ayuda");
        menus.add(menuAyuda);
        //Submenu Abrir
        itemAbrir = crearItem(menuClientes, "Abrir");
        itemGuardar = crearItem(menuClientes, "Guardar");
        //Submenu proveedores
        itemCopiar = crearItem(menuProveedores, "Copiar");
        itemCortar = crearItem(menuProveedores, "Cortar");
        itemPegar = crearItem(menuProveedores, "Pegar");


        // Configuración final de la ventana
        pack();
        //setBounds(10, 20, 300, 200); // Establece las dimensiones y la posición de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
    }

    // Método que maneja los eventos de los elementos del menú
    public void actionPerformed(ActionEvent e) {
        Container contentPane = getContentPane(); // Obtiene el panel de contenido de la ventana
        if (e.getSource() == itemAbrir) { // Comprueba si el evento proviene del ítem "Abrir"
            contentPane.setBackground(new Color(255, 0, 200)); // Cambia el color de fondo a rojo si se selecciona "Abrir"
        }
    }
    // Método para crear menú
    public static JMenu crearMenu(JMenuBar mb, String nombre) {
        JMenu menu = new JMenu(nombre);
        mb.add(menu);
        return menu;
    }

    private JMenuItem crearItem(JMenu menu, String texto) {
        JMenuItem item = new JMenuItem(texto);
        menu.add(item);
        return item;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { // Asegura que la creación de la GUI se haga en el hilo de despacho de eventos
            public void run() {
                Ventana8Menu_Refactor formulario1 = new Ventana8Menu_Refactor(); // Crea una instancia de la ventana
                formulario1.setVisible(true); // Hace visible la ventana
            }
        });
    }
}

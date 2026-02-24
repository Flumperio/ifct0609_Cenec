package Interface_Grafica.U2_E3;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ventana8Menu extends JFrame implements ActionListener {
    // Declaración de componentes del menú
    private JMenuBar mb = new JMenuBar(); // Barra de menú
    private JMenu menuClientes, menuProveedores, menuProductos, menuInventario, menuAyuda; // Menús para clientes y proveedores
    private JMenuItem mc1, mc2, mp1, mp2, mpro1, mpro2, mpro3, mi1, mi2,ma1, ma2; // Elemento de menú "Abrir"


    public Ventana8Menu() {
        setTitle("Ejemplo de Menú con JFrame"); // Establece el título de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define la operación de cierre de la ventana
        setLayout(null); // Layout nulo para posicionar manualmente los componentes
        setJMenuBar(mb); // Asigna la barra de menú al JFrame
        JPanel panelPrincipal = new JPanel(new GridLayout(13,2,4,8));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        setContentPane(panelPrincipal);
        // Configuración del menú "Clientes"
        menuClientes = new JMenu("Clientes"); // Instancia del menú "Clientes"
        mb.add(menuClientes); // Añade el menú "Clientes" a la barra de menú

        mc1 = new JMenuItem("Abrir"); // Crea un elemento de menú "Abrir"
        mc1.addActionListener(this); // Añade un ActionListener para manejar eventos cuando se selecciona este ítem
        menuClientes.add(mc1); // Añade el ítem "Abrir" al menú "Clientes"

        mc2 = new JMenuItem("Guardar"); // Crea otro elemento de menú "Guardar"
        mc2.addActionListener(this); // Añade un ActionListener para manejar eventos cuando se selecciona este ítem
        menuClientes.add(mc2); // Añade el ítem "Guardar" al menú "Clientes"

        // Configuración del menú "Proveedores"
        menuProveedores = new JMenu("Proveedores"); // Instancia del menú "Proveedores"
        mp1 = new JMenuItem("Abrir");
        mp2 = new JMenuItem("Guardar");
        menuProveedores.add(mp1);
        menuProveedores.add(mp2);
        mb.add(menuProveedores); // Añade el menú "Proveedores" a la barra de menú
        //Configuración del menú Productos
        menuProductos = new JMenu("Productos"); // Instancia del menú "Proveedores"
        mpro1 = new JMenuItem("Alta");
        mpro2 = new JMenuItem("Modificación");
        mpro3 = new JMenuItem("Baja");
        menuProductos.add(mpro1);
        menuProductos.add(mpro2);
        menuProductos.add(mpro3);
        mb.add(menuProductos);
        //Menú Inventario
        menuInventario = new JMenu("Inventario"); // Instancia del menú "Proveedores"
        mi1 = new JMenuItem("Entrada");
        mi2 = new JMenuItem("Salida");
        menuInventario.add(mi1);
        menuInventario.add(mi2);
        mb.add(menuInventario);
        //Menú Ayuda


        // Configuración final de la ventana
        pack();
        //setBounds(10, 20, 300, 200); // Establece las dimensiones y la posición de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
    }

    // Método que maneja los eventos de los elementos del menú
    public void actionPerformed(ActionEvent e) {
        Container contentPane = getContentPane(); // Obtiene el panel de contenido de la ventana
        if (e.getSource() == mc1) { // Comprueba si el evento proviene del ítem "Abrir"
            contentPane.setBackground(new Color(255, 0, 200)); // Cambia el color de fondo a rojo si se selecciona "Abrir"
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { // Asegura que la creación de la GUI se haga en el hilo de despacho de eventos
            public void run() {
                Ventana8Menu formulario1 = new Ventana8Menu(); // Crea una instancia de la ventana
                formulario1.setVisible(true); // Hace visible la ventana
            }
        });
    }
}

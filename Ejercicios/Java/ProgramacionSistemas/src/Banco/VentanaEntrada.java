package Banco;

import javax.swing.*;

public class VentanaEntrada extends JFrame{
    private JMenuBar barraMenus;

    // Constructor: numMenus = número de menús, textos = literales de cada menú
    public VentanaEntrada(int numMenus, String... textos) {
        // Configuración básica de la ventana
        setTitle("Ventana con menús");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear barra de menús
        barraMenus = new JMenuBar();

        // Si no coinciden cantidades, tomamos el mínimo
        int total = Math.min(numMenus, textos.length);

        for (int i = 0; i < total; i++) {
            JMenu menu = new JMenu(textos[i]);
            barraMenus.add(menu);
        }

        setJMenuBar(barraMenus);
    }

}

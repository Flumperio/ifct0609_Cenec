package Interface_Grafica.U2_E2;

import javax.swing.*;

public class Ejercicio_2 {
    public static void main (){
        new VentanaSimple2("Segunda Ventana", 400, 300);
    }

    static class VentanaSimple2 extends JFrame{
        public VentanaSimple2(String nombre, int alto, int ancho){
            super(nombre);
            setSize(ancho, alto);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }
    }
}

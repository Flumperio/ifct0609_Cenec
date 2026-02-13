package JOptionPane;

import javax.swing.JOptionPane;

public class HelloWord {
    public static void main (String[] args){
        //Variables
        String nombre;
        String apellidos;
        JOptionPane.showMessageDialog(null,"Hello Word");
        nombre = JOptionPane.showInputDialog("Indica el nombre: ");
        apellidos = JOptionPane.showInputDialog("Indica el apellido: ");
        JOptionPane.showMessageDialog(null, "Tu nombre es: " + nombre + " " + apellidos);
    }
}

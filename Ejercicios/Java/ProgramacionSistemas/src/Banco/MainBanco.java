package Banco;

import javax.swing.*;
import java.util.Random;

public class MainBanco {
    public static void main (String[] args){
        int op_menu, op_menu_alta;
        String [] arrMenu = {"Salir", "Consultar", "Alta"};
        String [] arrAlta = {"Cliente", "Cuenta"};
        // 0.- Banco, 1.- Cuenta Bancaria, 2.- Saldo Inicial, 3.- Nombre, 4.- DNI, 5.- TLF, 6.- NCuenta
        String [] arrDatos = new String[7];

        while (true){
            op_menu = JOptionPane.showOptionDialog(null, "Selecciona una opción: ", "Banco", 0, 3, null, arrMenu, null);
            if(op_menu == 0){
                JOptionPane.showMessageDialog(null, "Hasta luego Piruleta...");
                break;
            } else if (op_menu == 2) {
                op_menu_alta = JOptionPane.showOptionDialog(null, "Selecciona una opción: ", "Banco", 0, 3, null, arrAlta, null);
                switch (op_menu_alta){
                    case (1):
                        arrDatos[0] = JOptionPane.showInputDialog(null, "Introduce Banco: ");
                        arrDatos[1] = JOptionPane.showInputDialog(null, "Introduce numero de cuenta: ");
                        arrDatos[2] = JOptionPane.showInputDialog(null, "Introduce saldo inicial: ");

                        break;
                    case (0):
                        arrDatos[3] = JOptionPane.showInputDialog(null, "Introduce Nombre: ");
                        arrDatos[4] = JOptionPane.showInputDialog(null, "Introduce DNI: ");
                        arrDatos[5] = JOptionPane.showInputDialog(null, "Introduce Telefono: ");
                        arrDatos[6] = JOptionPane.showInputDialog(null, "Introduce Numero Cuenta: ");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error", "Banco", 1);
                }

            } else if (op_menu == 1) {
                CuentaBancaria cuenB1 = new CuentaBancaria(arrDatos[0],Integer.parseInt(arrDatos[1]),Double.parseDouble(arrDatos[2]));
                Clientes cli1 = new Clientes(arrDatos[3], arrDatos[4], arrDatos[5], cuenB1);
                String menu = "Nomre: " + cli1.getNombre() + "\nDNI: " + cli1.getDni() + "\nTelefono: " + cli1.getTelefono() +
                        "\nNumero Cuenta:" + cuenB1.getN_cuenta();
                JOptionPane.showMessageDialog(null, menu, "Banco", 0);
            }
        }
    }
}

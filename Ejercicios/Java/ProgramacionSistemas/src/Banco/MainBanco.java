package Banco;

import javax.swing.*;
import java.util.ArrayList;

public class MainBanco {
    public static void main (String[] args){
        int op_menu, op_menu_alta;
        ArrayList<CuentaBancaria> cuentas = new ArrayList();
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
                cuentas.add(new CuentaBancaria(arrDatos[0],Integer.parseInt(arrDatos[1]),Double.parseDouble(arrDatos[2])));
                CuentaBancaria buscar = new CuentaBancaria(null, 0, 0);
                buscar.setN_cuenta(Integer.parseInt(arrDatos[2]));
                Clientes cli1 = new Clientes(arrDatos[3], arrDatos[4], arrDatos[5], cuentas.get(cuentas.indexOf(cuentas.contains(buscar))));
                String menu = "Nombre: " + cli1.getNombre() + "\n\nDNI: " + cli1.getDni() + "\n\nTelefono: " + cli1.getTelefono() +
                        "\n\nNumero Cuenta:" + cli1.getCuenta();
                JOptionPane.showMessageDialog(null, menu, "Banco", 0);
            }
        }
    }

}

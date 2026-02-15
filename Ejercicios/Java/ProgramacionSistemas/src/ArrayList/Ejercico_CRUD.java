package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercico_CRUD {
    public static void main(String[] args) {
        //Variables
        String mod_cliente, new_cliente;
        ArrayList<String> clientes = new ArrayList<>();
        String[] opciones = {"Añadir", "Eliminar", "Modificar", "Buscar", "Listado", "Salir"};

        Scanner teclado = new Scanner(System.in);
        int retMenu;

        do {
            retMenu = menu(opciones, teclado);
            switch (retMenu) {
                case 1:
                    mod_cliente = load_cliente("a añadir", teclado);
                    aniadirCli(clientes, mod_cliente);
                    break;
                case 2:
                    mod_cliente = load_cliente("a eliminar", teclado);
                    borrarCli(clientes, mod_cliente);
                    break;
                case 3:
                    mod_cliente = load_cliente("modificar", teclado);
                    new_cliente = load_cliente("nuevo", teclado);
                    modificarCli(clientes, mod_cliente, new_cliente);
                    break;
                case 4:
                    mod_cliente = load_cliente("buscar",teclado);
                    buscarCli(clientes, mod_cliente);
                    break;
                case 5:
                    listarCli(clientes);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (retMenu != 6);
        teclado.close();
    }
    //Métodos
    static void impMenu (String [] menu){
        int max_menu = 0;
        int opcion;
        // Calcular ancho
        for (String elemento : menu) {
            if (elemento.length() > max_menu)
                max_menu = elemento.length();
        }
        max_menu += 10;
        // Dibujar línea superior
        imprimirLinea(max_menu);
        // Dibujar opciones
        for (int i = 0; i < menu.length; i++) {
            System.out.print("* " + (i + 1) + ".- " + menu[i] + " ");
            for (int j = 0; j < (max_menu - menu[i].length() - 7); j++)
                System.out.print(" ");
            System.out.println("*");
        }
        // Dibujar línea inferior
        imprimirLinea(max_menu);

    }
    static int menu(String[] menu, Scanner teclado) {
        int opcion;
        impMenu(menu);
        do {
            System.out.print("Seleccione opción: ");
            while (!teclado.hasNextInt()) {
                System.out.println("Debe introducir un número.");
                teclado.next();
            }
            opcion = teclado.nextInt();
            if (opcion < 1 || opcion > menu.length)
                System.out.println("Opción inválida. Intente de nuevo.");
        } while (opcion < 1 || opcion > menu.length);
        teclado.nextLine();
        return opcion;
    }
    static String load_cliente (String menu, Scanner teclado){
        System.out.println("Dame el nombre del cliente " + menu + ":");
        return teclado.nextLine();

    }
    static void imprimirLinea(int longitud) {
        for (int i = 0; i <= longitud; i++)
            System.out.print("*");
        System.out.println();
    }
    static int buscarCli (ArrayList<String> clientes, String mod_cliente){
        if (clientes.contains(mod_cliente)){
            String [] menucli = {mod_cliente + " esta en la posicion: " + (clientes.indexOf(mod_cliente)+1)};
            impMenu(menucli);
            return clientes.indexOf(mod_cliente);
        } else {
            System.out.println("No hay clientes con ese nombre.");
            return -1;
        }
    }
    static void aniadirCli (ArrayList<String> clientes, String mod_cliente){
        clientes.add(mod_cliente);
    }
    static void listarCli (ArrayList<String> clientes){
        impMenu(clientes.toArray(new String[clientes.size()]));
    }
    static void borrarCli (ArrayList<String> clientes, String mod_cliente){
        if (buscarCli(clientes,mod_cliente) >= 0){
            clientes.remove(mod_cliente);
            System.out.println("Cliente " + mod_cliente + " eliminado.");
        }
    }
    static void modificarCli (ArrayList<String> clientes, String mod_cliente, String new_cliente){
        int index_Cli = buscarCli(clientes,mod_cliente);
        if (index_Cli >= 0){
            clientes.set(index_Cli, new_cliente);
            System.out.println("Cliente " + mod_cliente + " modificado por: " + new_cliente);
        }
    }
}

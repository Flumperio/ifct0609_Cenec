package DDBB_PreStatement;

import java.sql.*;
import java.util.Scanner;

public class Ejercicio_Final {
    public static void main(String[] args) {
        //Variables
        String mod_curso, new_curso;
        ArrayList<String> cursos = new ArrayList<>();
        String[] opciones = {"Añadir", "Eliminar", "Modificar", "Buscar", "Listado", "Salir"};

        Scanner teclado = new Scanner(System.in);
        int retMenu;

        do {
            retMenu = menu(opciones, teclado);
            switch (retMenu) {
                case 1:
                    mod_curso = load_curso("a añadir", teclado);
                    aniadirCurso(cursos, mod_curso);
                    break;
                case 2:
                    mod_curso = load_curso("a eliminar", teclado);
                    borrarCli(cursos, mod_curso);
                    break;
                case 3:
                    mod_curso = load_curso("modificar", teclado);
                    new_curso = load_curso("nuevo", teclado);
                    modificarCli(cursos, mod_curso, new_curso);
                    break;
                case 4:
                    mod_curso = load_curso("buscar",teclado);
                    buscarCli(cursos, mod_curso);
                    break;
                case 5:
                    listarCli(cursos);
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
    static String load_curso(String menu, Scanner teclado){
        System.out.println("Dame el nombre del curso " + menu + ":");
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
    static void aniadirCurso(ArrayList<String> clientes, String mod_cliente){
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

public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int filas_insert = 0, id = 0;
        String nombre, profesor, horas;
        Connection conn = null;
        PreparedStatement prep_stat = null;
        Statement cnt_filas = null; // Consultas simples
        ResultSet result = null;
        String sql_Insert = "INSERT INTO cursos (id, nombre, profesor, horas) VALUES (?, ?, ? ,?)";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/academia", "dev", "password");

            if (conn != null){
                System.out.println("✅ Conexión Servidor OK.");
            }
            //Contar las filas introducidas.
            cnt_filas = conn.createStatement();
            result = cnt_filas.executeQuery("SELECT COUNT(*) as total FROM cursos");
            if (result.next()){ id = result.getInt("total");}
            //Introducir Datos
            prep_stat = conn.prepareStatement(sql_Insert);
            prep_stat.setInt(1, id + 1);
            System.out.println("Introduce el nombre de curso: ");
            prep_stat.setString(2, teclado.nextLine());
            System.out.println("Introduce el nombre del profesor: ");
            prep_stat.setString(3, teclado.nextLine());
            System.out.println("Introduce el número de horas: ");
            prep_stat.setString(4, teclado.nextLine());
            //Actualizamos cambios y ejecutamos.
            prep_stat.executeUpdate();
            //Cerramos Conexiones
            prep_stat.close();
            cnt_filas.close();
            prep_stat.close();;
            conn.close();
        }
        catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

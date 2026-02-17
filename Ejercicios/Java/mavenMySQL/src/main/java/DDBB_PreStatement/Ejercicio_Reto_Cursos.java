package DDBB_PreStatement;

import java.sql.*;
import java.util.Scanner;

public class Ejercicio_Reto_Cursos {
    public static void main(String[] args) {
        //Variables
        String mod_curso, new_curso;

        String[] opciones = {"Añadir", "Eliminar", "Modificar", "Buscar", "Listado", "Salir"};

        Connection conn = null;

        Scanner teclado = new Scanner(System.in);
        int retMenu;

        Cursos sql_curso = new Cursos();
        conn = sql_curso.conn_DDBB(conn);

        try {
            do {
                retMenu = menu(opciones, teclado);
                switch (retMenu) {
                    case 1:
                        sql_curso.aniadir_Curso(conn, teclado);
                        break;
                    case 2:
                        sql_curso.eliminar_Curso(conn, teclado);
                        break;
                    case 3:
                        sql_curso.modificar_Curso(conn, teclado);
                        break;
                    case 4:
                        sql_curso.buscar_Curso(conn, teclado);
                        break;
                    case 5:
                        sql_curso.listar_DDBB(conn);
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                }
            } while (retMenu != 6);
            teclado.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error " + e);
        }
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
}


package Refactorizacion;

import java.util.Scanner;

public class Ejercicio_1 {

    public class UsuarioNombre {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce tu nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Introduce tu usuario: ");
            String usuario = sc.nextLine();
            sc.close();
            System.out.println("Nombre: " + nombre);
            System.out.println("Usuario: " + usuario);
        }
    }
}

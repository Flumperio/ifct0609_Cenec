package Refactorizacion;

import java.util.Scanner;

public class Ejercicio_1_Refact {

    public class UsuarioNombre {
        public static void main(String[] args) {
            String nombre, usuario;
            Scanner sc = new Scanner(System.in);
            nombre = entrada_Teclado(sc, "Nombre");
            usuario = entrada_Teclado(sc, "Usuario");
            sc.close();
            impresion_Datos(nombre, "Nombre: ");
            impresion_Datos(usuario, "Usuario: ");
        }
    }
    private static String entrada_Teclado (Scanner sc, String nombre_V){
        System.out.println("Introduce tu " + nombre_V + " :");
        return sc.nextLine();
    }
    private static void impresion_Datos(String dato, String nombre_V){
        System.out.println(nombre_V + " : " + dato );
    }
}

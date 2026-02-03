package Condicionales;

//Importación de librerias
import java.util.Scanner;

public class Ejercicio_2_MayorEdad {
    public static void main (String[] args) {
        //Definimos variables
        Scanner teclado = new Scanner(System.in);
        int edad;
        //Introducción datos
        System.out.println("Introduce tu edad: ");
        edad = teclado.nextInt();
        //Main - Impresion
        if (edad < 18){
            System.out.println("Eres menor de edad.");
        } else {
            System.out.println("Eres mayor de edad.");
        }
        teclado.close();
    }
}

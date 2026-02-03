package Condicionales;

//Importamos Librerias
import java.util.Scanner;

public class Ejercicio_6_Notas {
    public static void main (String[] args){
        //Definimos variables
        Scanner teclado = new Scanner(System.in);
        double nota;
        //Introducción datos
        System.out.println("Introduce la nota: ");
        nota = teclado.nextDouble();
        //Main/Impresion
        if (nota < 0 || nota > 10){
            System.out.println("Error de valor.");
        }else {
            if (nota < 5) {
                System.out.println("Has suspendido con un: " + nota);
            } else if (nota < 6) {
                System.out.println("Has aprobado con un: " + nota);
            } else if (nota < 7) {
                System.out.println("Tienes un bien con: " + nota);
            } else if (nota < 9) {
                System.out.println("Tienes un notable con: " + nota);
            } else if (nota < 10) {
                System.out.println("Tienes un sobresaliente con: " + nota);
            } else {
                System.out.println("La nota no puede ser " + nota);
            }
        }
    }
}

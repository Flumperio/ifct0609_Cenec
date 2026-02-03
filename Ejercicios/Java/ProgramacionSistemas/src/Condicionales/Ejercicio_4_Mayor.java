package Condicionales;

//Importación de librerias
import java.util.Scanner;

public class Ejercicio_4_Mayor {
    public static void main (String[] args) {
        //Definimos variables
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2;
        //Introducción datos
        System.out.println("Introduce el primer número: ");
        numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        numero2 = teclado.nextInt();
        //Main - Impresion
        if (numero1 == numero2){
            System.out.println("Los números son iguales");
        } else if ( numero1 > numero2){
            System.out.println("El número " + numero1 + " es el mayor de los dos.");
        } else {
            System.out.println("El número " + numero2 + " es el mayor de los dos.");
        }
        teclado.close();
    }
}

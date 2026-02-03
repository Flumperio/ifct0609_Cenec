package Condicionales;

//Importación de librerias
import java.util.Scanner;

public class Ejercicio_5_Mayor3 {
    public static void main (String[] args) {
        //Definimos variables
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, numero3;
        //Introducción datos
        System.out.println("Introduce el primer número: ");
        numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        numero2 = teclado.nextInt();
        System.out.println("Introduce el tercer número: ");
        numero3 = teclado.nextInt();
        //Main - Impresion
        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("El número mayor es: " + numero1);
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.println("El número mayor es: " + numero2);
        } else {
            System.out.println("El número mayor es: " + numero3);
        }
        teclado.close();
    }
}

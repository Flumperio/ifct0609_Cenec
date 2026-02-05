package Bucles;

//Import Clases
import java.util.Scanner;

public class Ejercicio_10_Bucles {
    public static void main (String[] args){
        //Definición variables
        int entrada_numero;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        //Main
        do {
            System.out.println("Introduce una nota(0 - 10): ");
            entrada_numero = teclado.nextInt();
        } while (entrada_numero < 0 || entrada_numero > 10);
        //Impresion
        System.out.println("La nota es: " + entrada_numero);
        //Cerramos clases abiertas
        teclado.close();
    }
}

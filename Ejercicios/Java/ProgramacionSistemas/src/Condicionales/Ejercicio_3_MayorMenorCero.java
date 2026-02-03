package Condicionales;

//Importación de librerias
import java.util.Scanner;

public class Ejercicio_3_MayorMenorCero {
    public static void main (String[] args) {
        //Definimos variables
        Scanner teclado = new Scanner(System.in);
        int numero;
        //Introducción datos
        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();
        //Main - Impresion
        if (numero < 0){
            System.out.println("El número es negativo.");
        } else if (numero > 0){
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es cero.");
        }
        teclado.close();
    }
}

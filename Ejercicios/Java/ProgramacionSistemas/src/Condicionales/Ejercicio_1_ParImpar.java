package Condicionales;

//Importación de librerias
import java.util.Scanner;

public class Ejercicio_1_ParImpar {
    public static void main (String[] args) {
        //Definimos variables
        Scanner teclado = new Scanner(System.in);
        int numero;
        //Introducción datos
        System.out.println("Introduce el importe: ");
        numero = teclado.nextInt();
        //Main - Impresion
        if (numero % 2 == 0){
            System.out.println("Es número es Par.");
        } else {
            System.out.println("El número es Impar.");
        }
        teclado.close();
    }
}

package Primeros_Pasos;

import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args){
        //Definicion de variables
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2;
        int suma, resta, multiplicacion;
        double division;
        //Introdución de datos
        System.out.println("Introduce el primer valor: ");
        numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo valor: ");
        numero2 = teclado.nextInt();
        //logica
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        if (numero2 == 0) {
            division = 0;
        }else{
            division = numero1 / numero2;
        }
        //Impresión de resultados.
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resta);
        System.out.println("La multiplicacion de " + numero1 + " y " + numero2 + " es: " + multiplicacion);
        System.out.println("La division de " + numero1 + " y " + numero2 + " es: " + division);
        teclado.close();

    }
}

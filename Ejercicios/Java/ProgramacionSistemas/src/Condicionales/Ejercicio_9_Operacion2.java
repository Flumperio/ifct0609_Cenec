package Condicionales;

//Importamos Librerias
import java.util.Scanner;

public class Ejercicio_9_Operacion2 {
    public static void main (String[] args) {
        //Definimos variables
        Scanner teclado = new Scanner(System.in);
        double numero1, numero2, resultado = 0.0;
        String operacion;
        //Introducción datos
        System.out.println("Introduce el primer número: ");
        numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        numero2 = teclado.nextInt();
        System.out.println("Introduce el operador: ");
        operacion = teclado.next();
        //Main
        switch (operacion){
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                if (numero2 == 0) {
                    System.out.println("El segundo operador es un cero. Error de Divisón por cero. ");
                } else {
                    resultado = numero1 / numero2;
                    break;
                }
            }
            if (numero2 != 0)
                System.out.println("" + numero1 + " " + operacion + "" + numero2 + " = " + resultado);
        teclado.close();

        }
    }


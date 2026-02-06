package Bucles;

//Import Clases
import java.util.Scanner;

public class Ejercicio_19_Bucles {
    public static void main (String[] args){
        //Definición variables
        int entrada_numero;
        int cnt = 1, contador_mult = 0;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        System.out.println("Introduce un numero para ver los múltiplos de 3 que contiene: ");
        entrada_numero = teclado.nextInt();
        //Main
        while (cnt <= entrada_numero){
            if (cnt % 3 == 0){
                contador_mult += 1;
            }
            cnt ++;
        }
        //Impresion
        System.out.println("Hay " + contador_mult + " multiplos de 3 hasta el número: " + entrada_numero);
        //Cerramos clases abiertas
        teclado.close();
    }
}


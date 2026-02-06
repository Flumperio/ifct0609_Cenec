package Bucles;

//Import Clases
import java.util.Scanner;

public class Ejercicio_20_Bucles {
    public static void main (String[] args){
        //Definición variables
        int entrada_numero;
        int cnt = 1, sum_pares = 0, sum_impares = 0;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        System.out.println("Introduce un número: ");
        entrada_numero = teclado.nextInt();
        //Main
        while (cnt <= entrada_numero){
            if (cnt % 2 == 0){
                sum_pares += cnt;
            } else {
                sum_impares += cnt;
            }
            cnt ++;
        }
        //Impresion
        System.out.println("La suma de los números pares es: " + sum_pares);
        System.out.println("La suma de los números impares es: " + sum_impares);
        //Cerramos clases abiertas
        teclado.close();
    }
}


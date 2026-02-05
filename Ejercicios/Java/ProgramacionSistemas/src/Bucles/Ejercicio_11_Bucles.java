package Bucles;

//Import Clases

import java.util.Scanner;

public class Ejercicio_11_Bucles {
    public static void main (String[] args){
        //Definición variables
        int n_valores, valor_entrada;
        int n_max = 0, n_min = 0;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        System.out.println("Introduce el número de valores: ");
        n_valores = teclado.nextInt();
        //Main
        for (int cnt = 1; cnt <= n_valores; cnt ++){
            System.out.println("Introduce el valor " + cnt);
            valor_entrada = teclado.nextInt();
            if (valor_entrada > n_max) {
                n_max = valor_entrada;
                n_min = n_max;
            }
            if (valor_entrada < n_min)
                n_min = valor_entrada;
        }
        //Impresion
        System.out.println("El valor máximo de los " + n_valores + " introducidos es: " + n_max);
        System.out.println("El valor mínimo de los " + n_valores + " introducidos es: " + n_min);
        //Cerramos clases abiertas
        teclado.close();
    }
}


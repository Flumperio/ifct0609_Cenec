package Metodos;

import java.util.Scanner;

public class NumeroPrimoFuncion {
    public static void main(String[] args) {
        //Definición variables
        int entrada_numero;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        System.out.println("Introduzca un número positivo. ");
        entrada_numero = teclado.nextInt();
        //Main
        if (esPrimo(entrada_numero) == true) {
            System.out.println("El número " + entrada_numero + " es primo.");
        } else {
            System.out.println("El número " + entrada_numero + " no es primo.");
        }
        //Impresion
        //Cerramos clases abiertas
        teclado.close();
    }

    //Metodo o funcion
    public static boolean esPrimo(int numero) {
        boolean primo = true;
        for (int cnt = 2; cnt < numero; cnt++) {
            if ((numero % cnt) == 0) {
                primo = false;
            }
        }
        return primo;
    }
}

package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main (String[] args){
        //Definición variables
        ArrayList <Integer> numeros = new ArrayList<>();
        String entrada_teclado;
        int numeroEntradas, sumatorio = 0;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        System.out.println("Introduce el número de campos: ");
        numeroEntradas = teclado.nextInt();
        for (int cnt = 0; cnt < numeroEntradas; cnt ++){
            System.out.println("Introduce el valor (Entero)" + (cnt + 1) + ": ");
            numeros.add(Integer.parseInt(teclado.next()));
        }
        //Main

        //Impresion
        System.out.println("La lista es: \n" + numeros);
        for (Integer cnt : numeros){
            sumatorio += cnt;
        }
        System.out.println("La suma de todos es: \n" + sumatorio);
        //Cerramos clases abiertas
        teclado.close();
    }
}

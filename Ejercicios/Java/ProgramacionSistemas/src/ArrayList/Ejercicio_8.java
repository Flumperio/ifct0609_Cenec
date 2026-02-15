package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio_8 {
    public static void main (String[] args){
        //Definición variables
        ArrayList <Double> numeros = new ArrayList<>();
        double entrada_teclado = 0.0, sumatorio = 0.0;
        int numeroEntradas;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        System.out.println("Introduce el número de campos: ");
        numeroEntradas = teclado.nextInt();
        for (int cnt = 0; cnt < numeroEntradas; cnt ++){
            System.out.println("Introduce la nota: " + (cnt + 1) + ": ");
            entrada_teclado = teclado.nextDouble();
            numeros.add(entrada_teclado);
        }
        //Main
        for (var cnt : numeros){
            sumatorio += cnt;
        }
        //Impresion
        System.out.println("La nota media es: " + sumatorio/numeros.size());
        System.out.println("La nota máxima es: " + Collections.max(numeros));
        System.out.println("La nota mínima es: " + Collections.min(numeros));
        //Cerramos clases abiertas
        teclado.close();
    }
}

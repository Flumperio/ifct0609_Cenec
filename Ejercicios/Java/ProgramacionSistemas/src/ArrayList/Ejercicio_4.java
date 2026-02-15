package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main (String[] args){
        //Definición variables
        ArrayList nombres = new ArrayList<String>();
        String entrada_teclado, buscar;
        int numeroEntradas;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        System.out.println("Introduce el número de campos: ");
        numeroEntradas = teclado.nextInt();
        for (int cnt = 0; cnt < numeroEntradas; cnt ++){
            System.out.println("Introduce el valor " + (cnt + 1) + ": ");
            nombres.add(teclado.next());
        }
        //Main

        //Impresion
        System.out.println("La lista es: \n" + nombres);
        System.out.println("Introduce el valor a buscar: ");
        buscar =  teclado.next();
        if (nombres.contains(buscar)){
            System.out.println("El elemento" + buscar + " existe en la posición: " + nombres.indexOf(buscar));
        } else {
            System.out.println("El nombre no exite.");
        }
        //Cerramos clases abiertas
        teclado.close();
    }
}

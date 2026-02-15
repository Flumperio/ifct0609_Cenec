package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main (String[] args){
        //Definición variables
        ArrayList<Integer> num_desdor = new ArrayList<>();
        ArrayList<Integer> num_ord = new ArrayList<>();
        int numeroEntradas;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        System.out.println("Introduce el número de campos: ");
        numeroEntradas = teclado.nextInt();
        for (int cnt = 0; cnt < numeroEntradas; cnt ++){
            System.out.println("Introduce el valor " + (cnt + 1) + ": ");
            num_desdor.add(teclado.nextInt());
        }
        //Main

        //Impresion
        System.out.println("La lista es: \n" + num_desdor);
        Collections.sort(num_desdor);
        System.out.println("La lista ordenada es: \n" + num_desdor);
        //Cerramos clases abiertas
        teclado.close();
    }
}

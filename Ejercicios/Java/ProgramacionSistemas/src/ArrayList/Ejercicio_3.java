package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main (String[] args){
        //Definición variables
        ArrayList<String> nombres = new ArrayList<String>();
        String borrar;
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
        System.out.println("Introduce el valor a eliminar: ");
        borrar =  teclado.next();
        if (nombres.contains(borrar)){
            nombres.remove(borrar);
            System.out.println("La lista actualizada es: \n" + nombres);
        } else {
            System.out.println("El nombre no exite.");
        }
        //Cerramos clases abiertas
        teclado.close();
    }
}

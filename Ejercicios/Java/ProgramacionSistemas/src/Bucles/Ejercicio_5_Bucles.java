package Bucles;

//Import Clases
import java.util.Scanner;

public class Ejercicio_5_Bucles {
    public static void main (String[] args){
        //Definición variables
        Scanner teclado = new Scanner(System.in);
        int positivos = 0, negativo = 0, ceros = 0;
        int numero_iter = 0, numero_input = 0;
        //Entrada Datos
        System.out.println("Cuantos números quieres revisar ??");
        numero_iter = teclado.nextInt();
        for (int cnt = 0; cnt < numero_iter; cnt ++){
            System.out.println("Introduce el valor "+(cnt + 1)+":");
            numero_input= teclado.nextInt();
            if (numero_input < 0) {
                negativo += 1;
            } else if (numero_input > 0) {
                positivos += 1;
            } else {
                ceros += 1;
            }
        }
        //Impresion
        System.out.println("**** RESULTADO ****");
        System.out.println("Total de números positívos: " + positivos);
        System.out.println("Total de números negativos: " + negativo);
        System.out.println("Total de números cero: " + ceros);
        teclado.close();
    }
}

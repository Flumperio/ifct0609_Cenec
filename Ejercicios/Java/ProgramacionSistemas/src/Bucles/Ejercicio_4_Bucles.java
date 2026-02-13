package Bucles;

//Import Clases
import java.util.Scanner;

public class Ejercicio_4_Bucles {
    public static void main (String[] args){
        //Definición variables
        double resultado = 0.0;
        double sumatorio = 0.0;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        for (int cnt = 0; cnt < 5; cnt ++){
            System.out.println("Introduce el valor "+(cnt + 1)+":");
            sumatorio += teclado.nextInt();
        }
        resultado = sumatorio / 5.0;
        //Impresion
        System.out.println("**** RESULTADO ****");
        System.out.println("El promedio es: " + resultado);
        teclado.close();
    }
}

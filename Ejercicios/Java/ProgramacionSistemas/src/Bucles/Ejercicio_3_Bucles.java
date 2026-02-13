package Bucles;

//Import Clases
import java.util.Scanner;

public class Ejercicio_3_Bucles {
    public static void main (String[] args){
        //Definición variables
        int resultado = 0, numeroMax = 0, cnt = 0;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        System.out.println("Introduce el número maximo a sumar: ");
        numeroMax = teclado.nextInt();
        //Main
        while (cnt <= numeroMax){
            resultado += cnt;
            cnt++;
        }
        //Impresion
        System.out.println("**** RESULTADO ****");
        System.out.println("Suma es: " + resultado);
        teclado.close();
    }
}

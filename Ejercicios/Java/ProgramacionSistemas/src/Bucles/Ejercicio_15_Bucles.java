package Bucles;

//Import Clases
import java.util.Scanner;

public class Ejercicio_15_Bucles {
    public static void main (String[] args){
        //Definición variables
        int entrada_numero;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        System.out.println("Introduce la altura del triangulo: ");
        entrada_numero = teclado.nextInt();
        //Main
        for (int cnt = 0; cnt <= entrada_numero; cnt ++){
            for (int cnt2 = 0; cnt2 < cnt; cnt2 ++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //Impresion
        //Cerramos clases abiertas
        teclado.close();
    }
}


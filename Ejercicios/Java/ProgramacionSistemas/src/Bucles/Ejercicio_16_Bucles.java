package Bucles;

//Import Clases
import java.util.Scanner;

public class Ejercicio_16_Bucles {
    public static void main(String[] args) {
        //Definición variables
        int entrada_numero;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        System.out.println("Introduce la altura del triangulo: ");
        entrada_numero = teclado.nextInt();
        //Main
        int espacios = 0, asteriscos = 0;
        for (int fila = 1; fila <= entrada_numero; fila++) {
            while (espacios < entrada_numero - fila) {
                System.out.print(" ");
                espacios++;
            }
            while (asteriscos < (fila * 2) - 1) {
                System.out.print("*");
                asteriscos++;
            }
            asteriscos = 0;
            espacios = 0;
            System.out.println("");
        }
        teclado.close();
    }
}

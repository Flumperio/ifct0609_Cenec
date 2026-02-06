package Bucles;

//Import Clases
import java.util.Scanner;

public class Ejercicio_18_Bucles {
    public static void main(String[] args) {
        //Definición variables
        int entrada_menu, intentos;
        int numero_secreto = 7;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        do {
            System.out.println("Adivina el número secreto: ");
            entrada_menu = teclado.nextInt();
            if (entrada_menu < numero_secreto){
                System.out.println("Estas por debajo del número secreto.");
            } else if (entrada_menu > numero_secreto) {
                System.out.println("Estas por encima del número secreto.");
            } else {
                System.out.println("Acertaste!!!!!");
            }
        } while (entrada_menu != numero_secreto);
        //Main
        //Imprimir datos
        //Cerrado de objetos
        teclado.close();
    }
}

package Bucles;

//Import Clases
import java.util.Scanner;
import java.time.LocalTime;

public class Ejercicio_17_Bucles {
    public static void main(String[] args) {
        //Definición variables
        int entrada_menu;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        do {
            System.out.println(" *** Menú *** ");
            System.out.println(" *** 1.- Saludar ");
            System.out.println(" *** 2.- Hora ");
            System.out.println(" *** 0.- Salir ");
            entrada_menu = teclado.nextInt();
            switch (entrada_menu){
                case (1) -> System.out.println("Hola Gominola.\n");
                case (2) -> System.out.println(LocalTime.now().getHour()+":"+LocalTime.now().getMinute()+"\n");
            }
        } while (entrada_menu != 0);
        //Main
        //Imprimir datos
        //Cerrado de objetos
        teclado.close();
    }
}

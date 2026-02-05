package Bucles;

//Import Clases
import java.util.Scanner;

public class Ejercicio_6_Bucles {
    public static void main (String[] args){
        //Definición variables
        int multiplicador;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        System.out.println("Introduce el multiplicador: ");
        multiplicador = teclado.nextInt();
        //Main
        System.out.println("Tabla de multiplicar con for");
        for (int cnt=0; cnt<=10; cnt++ ){
            System.out.println((""+cnt+" * "+multiplicador+" = "+cnt*multiplicador));
        }
    }
}


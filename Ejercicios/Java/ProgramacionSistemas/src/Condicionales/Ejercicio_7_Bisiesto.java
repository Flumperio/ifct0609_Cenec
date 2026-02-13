package Condicionales;

//Importamos Librerias
import java.util.Scanner;

public class Ejercicio_7_Bisiesto {
    public static void main (String[] args){
        //Definimos variables
        Scanner teclado = new Scanner(System.in);
        double anio;
        int bisiesto = 0;
        //Introducción datos
        System.out.println("Introduce el año: ");
        anio = teclado.nextDouble();
        //Main/Impresion
        if (anio % 400 == 0 || ((anio % 4 == 0) && (anio % 100 != 0)))
            bisiesto = 1;
        if(bisiesto == 1){
            System.out.println("El año " + anio + " es Bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es Bisiesto.");
        }
        teclado.close();
    }
}

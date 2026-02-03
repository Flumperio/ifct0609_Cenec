package Condicionales;

//Importamos Librerias
import java.util.Scanner;

public class Ejercicio_8_DiasMes {
    public static void main (String[] args) {
        //Definimos variables
        Scanner teclado = new Scanner(System.in);
        int anio = 0, mes = 0, bisiesto = 0;
        int dias = 28;
        //Introducción datos
        System.out.println("Introduce el mes: ");
        mes = teclado.nextInt();
        System.out.println("Introduce el año: ");
        anio = teclado.nextInt();
        //Main/Impresion
        if (anio % 400 == 0 || ((anio % 4 == 0) && (anio % 100 != 0)))
            bisiesto = 1;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dias = 31;
        } else if (mes == 2) {
            if (bisiesto == 1) {
                dias = 29;
            } else {
                dias = 28;
            }
        } else {
            dias = 30;
        }
        System.out.println("El mes " + mes + " de " + anio + " tiene " + dias);
    }
}

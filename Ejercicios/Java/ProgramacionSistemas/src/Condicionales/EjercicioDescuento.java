package Condicionales;

//Importación de librerias
import java.util.Scanner;


public class EjercicioDescuento {
    public static void main (String[] args){
        //Definimos variables
        Scanner teclado = new Scanner(System.in);
        int importe, descuento = 0;
        double precio_final;
        System.out.println("Introduce el importe: ");
        importe = teclado.nextInt();
        //Main
        if (importe <= 0){
            System.out.println("El importe es menor o igual a cero.");
        } else {
            if ((importe >= 100) && (importe < 1000)) {
                descuento = 10;
            } else if (importe >= 1000) {
                descuento = 20;
            }
        }
        if (descuento == 0){
            System.out.println("Por ese importe no tienes descuento.");
        } else {
            System.out.println("Por un importe de: " + importe + "€, tienes un descuento del " + descuento + "%");
        }
    }
}

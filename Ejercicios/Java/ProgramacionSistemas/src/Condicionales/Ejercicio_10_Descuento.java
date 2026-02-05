package Condicionales;

//Importamos Librerias
import java.util.Scanner;

public class Ejercicio_10_Descuento {
    public static void main (String[] args) {
        //Definimos variables
        Scanner teclado = new Scanner(System.in);
        double importe, resultado = 0.0;
        double descuento = 0.0;
        String entrada_cliente, tipo_cliente = "Normal";
        //Introducción datos
        System.out.println("Introduce el importe: ");
        importe = teclado.nextInt();
        System.out.println("Introduce el tipo de cliente (N:Normal, P:Premium, E:Empresa: )");
        entrada_cliente = teclado.next().toUpperCase();
        //Main
        switch  (entrada_cliente){
            case "P":
                descuento = 10;
                tipo_cliente = "Premium";
                break;
            case "E":
                descuento = 15;
                tipo_cliente = "Empresa";
                break;
        }
        System.out.println("El importe de: " + importe + " tiene un descuento del: " + descuento + " por ser un cliente " + tipo_cliente);
        System.out.println("El total a pagar es de: " + (importe-(importe*(descuento/100))));
        teclado.close();

        }
    }


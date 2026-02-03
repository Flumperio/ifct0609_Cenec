package Condicionales;

import java.util.Scanner;

public class EjercicioEdades {
    public static void main (String[] args){
        //Definimos variables
        Scanner teclado = new Scanner(System.in);
        int edad;
        //Introducción datos
        System.out.println("Introduce tu edad: ");
        edad = teclado.nextInt();
        //Main/Impresion
        if (edad < 10) {
            System.out.println("Con " + edad + " eres un chavalin de pantalon corto.");
        } else if (edad < 15){
            System.out.println("Otro preadolescente con: " + edad);
        } else if (edad < 18) {
            System.out.println("Adolescente puro y duro con:" + edad);
        } else if (edad < 67) {
            System.out.println("Eres un amargado trabajador, pagador de impuestos abusivos con: " + edad);
        } else {
            System.out.println("A ver obras campeón de petanca. Has llegado a tener: " + edad);
        }
    }
}


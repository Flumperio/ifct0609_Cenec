package Metodos;

import java.util.Scanner;

public class Main_Notas {
    public static void main (String[] args){
        //Definición variables
        int entrada_numero;
        String literal_nota;
        Scanner teclado = new Scanner(System.in);
        Notas calculo_Nota = new Notas();
        //Entrada Datos
        System.out.println("Introduce la nota: ");
        entrada_numero = teclado.nextInt();
        //Main
        literal_nota = calculo_Nota.calculo_nota(entrada_numero);
        //Impresion
        System.out.println("Con un " + entrada_numero + " tiene un: "+ literal_nota);
        //Cerramos clases abiertas
        teclado.close();
    }
}

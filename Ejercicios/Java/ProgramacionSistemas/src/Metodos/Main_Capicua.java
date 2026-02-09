package Metodos;

import java.util.Scanner;

public class Main_Capicua {
    public static void main(String[] args) {
        //Definición variables
        int entrada_numero;
        Scanner teclado = new Scanner(System.in);
        Capicua esCapicua = new Capicua();
        //Entrada Datos
        System.out.println("Introduce un número: ");
        entrada_numero = teclado.nextInt();
        //Main
        if (esCapicua.calc_capicua(entrada_numero))
            System.out.println("Es Capicua");
        else
            System.out.println("No es Capicua");
        //Impresion
        //Cerramos clases abiertas
        teclado.close();
    }
}

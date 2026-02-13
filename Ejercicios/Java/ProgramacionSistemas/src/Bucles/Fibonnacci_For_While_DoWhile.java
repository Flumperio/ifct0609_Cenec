package Bucles;

//Import Clases
import java.util.Scanner;

public class Fibonnacci_For_While_DoWhile {
    public static void main (String[] args){
        //Definición variables
        int numero;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        System.out.println("Introduce el numero para calcular la serie Fibonnacci: ");
        numero = teclado.nextInt();
        //Main
        int numero1 = 0;
        int numero2 = 1;
        int fibonacci = 0;
        System.out.println("***** Impresion con for *****");
        for (int cnt = 0; cnt <= numero; cnt++) {
            System.out.println(cnt + ": " + numero1);
            fibonacci = numero1 + numero2;
            numero1 = numero2;
            numero2 = fibonacci;
        }
        System.out.println("***** Impresion con while *****");
        int cnt = 0;
        numero1 = 0;
        numero2 = 1;
        fibonacci = 0;
        while (cnt <= numero){
            System.out.println(cnt + ": " + numero1);
            fibonacci = numero1 + numero2;
            numero1 = numero2;
            numero2 = fibonacci;
            cnt++;
        }
        System.out.println("***** Impresion con DoWhile *****");
        cnt = 0;
        numero1 = 0;
        numero2 = 1;
        fibonacci = 0;
        do {
            System.out.println(cnt + ": " + numero1);
            fibonacci = numero1 + numero2;
            numero1 = numero2;
            numero2 = fibonacci;
            cnt++;
        } while (cnt <= numero);
        teclado.close();
    }
}

package Bucles;

//Import Clases
import java.util.Scanner;

public class Tabla_Multiplicar_FOR_WHILE_DOWHILE {
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
        System.out.println("Tabla de multiplicar con While");
        int cnt = 0;
        while (cnt <=10){
            System.out.println((""+cnt+" * "+multiplicador+" = "+cnt*multiplicador));
            cnt++;
        }
        System.out.println("Tabla de multiplicar con DoWhile");
        cnt = 0;
        do {
            System.out.println((""+cnt+" * "+multiplicador+" = "+cnt*multiplicador));
            cnt++;
        } while (cnt <= 10);

    }
}

package Metodos;

public class Impresion_Resultados {
    public void cabecera (String nombre){
        //Definicion variables
        int long_nombre = nombre.length();
        int long_total = 20;
        if (long_nombre % 2 == 0)
            long_total += 1;
        for (int cnt = 0; cnt < long_total; cnt ++)
            System.out.print("*");
        System.out.println("");
        for (int cnt = 0; cnt < ((long_total-long_nombre)/2) - 1; cnt++){
            System.out.print("*");
        }
        System.out.print(" " + nombre + " ");
        for (int cnt = 0; cnt < ((long_total-long_nombre)/2); cnt++){
            System.out.print("*");
        }
        System.out.println();
        for (int cnt = 0; cnt < long_total; cnt ++)
            System.out.print("*");
        System.out.println("");
    }
}

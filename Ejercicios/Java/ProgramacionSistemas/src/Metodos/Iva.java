package Metodos;

import java.util.Scanner;

public class Iva {

    public void calculo_iva(double [] precio) {

        int suma=0;
        for(int i=0;i<precio.length;i++) {

            suma+=precio[i];
        }
        System.out.println("El precio total es: " + suma);
        System.out.println("El IVA es: " + suma * 0.21);
        System.out.println("El total es: " + (suma + (suma * 0.21)));
    }

    public double[] pedirDatos() {
        Scanner c=new Scanner(System.in);
        double [] numero=new double[10];

        for (int i=0;i<numero.length;i++) {
            System.out.print("Dime el precio "+(i+1)+" : ");
            numero[i]=c.nextInt();
        }
        c.close();
        return numero;
    }
}
package Metodos;

import java.util.Scanner;

public class Edades {
    public void calcular_edades(int [] edad) {
        int suma=0;
        for (int i=0;i<edad.length;i++) {
            suma+=edad[i];
            if (edad[i]<18) {
                System.out.println(" Es menor de edad con: "+edad[i]);
            }else {
                System.out.println("Es mayor de edad con: "+edad[i]);
            }
        }
        System.out.println("la edad media es "+(suma/edad.length));
    }

    public int[] pedirDatos() {
        Scanner c=new Scanner(System.in);
        int [] numero=new int[10];

        for (int i=0;i<numero.length;i++) {
            System.out.print("Dime la edad "+(i+1)+" : ");
            numero[i]=c.nextInt();
        }

        c.close();
        return numero;
    }
}


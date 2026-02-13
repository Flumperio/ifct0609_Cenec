package Metodos;

import java.util.Scanner;

public class Caluladora {
    public int menu (int [] valores, String [] menu){
        int salida_menu = 0;
        int cnt = 0, max_menu = 0;
        Scanner teclado = new Scanner(System.in);
        for (String elemento : menu){
            if (elemento.length() > max_menu)
                max_menu = elemento.length();
        }
        max_menu += 10;
        for (int cnt2 = 0; cnt2 <= max_menu; cnt2++){
            System.out.print("*");
        }
        System.out.println("");
        while (cnt < menu.length){
            System.out.print("* "+ cnt + ".- " + menu[cnt] + " ");
            for (int cnt1 = 0; cnt1 < (max_menu - menu[cnt].length()-7); cnt1 ++)
                System.out.print(" ");
            System.out.println("*");
            cnt ++;
        }
        for (int cnt2 = 0; cnt2 <= max_menu; cnt2++){
            System.out.print("*");
        }
        System.out.println("");
        salida_menu = teclado.nextInt();
        if (salida_menu < 0 || salida_menu > 5){
            System.out.println("Selección errónea. Vuelve a elegir.");
            menu(valores, menu);
        }
        if (salida_menu >= 1 && salida_menu <= 5) {
            System.out.println("Introduce el primer operador: ");
            valores[0] = teclado.nextInt();
            if (salida_menu != 5) {
                System.out.println("Introduce el segundo operador: ");
                valores[1] = teclado.nextInt();
            }
        }
        teclado.close();
        return salida_menu;
    }

    public void principal(int [] valores, String [] menu){
        int salida_menu = 0;
        double resultado = 0.0;
        do {
            salida_menu = menu(valores, menu);
            switch (salida_menu){
                case (1) -> resultado = sumar(valores);
                case (2) -> resultado = restar(valores);
                case (3) -> resultado = multiplicar(valores);
                case (4) -> resultado = dividir(valores);
                case (5) -> resultado = r_cuadrada(valores[0]);
            }
            if (salida_menu != 0)
                System.out.println("\nResultado: "+ resultado + "\n");
        } while (salida_menu != 0);
    }

    public int sumar (int [] numero){
        int resultado = 0;
        resultado = numero[1] + numero[0];
        return (resultado);
    }
    public int restar (int [] numero){
        int resultado = 0;
        resultado = numero[0] - numero[1];
        return (resultado);
    }
    public int multiplicar (int [] numero){
        int resultado = 0;
        resultado = numero[0] * numero[1];
        return (resultado);
    }
    public int dividir (int [] numero){
        int resultado = 0;
        resultado = numero[0] / numero[1];
        return (resultado);
    }
    public double r_cuadrada (int numero){
        double resultado;
        resultado = Math.sqrt(numero);
        return (resultado);
    }
}

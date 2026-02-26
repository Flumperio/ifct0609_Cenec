package Hilos;

import java.util.Scanner;

public class Calculadora_SinHilo {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        // pide usuario dos números y una operación
        System.out.print("Introduce el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Resultado: " + (num1 + num2));
        Thread.sleep(1000);
        System.out.println("Resultado: " + (num1 - num2));
        Thread.sleep(1000);
        System.out.println("Resultado: " + (num1 * num2));
        Thread.sleep(1000);
        System.out.println("Resultado: " + (num1 / num2));
        Thread.sleep(1000);


        scanner.close();
    }
}


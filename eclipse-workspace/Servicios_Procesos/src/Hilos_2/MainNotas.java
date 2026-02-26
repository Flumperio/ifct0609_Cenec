package Hilos_2;

import java.util.Scanner;

public class MainNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota, cnt = 0;
        String [] asignatura = {"Base de Datos", "Python", "Linux"};
        int [] notas = new int[3];
        // Solicitar al usuario los números
        for (String as : asignatura){
            System.out.print("Introduce la nota de " + asignatura[cnt] + ": ");
            notas[cnt] = scanner.nextInt();
            cnt ++;
        }

        // Crear y arrancar hilos para cada operación

        BaseDatosDual basedatosdual = new BaseDatosDual(notas[0], asignatura[0]);
        basedatosdual.setPriority(1);
        basedatosdual.start();
        PythonDual pythonDual = new PythonDual(notas[1], asignatura[1]);
        basedatosdual.setPriority(5);
        pythonDual.start();
        LinuxDual linuxdual = new LinuxDual(notas[2], asignatura[2]);
        basedatosdual.setPriority(10);
        linuxdual.start();

        scanner.close();
    }
}

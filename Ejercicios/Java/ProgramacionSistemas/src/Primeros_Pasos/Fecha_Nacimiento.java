package Primeros_Pasos;

import java.util.Scanner;

public class Fecha_Nacimiento {
	public static void main(String[] args) {
		// Deficinión de variables
		Scanner teclado =  new Scanner(System.in);
		int anio_nacimiento, anio_actual, edad, t_meses, t_dias, t_horas, t_minutos;

		//Entrada de datos
		System.out.println("Introduce tu año de nacimiento: ");
		anio_nacimiento  =  teclado.nextInt();
		System.out.println("Introduce el año actual: ");
		anio_actual  =  teclado.nextInt();

		//Main
		edad = anio_actual - anio_nacimiento;
		t_meses = edad * 12;
		t_dias = t_meses * 365;
		t_horas = t_dias * 24;
		t_minutos = t_horas * 60;
		//Impresion de resultados
		System.out.println("***** Resultado *****");
		System.out.printf("Si naciste en %d, tienes %d años.", anio_nacimiento, edad);
		System.out.printf("\nEsto hace un total de: ");
		System.out.printf("\nMeses: %d", t_meses);
		System.out.printf("\nDias: %d", t_dias);
		System.out.printf("\nHoras: %d", t_horas);
		System.out.printf("\nMinutos: %d", t_minutos);
		teclado.close();
	}

}

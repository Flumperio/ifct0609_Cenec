package Primeros_Pasos;

import java.util.Scanner;

public class Calculo_Tiempo {
	public static void main(String[] args) {
		// Deficinión de variables
		Scanner teclado =  new Scanner(System.in);
		double comer, dormir, hobbies, ejercicio, trabajar, reprochar, tareas_casa = 0.0;
		double sem_comer, sem_dormir, sem_hobbies, sem_ejercicio, sem_trabajar, sem_reprochar, sem_tareas_casa = 0.0;
		//Entrada de datos
		System.out.println("Cuantas horas dedicas a comer cada día: ");
		comer  =  teclado.nextDouble();
		System.out.println("Cuantas horas dedicas a dormir cada día: ");
		dormir  =  teclado.nextDouble();
		System.out.println("Cuantas horas dedicas a tus hobbies cada día: ");
		hobbies  =  teclado.nextDouble();
		System.out.println("Cuantas horas dedicas a hacer ejercicio cada día: ");
		ejercicio  =  teclado.nextDouble();
		System.out.println("Cuantas horas dedicas a trabajar cada día: ");
		trabajar  =  teclado.nextDouble();
		System.out.println("Cuantas horas dedicas a reprochar cada día: ");
		reprochar  =  teclado.nextDouble();
		System.out.println("Cuantas horas dedicas a las tareas de la casa cada día: ");
		tareas_casa  =  teclado.nextDouble();
		//Main
		sem_comer = comer * 7;
		sem_dormir = dormir * 7;
		sem_hobbies = hobbies * 7;
		sem_ejercicio = ejercicio * 7;
		sem_trabajar = trabajar * 7;
		sem_reprochar = reprochar * 7;
		sem_tareas_casa = tareas_casa * 7;
		//Impresion de resultados
		System.out.println("***** Resultado *****");
		System.out.println("Dedicas " + sem_comer + " horas a las semana en comer.");
		System.out.println("Dedicas " + sem_dormir + " horas a las semana en dormir.");
		System.out.println("Dedicas " + sem_hobbies + " horas a las semana a tus hobbies.");
		System.out.println("Dedicas " + sem_ejercicio + " horas a las semana en hacer ejercicio.");
		System.out.println("Dedicas " + sem_hobbies + " horas a las semana a tus hobbies.");
		System.out.println("Dedicas " + sem_trabajar + " horas a las semana a trabajar.");
		System.out.println("Dedicas " + sem_tareas_casa + " horas a las semana en tareas del hogar.");
		System.out.println("Dedicas " + sem_reprochar + " horas a las semana a reprochar.  Ya te vale.");
		teclado.close();
	}

}

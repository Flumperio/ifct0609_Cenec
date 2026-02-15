package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio_10 {
    public static void main(String[] args){
        //Definición variables
        var alumnos_primero = new ArrayList<Alumno>();
        int numeroEntradas;
        double nota;
        String nombre, busc_alum;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        System.out.println("Introduce el número de Alumnos: ");
        numeroEntradas = teclado.nextInt();
        for (int cnt = 0; cnt < numeroEntradas; cnt ++){
            System.out.print("Nombre del Alumno: ");
            nombre = teclado.next();
            System.out.print("\nNota: ");
            nota = teclado.nextDouble();
            alumnos_primero.add(new Alumno(nombre, nota));
        }
        //Main
        for (var alumno : alumnos_primero) {
            System.out.println(alumno.nombre + " -- " + alumno.nota);
        }
        System.out.println("De que alumno quieres saber la nota: ");
        busc_alum = teclado.next();
        for (Alumno cnt : alumnos_primero){
            if (cnt.nombre.equals(busc_alum)){
                System.out.println("La nota del alumno " + cnt.nombre + " es: " + cnt.nota);
            }
        }

        //Impresion
        //Cerramos clases abiertas
        teclado.close();
    }
    //Clase pública de pruebas.
    public static class Alumno {
        //Atributos
        public String nombre;
        public double nota;
        //Constructor
        public Alumno(String nombre, double nota) {
            this.nombre = nombre;
            this.nota = nota;
        }
    }
}

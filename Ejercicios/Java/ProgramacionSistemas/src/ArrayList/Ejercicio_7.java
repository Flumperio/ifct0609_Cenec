package ArrayList;

import java.util.ArrayList;

import java.util.Scanner;



public class Ejercicio_7 {
    public static void main(String[] args){
        //Definición variables
        var gente = new ArrayList<Persona>();
        int numeroEntradas, edad;
        String nombre, apellidos;
        Scanner teclado = new Scanner(System.in);
        //Entrada Datos
        System.out.println("Introduce el número de campos: ");
        numeroEntradas = teclado.nextInt();
        for (int cnt = 0; cnt < numeroEntradas; cnt ++){
            System.out.print("Nombre: ");
            nombre = teclado.next();
            System.out.print("\nApellidos: ");
            apellidos = teclado.next();
            System.out.print("\nEdad: ");
            edad = teclado.nextInt();
            gente.add(new Persona(nombre, apellidos, edad));
        }
        //Main
        System.out.println(gente);
        for (var cnt : gente )
            System.out.println(cnt.getNombre() + " " + cnt.getApellidos() + " -- "+cnt.getEdad());

        //Impresion
        //Cerramos clases abiertas
        teclado.close();
    }
    //Clase pública de pruebas.
    public static class Persona {
        //Atributos
        public String nombre;
        public String apellidos;
        public int edad;
        //Constructor
        public Persona(String nombre, String apellidos, int edad) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }
}

import java.util.Scanner;

public class Ejercicio_8_Main {
    static class Empleado {
        //Atributos
        private String nombre;
        private double sueldoBase;
        //Constructor
        public Empleado(String nombre, double sueldoBase) {
            this.nombre = nombre;
            this.sueldoBase = sueldoBase;
        }
        //Metodos
        public double calcularSueldoAnual() {
            return sueldoBase * 12;
        }
        public void mostrarInfo() {
            System.out.println("--------------------");
            System.out.println("Empleado:\n" +
                    "Nombre=" + nombre +
                    "\nSueldo Base=" + sueldoBase + "€/mes" +
                    "\nSueldo Anual=" + calcularSueldoAnual() + "€");
            System.out.println("--------------------");
        }
    }
    //Main
    public static void main (String[] args){
        //Variables
        Scanner teclado = new Scanner(System.in);
        double sueldo = 0;
        //Programa
        System.out.println("Introduce el sueldo del empleado: ");
        sueldo = teclado.nextDouble();
        Empleado pepe = new Empleado("Pepe", sueldo);
        pepe.mostrarInfo();
    }
}

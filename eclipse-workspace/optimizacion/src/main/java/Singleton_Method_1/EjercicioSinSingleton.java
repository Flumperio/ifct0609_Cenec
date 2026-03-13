package Singleton_Method_1;

public class EjercicioSinSingleton {
    // Constructor público para permitir la creación de instancias desde fuera de la clase
    public EjercicioSinSingleton() {}

    // Método de ejemplo para mostrar el funcionamiento
    public void mostrarMensaje() {
        System.out.println("¡Hola! Soy un objeto sin Singleton.");
    }

    public static void main(String[] args) {
        // Crear dos instancias del objeto
        EjercicioSinSingleton objeto1 = new EjercicioSinSingleton();
        EjercicioSinSingleton objeto2 = new EjercicioSinSingleton();

        // Usar las instancias para llamar al método mostrarMensaje
        objeto1.mostrarMensaje();
        objeto2.mostrarMensaje();

        // Verificar si son la misma instancia
        if (objeto1 == objeto2) {
            System.out.println("Es la misma instancia");
        } else {
            System.out.println("Son instancias diferentes");
        }
    }

}

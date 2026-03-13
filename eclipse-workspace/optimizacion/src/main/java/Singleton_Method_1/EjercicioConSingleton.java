package Singleton_Method_1;

public class EjercicioConSingleton {
    //Atributo instance
    public static EjercicioConSingleton instance;
    //Constructor vacio PRIVATE para que no se creen instancias desde fuera.
    private EjercicioConSingleton() {}
    //Método para tener la única instancia de la clase.
    public static EjercicioConSingleton getInstance(){
        if(instance == null){
            instance = new EjercicioConSingleton();
        }
        return instance;
    }
    //Metodo para imprimir
    public void mostrarMensaje(){
        System.out.println("Hola soy un singleton, en verda, avé.");
    }

    public static void main(String[] args) {
        // Crear dos instancias del objeto
        EjercicioConSingleton objeto1 = EjercicioConSingleton.getInstance();
        EjercicioConSingleton objeto2 = EjercicioConSingleton.getInstance();

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

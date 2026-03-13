package Prototype_Method_1;

public class MainPersona {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Creamos una persona original
        Persona personaOriginal = new Persona("Juan");

        // Clonamos la persona original
        Persona personaClonada = (Persona) personaOriginal.clone();

        // Mostramos los nombres
        System.out.println("Persona original: " + personaOriginal.getNombre());
        System.out.println("Persona clonada: " + personaClonada.getNombre());

        // Modificamos el nombre de la persona clonada
        personaClonada.setNombre("Pedro");

        // Mostramos los nombres nuevamente para confirmar que la modificación no afecta a la original
        System.out.println("Persona original después de modificar el clon: " + personaOriginal.getNombre());
        System.out.println("Persona clonada después de modificarla: " + personaClonada.getNombre());
    }
}

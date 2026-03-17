package Template_Method_2;
// Clase abstracta que define el método template
public abstract class BebidaConCafeina {
    // Método template
    public final void prepararReceta() {
        hervirAgua();
        preparar();
        servirEnTaza();
        agregarCondimentos();
    }
    // Métodos concretos
    public void hervirAgua() {
        System.out.println("Hirviendo agua");
    }
    public void servirEnTaza() {
        System.out.println("Sirviendo en la taza");
    }
    // Métodos abstractos que deben ser implementados por las subclases
    abstract void preparar();
    abstract void agregarCondimentos();
}

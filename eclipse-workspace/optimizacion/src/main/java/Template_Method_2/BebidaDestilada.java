package Template_Method_2;
// Clase abstracta que define el método template
public abstract class BebidaDestilada {
    // Método template
    public final void prepararBebida(String picar) {
        cogerVaso();
        echarHielo();
        picoteo(picar);
        agregarDestilado();
        agregarRefresco();
    }
    // Métodos concretos
    public void cogerVaso() {
        System.out.println("Cogiendo Vaso de balón. ");
    }
    public void echarHielo() {
        System.out.println("Echan 4 pidras de hielo.");
    }
    public void picoteo(String picar){
        System.out.println("Poniendo una de " + picar);
    }
    //public void picoteo(String frutoseco){
    //    System.out.println("Poniendo " + frutoseco);
    //}
    // Métodos abstractos que deben ser implementados por las subclases
    abstract void agregarDestilado();
    abstract void agregarRefresco();
    //abstract void picoteo();

}

package Template_Method_1;
// Clase abstracta que define el método template
public abstract class ComidaCocida {
    // Método template
    public final void prepararReceta() {
        hervirAgua();
        echarComida();
        tiempoHervir();
        sacarComida();
    }
    // Métodos concretos
    public void hervirAgua() {
        System.out.println("Hirviendo el agua. ");
    }
    public void echarComida() {
        System.out.println("Echando comida.");
    }
    //public void picoteo(String frutoseco){
    //    System.out.println("Poniendo " + frutoseco);
    //}
    // Métodos abstractos que deben ser implementados por las subclases
    abstract void tiempoHervir();
    abstract void sacarComida();
    //abstract void picoteo();

}

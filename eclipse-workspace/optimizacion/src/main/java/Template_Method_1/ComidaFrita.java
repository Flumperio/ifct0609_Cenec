package Template_Method_1;
// Clase abstracta que define el método template
public abstract class ComidaFrita {
    // Método template
    public final void prepararReceta() {
        calentarSarten();
        echarAceite();
        echarComida();
        sacarComida();
    }
    // Métodos concretos
    public void calentarSarten() {
        System.out.println("Calentando Sarten.");
    }
    public void echarAceite() {
        System.out.println("Poniendo aceite.");
    }
    // Métodos abstractos que deben ser implementados por las subclases
    abstract void echarComida();
    abstract void sacarComida();
}

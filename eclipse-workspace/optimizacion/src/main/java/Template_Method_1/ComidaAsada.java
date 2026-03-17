package Template_Method_1;
// Clase abstracta que define el método template
public abstract class ComidaAsada {
    // Método template
    public final void prepararReceta(int grados, int altura) {
        calentarHorno(grados);
        ponerComida();
        colocarBandeja(altura);

        tiempoAsado();
    }
    // Métodos concretos
    public void calentarHorno(int grados) {
        System.out.println("Calentando horno a: " + grados);
    }
    public void ponerComida(){
        System.out.println("Colocando la comida en la bandeja.");
    }
    public void colocarBandeja(int altura) {
        System.out.println("Poner la bandeja en la altura: " + altura);
    }
    // Métodos abstractos que deben ser implementados por las subclases
    abstract void tiempoAsado();
}

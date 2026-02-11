package pooAbstracta;

public class Coche extends Vehiculos {

    private int cilindrada;

    public Coche(String nombre, int ruedas, String modelo, int cilindrada){
        super (nombre, ruedas, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    void acelerar() {
        System.out.println("Acelerando el " + this.getModelo() + " -> -> ->");
    }

    @Override
    void frenar() {
        System.out.println("Frenando el " + this.getModelo() + " <- <- <-");
    }

    @Override
    void aparcar() {
        System.out.println("***** Aparcando el " + this.getModelo()+" *****");
    }

    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


}
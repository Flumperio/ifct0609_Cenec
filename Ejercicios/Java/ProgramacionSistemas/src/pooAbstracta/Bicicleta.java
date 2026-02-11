package pooAbstracta;

public class Bicicleta extends Vehiculos {
    String tipo;

    public Bicicleta (String nombre, int ruedas, String modelo, String tipo){
        super(nombre, ruedas, modelo);
        this.tipo = tipo;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}

package pooAbstracta;

public abstract class Vehiculos {
    protected String color;
    protected int ruedas;
    protected String modelo;

    public Vehiculos(String color, int ruedas, String modelo){
        this.color = color;
        this.ruedas = ruedas;
        this.modelo = modelo;
    }
    //Setter y Getter
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getRuedas() {
        return ruedas;
    }
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    abstract void acelerar();

    abstract void frenar();

    abstract void aparcar();
}


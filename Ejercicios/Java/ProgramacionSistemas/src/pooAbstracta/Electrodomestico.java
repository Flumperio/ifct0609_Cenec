package pooAbstracta;

public abstract class Electrodomestico {
    //Atributos
    protected String color;
    protected double peso;
    protected String marca;
    protected String fabricante;
    protected double precio;
    //Constructor
    public Electrodomestico(String color, double peso, String marca, String fabricante, double precio) {
        this.color = color;
        this.peso = peso;
        this.marca = marca;
        this.fabricante = fabricante;
        this.precio = precio;
    }
    //Métodos
    abstract void encender ();
    abstract void apagar ();
    abstract void comprar ();
    abstract void devolver ();
    //Setters y Getters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

package pooAbstracta;

public class Cafetera extends Electrodomestico {
    //Atributos
    String tipo;
    //Constructor
    public Cafetera(String color, double peso, String marca, String fabricante, double precio, String tipo) {
        super(color, peso, marca, fabricante, precio);
        this.tipo = tipo;
    }
    //Metodos
    @Override
    void encender (){
        System.out.println("Encendemos la " + this.marca + " para hacer un" + this.tipo);
    }
    @Override
    void apagar (){
        System.out.println("Apagamos la " + this.marca + " después de hacer un " + this.tipo);
    }
    @Override
    void comprar (){
        System.out.println("Compramos la " + this.marca + " con un precio de: " + this.precio + ".");
    }
    @Override
    void devolver (){
        System.out.println("Devolvemos la " + this.marca + " del fabricante " + this.fabricante + ". Porque el peso: " + this.peso + " es excesivo.");
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "precio=" + precio +
                ", fabricante='" + fabricante + '\'' +
                ", marca='" + marca + '\'' +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
    //Setters y Getters
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

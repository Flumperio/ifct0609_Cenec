package pooAbstracta;

public class Frigorifico extends Electrodomestico{
    //Atributos
    private int capacidad;
    private int altura;
    //Constuctor
    public Frigorifico(String color, int peso, String marca, String fabricante, double precio, int capacidad, int altura) {
        super(color, peso, marca, fabricante, precio);
        this.capacidad = capacidad;
        this.altura = altura;
    }
    //Metodos
    @Override
    void encender (){
        System.out.println("Encendemos el " + this.marca + " para conservar " + this.capacidad + "kg de alimentos.");
    }
    @Override
    void apagar (){
        System.out.println("Apagamos el " + this.marca + " para limpiarlo ");
    }
    @Override
    void comprar (){
        System.out.println("Compramos el " + this.marca + " del fabricante " + this.fabricante + " por " + this.precio + "€");
    }
    @Override
    void devolver (){
        System.out.println("Devolvemos el " + this.marca + " del fabricante " + this.fabricante + ". Porque la altura: " + this.altura + " es excesiva.");
    }

    @Override
    public String toString() {
        return "Frigorifico{" +
                "capacidad=" + capacidad +
                ", altura=" + altura +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", marca='" + marca + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", precio=" + precio +
                '}';
    }
    //Setter y Getter
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
}

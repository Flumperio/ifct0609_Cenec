package pooAbstracta;

import POO.Ejercicio_1;

public class Lavadora extends Electrodomestico {
    //Atributos
    private int carga;
    //Constructor
    public Lavadora(String color, int peso, String marca, String fabricante, double precio, int carga) {
        super(color, peso, marca, fabricante, precio);
        this.carga = carga;
    }
    //Metodos
    @Override
    void encender (){
        System.out.println("Encendemos el " + this.marca + " para lavar " + this.carga + "kg de ropa.");
    }
    @Override
    void apagar (){
        System.out.println("Apagamos el " + this.marca + " después lavar " + this.carga + "kg de ropa.");
    }
    @Override
    void comprar (){
        System.out.println("Compramos el " + this.marca + " del fabricante " + this.fabricante + ".");
    }
    @Override
    void devolver (){
        System.out.println("Devolvemos el " + this.marca + " del fabricante " + this.fabricante + ". Porque el peso: " + this.peso + " es excesivo.");
    }
    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", marca='" + marca + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", precio=" + precio +
                '}';
    }
    //Setters y Getter
    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }

}

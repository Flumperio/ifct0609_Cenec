package Builder_Method_1;

class Producto {
    //Atributos
    private String nombre, color, fabricante, modelo;
    private double precio, talla;
    //Constructor
    public Producto(String nombre, String color, String fabricante, String modelo, double precio, double talla) {
        this.nombre = nombre;
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.talla = talla;
    }
    //Setters y Getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getTalla() {
        return talla;
    }
    public void setTalla(double talla) {
        this.talla = talla;
    }
    //Imprimir
    public void imprimirDetalles () {
        System.out.println( "Producto{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", talla=" + talla +
                '}');
    }
}

package Builder_Method_1;

class ProductoBuilder {
    private String nombre, color, fabricante, modelo;
    private double precio, talla;
    //Cnostructores de las propiedades
    public ProductoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public ProductoBuilder color (String color) {
        this.color = color;
        return this;
    }
    public ProductoBuilder fabricante (String fabricante) {
        this.fabricante = fabricante;
        return this;
    }
    public ProductoBuilder modelo (String modelo) {
        this.modelo = modelo;
        return this;
    }
    public ProductoBuilder precio (double precio) {
        this.precio = precio;
        return this;
    }
    public ProductoBuilder talla (double talla) {
        this.talla = talla;
        return this;
    }
    //Builder
    public Producto build(){
        return new Producto(nombre, color, fabricante, modelo, precio, talla);
    }



}

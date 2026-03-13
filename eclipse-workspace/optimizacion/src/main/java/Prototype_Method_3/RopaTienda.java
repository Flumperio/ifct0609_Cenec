package Prototype_Method_3;

class RopaTienda implements Ropa {
    private String color, tipo;
    private double talla, precio;

    public RopaTienda(String color, String tipo, double talla, double precio) {
        this.color = color;
        this.tipo = tipo;
        this.talla = talla;
        this.precio = precio;
    }
    public RopaTienda(RopaTienda clon_Ropa){
        this.color = clon_Ropa.color;
        this.tipo = clon_Ropa.tipo;
        this.talla = clon_Ropa.talla;
        this.precio = clon_Ropa.precio;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setTalla(double talla) {
        this.talla = talla;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public RopaTienda clonar() {
        return new RopaTienda(this);
    }

    @Override
    public void impresion() {
        System.out.println("La prenda de ropa tiene:");
        System.out.println("Color: " + color);
        System.out.println("Tipo: " + tipo);
        System.out.println("Talla: " + talla);
        System.out.println("Precio: " + precio);
    }
}

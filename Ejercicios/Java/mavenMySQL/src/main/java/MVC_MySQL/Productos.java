package MVC_MySQL;

public class Productos {
    private int id;
    private String nombre;
    private double precio;
    //Constuctor
    public Productos(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    //Getters
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
}

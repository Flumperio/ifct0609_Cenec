package MVC_2;

public class Productos {
    //Atributos
    private int codigo;
    private String nombre;
    Double precio;
    //Constructor
    public Productos(int codigo, String nombre, Double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    //Getter
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public Double getPrecio() {
        return precio;
    }
}

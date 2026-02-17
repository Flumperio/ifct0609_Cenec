package MVC_MySQL;

public class Cliente {
    private int id;
    private String nif;
    private String nombre;
    private int edad;
    //Constructor
    public Cliente(int id, String nif, String nombre, int edad) {
        this.id = id;
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }
    //Getters
    public int getId() {
        return id;
    }
    public String getNif() {
        return nif;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
}

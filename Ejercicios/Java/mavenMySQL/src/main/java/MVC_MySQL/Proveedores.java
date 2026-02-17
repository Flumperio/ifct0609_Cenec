package MVC_MySQL;

public class Proveedores {
    private int id;
    private String nombre;
    private String telefono;
    private String email;
    //Constructores
    public Proveedores(int id, String nombre, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    //Getter
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getEmail() {return email;}
}

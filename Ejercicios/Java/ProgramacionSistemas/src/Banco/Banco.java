package Banco;

public class Banco {
    //Atributo
    private String nombre_banco;
    //Constructor
    public Banco(String nombre_banco) {
        this.nombre_banco = nombre_banco;
    }
    //Setter y Getter
    public String getNombre_banco() {
        return nombre_banco;
    }
    public void setNombre_banco(String nombre_banco) {
        this.nombre_banco = nombre_banco;
    }
    @Override
    public String toString() {
        return "Banco{" +
                "nombre_banco='" + nombre_banco + '\'' +
                '}';
    }
}

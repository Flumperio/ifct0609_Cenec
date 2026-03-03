package modelo;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // Cambiar el nombre de la columna aquí
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private String precio;

    @Column(name = "codigo_fabricante")
    private String codigo_fabricante;

    // Constructor por defecto requerido por Hibernate
    public Producto() {
    }

    // Constructor para crear un objeto de tipo fabricante con un nombre específico
    public Producto(String nombre, String precio, String codigo_fabricante) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo_fabricante = codigo_fabricante;
    }

    // Getter y setter para el atributo id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter y setter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCodigo_fabricante() {
        return codigo_fabricante;
    }

    public void setCodigo_fabricante(String codigo_fabricante) {
        this.codigo_fabricante = codigo_fabricante;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para imprimir información del objeto fabricante
    @Override
    public String toString() {
        return "producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio='" + precio + '\'' +
                ", codigo_fabricante='" + codigo_fabricante + '\'' +
                '}';
    }
}

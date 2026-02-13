package Banco;

public class Clientes implements DatosCliente {
    //Atributos
    private String nombre;
    private String dni;
    private String telefono;
    private CuentaBancaria cuenta;

    //Constuctor
    public Clientes(String nombre, String dni, String telefono, CuentaBancaria cuenta) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.cuenta = cuenta;
    }
    //Setters y Getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public CuentaBancaria getCuenta() {
        return cuenta;
    }
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
    //Overrride
    @Override
    public void mostrarDatosCliente() {
        System.out.println(" ** Datos del cliente **");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Cuenta: " + cuenta.getN_cuenta());
        System.out.println("Banco: " + cuenta.getNombre_banco());
        System.out.println("Saldo: " + cuenta.getSaldo());
    }
}

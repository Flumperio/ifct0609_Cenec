package Sobrecarga;

public class SobreCarga {
    private String nombre;
    private int edad;
    private int ingresos;

    public SobreCarga(String nombre, int edad, int ingresos) {
        this.nombre = nombre;
        this.edad = edad;
        this.ingresos = ingresos;

    }
    public SobreCarga(String nombre, int ingresos){
        this.nombre = nombre;
        this.setEdad(18);
        this.ingresos = ingresos;
    }

    public SobreCarga(String nombre) {
        this.nombre = nombre;
        this.edad = 22;
        this.ingresos = 1;
    }



    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getIngresos() {
        return ingresos;
    }
    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public void mostrar() {
        System.out.println(getNombre()+" "+getEdad() + " " + getIngresos());
    }

    public void mostrar(String nombre) {
        System.out.println(getNombre());
    }
}

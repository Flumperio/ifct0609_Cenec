package Composite_Method;

public class Archivo implements Componente{
	//Atributos
	private String nombre;
	//Constructor
	public Archivo (String nombre) {
		this.nombre = nombre;
	}
	@Override
	public void mostrar() {
		System.out.println ("Archivo: " + nombre);
	}
}

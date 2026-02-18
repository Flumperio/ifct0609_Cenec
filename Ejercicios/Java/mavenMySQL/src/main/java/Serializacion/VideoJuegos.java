package Serializacion;

import java.io.Serializable;

public class VideoJuegos implements Serializable {
	//Atributos
	private int codigo;
	private String nombre;
	private String precio;
	//Constructor
	public VideoJuegos(int codigo, String nombre, String precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	//Getters
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getPrecio() {
		return precio;
	}
	//toString

	@Override
	public String toString() {
		return "VideoJuegos{" +
				"codigo=" + codigo +
				", nombre='" + nombre + '\'' +
				", precio='" + precio + '\'' +
				'}';
	}
}

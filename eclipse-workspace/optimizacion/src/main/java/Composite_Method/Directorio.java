package Composite_Method;

import java.util.ArrayList;
import java.util.List;

public class Directorio implements Componente {
	private String nombre;
	private List<Componente> componentes = new ArrayList<>();
	//Constructor
	public Directorio (String nombre){
		this.nombre = nombre;
	}
	public void agregar(Componente componente){
		componentes.add(componente);
	}
	@Override
	public void mostrar() {
		System.out.println("Directorio: " + nombre);
		for (Componente componente : componentes){
			componente.mostrar();
		}

	}


}

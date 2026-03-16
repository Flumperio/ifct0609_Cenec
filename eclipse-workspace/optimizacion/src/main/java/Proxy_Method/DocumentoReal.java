package Proxy_Method;

public class DocumentoReal implements Documento{
	//Atributo
	private String nombre;
	//Consturctor
	public DocumentoReal(String nombre){
		this.nombre = nombre;
		cargarDesdeDisco (nombre);
	}
	//Metodo
	private void cargarDesdeDisco(String nombre){
		System.out.println("Cargando " + nombre);
	}
	@Override
	public void mostrar(){
		System.out.println("Mostrando " + nombre);
	}

}


package Proxy_Method;

public class ProxyDocumento implements Documento{
	//Atributos
	private DocumentoReal documentoReal;
	private String nombre;
	//Constuctor
	public ProxyDocumento (String nombre){
		this.nombre = nombre;
	}
	@Override
	public void mostrar (){
		if (documentoReal == null ){
			documentoReal = new DocumentoReal(nombre);
		} else {
			documentoReal.mostrar();
		}
	}

}

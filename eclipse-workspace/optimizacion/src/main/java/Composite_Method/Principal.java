package Composite_Method;

public class Principal {
	public static void main(String[] args) {
		Archivo archivo1 = new Archivo("Archivo1.txt");
		Archivo archivo2 = new Archivo("Archivo2.txt");
		Archivo archivo3 = new Archivo("Archivo3.txt");
		Archivo archivo4 = new Archivo("Archivo4.txt");
		Archivo archivo5 = new Archivo("Archivo5.txt");
		Archivo archivo6 = new Archivo("Archivo6.txt");
		Archivo archivo7 = new Archivo("Archivo7.txt");

		Directorio directorio1 = new Directorio("Mi_Directorio");
		directorio1.agregar(archivo1);
		directorio1.agregar(archivo2);
		directorio1.agregar(archivo3);
		directorio1.agregar(archivo4);
		directorio1.agregar(archivo5);
		directorio1.agregar(archivo6);
		directorio1.agregar(archivo7);

		directorio1.mostrar();

		Directorio directorio2 = new Directorio("Mi_SUB_Directorio");
		directorio1.agregar(directorio2);
		directorio2.agregar(archivo1);
		directorio2.agregar(archivo2);
		directorio2.agregar(archivo3);
		directorio2.agregar(archivo4);
		directorio2.agregar(archivo5);
		directorio2.agregar(archivo6);
		directorio2.agregar(archivo7);

		directorio1.mostrar();
	}
}

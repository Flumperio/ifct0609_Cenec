package Gestion_Ficheros;
import java.io.File;
public class CrearDirectorio {
	public static void main(String[] args) {
		String ruta="ProgramacionSistemas/ficheros/Gestion_Ficheros";
		String carpeta = "ejercicio1";
		File directorio = new File(ruta+carpeta);
		if (directorio.exists()==true) {
			System.out.println("la carpeta existe idiota");
		} else {
			directorio.mkdir();
			System.out.println("carpeta creada");
		}
	}
}

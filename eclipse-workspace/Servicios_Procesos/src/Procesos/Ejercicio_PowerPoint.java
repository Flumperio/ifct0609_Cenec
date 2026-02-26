package Procesos;

import java.io.File;

public class Ejercicio_PowerPoint {

	public static void main(String[] args){
		ProcessBuilder pb = new ProcessBuilder("open", "-a", "/Applications/Keynote Creator Studio.app",
				"/Users/jcsantos/eclipse-workspace/Servicios_Procesos/Ficheros/KeyNote.key");
		pb.directory(new File("/Users/jcsantos/Desktop"));  // Working dir explícito
		pb.inheritIO();  // Opcional: hereda stdout/stderr para debug
		try {
			Process p = pb.start();
			p.waitFor();  // Espera fin para ver errores
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

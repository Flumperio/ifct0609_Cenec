package Gestion_Ficheros;

import java.io.File;

public class Ejercicio_1 {
	public static void main(String[] args) {
		String [] nombres = {"Carlos", "Paco", "Luis", "Alfonso"};
		File file_w = new File("mavenMySQL/src/ficheros/gente_File.dat");
		System.out.println(""+ nombres + file_w);
	}
}

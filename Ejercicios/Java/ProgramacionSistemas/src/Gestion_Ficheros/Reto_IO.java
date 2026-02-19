package Gestion_Ficheros;

import java.io.*;

public class Reto_IO {
	public static void main (){
		//Variables
		String[] clientes = {"Ayuntamiento Málaga", "Maskom", "Carrefour"};
		String[] proveedores = {"Microsoft", "Google", "Apple"};
		String[] productos = {"Office", "Gemini", "Iphone 17 pro"};
		String[] folders = {"CLIENTES", "PROVEEDORES", "PRODUCTOS"};
		String ruta_directorio = "ficheros/Ejercicio_Reto/";
		//Crear directorios y ficheros
		for (String cnt :folders){
			File mk_folder = new File(ruta_directorio+cnt);
			File mk_file = new File(ruta_directorio+cnt+"/"+cnt+".txt");
			try {
				if (mk_folder.exists()) {
					System.out.println("El directorio: " + (ruta_directorio + cnt) + " existe. No se crea");
				} else {
					mk_folder.mkdirs();
					mk_file.createNewFile();
					System.out.println("Directorios Creados");
				}
			} catch (IOException e){
				System.out.println("Error IO: " + e);
			}
		}
		//Crear Archivos.
		grabar(clientes, ruta_directorio+folders[0]+"/"+folders[0]+".txt");
		grabar(proveedores, ruta_directorio+folders[1]+"/"+folders[1]+".txt");
		grabar(productos, ruta_directorio+folders[2]+"/"+folders[2]+".txt");
	}

	static void grabar (String [] elementos, String ruta){
		try (PrintWriter print_file = new PrintWriter(new FileWriter(ruta))) {
			for (String elemento : elementos){
				print_file.println(elemento);
			}
		} catch (IOException e){
			System.out.println("Error IO:" + e);
		}
	}
}

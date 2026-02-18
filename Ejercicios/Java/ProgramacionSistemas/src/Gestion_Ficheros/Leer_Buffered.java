package Gestion_Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leer_Buffered {
	public static void main(String[] args) {
        //Variables
        String linea;
        //Main
        try (BufferedReader file_R = new BufferedReader (new FileReader("ProgramacionSistemas/ficheros/int_Nombres.dat")))
            {
            while ((linea = file_R.readLine()) != null){
                System.out.println(linea);
            }
        } catch (FileNotFoundException fn){
                System.out.println("Error IO: " + fn);
        } catch (IOException io){
            System.out.println("Error E/S: " + io);
        }
	}
}


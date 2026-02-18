package Gestion_Ficheros;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Grabar_Buffered {
	public static void main(String[] args) {
        //Variables
		String [] nombres = {"Carlos", "Juan", "Marta", "Ana", "Marco"};
        int a = 0;
        //Main
        try{
            BufferedWriter file_w = new BufferedWriter(new FileWriter("ProgramacionSistemas/ficheros/int_Nombres.dat"));
            for (String n : nombres){
                file_w.write("Fila numero: " + a + " --- " + n);
                file_w.newLine();
                a++;
            }
            System.out.println("Fichero creado ok, con: " + a + " lineas.");
            file_w.close();
        } catch (FileNotFoundException fn){
                System.out.println("Error IO: " + fn);
        } catch (IOException io){
            System.out.println("Error E/S: " + io);
        }
	}
}


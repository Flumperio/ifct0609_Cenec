package Serializacion;

import java.io.*;
import java.util.ArrayList;

public class GenteMain {
    static void main (){
        //Variables
        ArrayList<Gente> personas = new ArrayList<>();
        personas.add(new Gente ("Juan Carlos", "Santos", 55));
        personas.add(new Gente ("Antonio", "García", 62));
        personas.add(new Gente ("María Carmen", "Rodríguez", 59));
        personas.add(new Gente ("Manuel", "Fernández", 57));
        personas.add(new Gente ("Ana María", "López", 55));
        personas.add(new Gente ("José", "Martínez", 60));
        personas.add(new Gente ("Carmen", "Sánchez", 58));
        personas.add(new Gente ("Francisco", "Pérez", 61));
        personas.add(new Gente ("Isabel", "González", 54));
        personas.add(new Gente ("David", "García", 42));
        personas.add(new Gente ("Laura", "Martín", 40));
                //Serialización
        try {
            //Creamos Objetos
            FileOutputStream file_W = new FileOutputStream("src/ficheros/gente_File.dat");
            ObjectOutputStream archive_W = new ObjectOutputStream(file_W);
            //Grabamos objetos
            archive_W.writeObject(personas);
            //Cerramos objetos
            archive_W.close();
            file_W.close();

        }catch (IOException e){
            System.out.println("Error IO: " + e);
        }
        try {
            //Creamos Objetos
            FileInputStream file_R = new FileInputStream("src/ficheros/gente_File.dat");
            ObjectInputStream archive_R = new ObjectInputStream(file_R);
            //Grabamos objetos
            ArrayList<Gente> personas_read;
            personas_read = (ArrayList<Gente>) archive_R.readObject();
            System.out.println(personas_read);
            //Cerramos objetos
            archive_R.close();
            file_R.close();

        }catch (IOException e){
            System.out.println("Error IO: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Error Classe: " + e);
        }
    }
}

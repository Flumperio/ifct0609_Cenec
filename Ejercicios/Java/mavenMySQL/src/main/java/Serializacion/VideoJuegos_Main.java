package Serializacion;

import java.io.*;

public class VideoJuegos_Main {
    public static void main (String[] args){
        //Variables
        VideoJuegos biblioteca = new VideoJuegos(1, "StarCitizen", "2500");
                    // Serialización
        try {
            //Abrimos los objetos
            FileOutputStream file_W = new FileOutputStream("src/ficheros/videojuegos.dat");
            ObjectOutputStream archive_W = new ObjectOutputStream(file_W);
            //Ejecutamos
            archive_W.writeObject(biblioteca);
            //Cerramos los objetos
            archive_W.close();
            file_W.close();
        }catch (IOException e){
            System.out.println(("ErrorIO:" + e));
        }
                    //Deserialización
        try {
            FileInputStream file_R = new FileInputStream("src/ficheros/videojuegos.dat");
            ObjectInputStream archive_R = new ObjectInputStream(file_R);
            //ejecutamos
            VideoJuegos biblioteca_Read = (VideoJuegos) archive_R.readObject();
            System.out.println("Read: " + biblioteca_Read);
            archive_R.close();
            file_R.close();
        }catch (IOException e){
            System.out.println(("ErrorIO:" + e));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

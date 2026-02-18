package Serializacion;

import java.io.*;

public class Ejemplo1 {
    public static void main (String[] args){
                        // Seialización
        //Atributos / Variables
        Persona persona = new Persona("Carlos", "Santos");
        //Try/Catch para el uso de ficheros
        try {
            //Definición de los objetos para serializar
            FileOutputStream archivoSalida = new FileOutputStream("src/ficheros/test.dat");
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            //Escritura de los datos de la clase.
            objetoSalida.writeObject(persona);
            objetoSalida.close();
            archivoSalida.close();
        }catch (IOException e){
            System.out.println("ErrorIO: " + e);
        }

                       //DesSerialización
        try {
            //Definición de los objetos a deserializar
            FileInputStream archivoEntrada = new FileInputStream("src/ficheros/test.dat");
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
            //Escritura de los datos. Tiene que ser de la misma clase.
            Persona personaRead = (Persona) objetoEntrada.readObject();
            System.out.println(personaRead);
            archivoEntrada.close();
            objetoEntrada.close();

        } catch (IOException e){
            System.out.println("ErrorIO: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Error_Class " + e);
        }
    }
}

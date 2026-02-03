package Primeros_Pasos;

public class HolaMundo {
    public static void main (String[] args){
        String  nombre;
        int     edad;
        boolean casado;
        nombre = "Juan Carlos";
        edad = 56;
        casado = true;
        System.out.println("Hola " + nombre + " tienes: " + edad + " años");
        System.out.printf("Estas cadado ? %b",casado);
    }
}

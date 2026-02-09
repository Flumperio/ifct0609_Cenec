package Metodos;

public class MainEdades {
    public static void main(String[] args) {
        Edades edades=new Edades();
        int []edad=edades.pedirDatos();
        edades.calcular_edades(edad);
    }
}


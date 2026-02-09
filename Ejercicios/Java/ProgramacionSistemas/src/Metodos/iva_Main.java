package Metodos;

public class iva_Main {
    public static void main (String[] args) {
        //Definicón variables
        Iva iva = new Iva();
        double[] precio = iva.pedirDatos();
        iva.calculo_iva(precio);
    }
}

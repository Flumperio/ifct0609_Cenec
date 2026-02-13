package Metodos;

//Import Clases

public class Main_Calculadora {
    public static void main (String[] args){
        //Definición variables
        int [] numeros = new int [2];
        String [] menu_inicial = {"Salir", "Sumar","Restar", "Multiplicar", "Dividir", "Raiz Cuadrada"};
        Caluladora calc = new Caluladora();
        //Entrada Datos
        //Main
        calc.principal(numeros, menu_inicial);
        //Impresion
        //Cerramos clases abiertas
    }
}

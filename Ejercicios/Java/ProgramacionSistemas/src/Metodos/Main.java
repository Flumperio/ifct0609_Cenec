package Metodos;

public class Main {
    public static void main (String[] args){
        //Definición de variables
        Caluladora calc = new Caluladora();
        Impresion_Resultados impr = new Impresion_Resultados();
        int [] numeros = {10,4};
        impr.cabecera("Resultado");
        System.out.println(calc.sumar(numeros));
        System.out.println(calc.restar(numeros));
        System.out.println(calc.multiplicar(numeros));
        System.out.println(calc.dividir(numeros));
    }
}

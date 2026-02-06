package Metodos;

public class Caluladora {
    public int sumar (int [] numero){
        int resultado = 0;
        resultado = numero[1] + numero[0];
        return (resultado);
    }
    public int restar (int [] numero){
        int resultado = 0;
        resultado = numero[0] - numero[1];
        return (resultado);
    }
    public int multiplicar (int [] numero){
        int resultado = 0;
        resultado = numero[0] * numero[1];
        return (resultado);
    }
    public int dividir (int [] numero){
        int resultado = 0;
        resultado = numero[0] / numero[1];
        return (resultado);
    }
}

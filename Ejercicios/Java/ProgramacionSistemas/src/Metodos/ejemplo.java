package Metodos;

public class ejemplo {
    int numero = 0;

    public static int sumar (int [] numero){
        int resultado = 0;
        resultado = numero[1] + numero[0];
        return (resultado);
    }
    public static int restar (int [] numero){
        int resultado = 0;
        resultado = numero[0] - numero[1];
        return (resultado);
    }
    public static int multiplicar (int [] numero){
        int resultado = 0;
        resultado = numero[0] * numero[1];
        return (resultado);
    }
    public static int dividir (int [] numero){
        int resultado = 0;
        resultado = numero[0] / numero[1];
        return (resultado);
    }

    public static void main (String[] args){
        int [] numero = {10,2};
        ejemplo2 test_clase = new ejemplo2();
        System.out.println(sumar(numero));
        System.out.println(restar(numero));
        System.out.println(multiplicar(numero));
        System.out.println(dividir(numero));
        System.out.println(test_clase.iva(23));
        test_clase.saludarte("Carlos");
    }
}

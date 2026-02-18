package Colecciones;

import java.util.ArrayList;

public class Ejemplo1 {
    public static void main (String[] args){
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> ingresos = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);

        nombres.add("Alberto");
        nombres.add("Carlos");
        nombres.add("Marco");

        ingresos.add(1220.50);
        ingresos.add(2560.50);
        ingresos.add(1500.00);

        for (int cnt:lista){
            System.out.println(cnt);
        }
        for (String cnt:nombres){
            System.out.println(cnt);
        }
        for (double cnt:ingresos){
            System.out.println(cnt);
        }

        System.out.println("Lista inicial: " + lista);
        System.out.println("Tamaño lista antes de borrar: " + lista.size());
        lista.remove(1);
        System.out.println("Lista final: " + lista);
        System.out.println("Tamaño lista después de borrar: " + lista.size());

        //Contains
        String valor = "Carlos";
        if (nombres.contains(valor) == true){
            System.out.println("La posición es: " + nombres.indexOf(valor));
        }
        buscar(lista, 10);
        modificar(lista, 30, 2000);
        System.out.println(lista);

    }

    public static int buscar (ArrayList<Integer> numeros, int elementoBuscar){
        if (numeros.contains(elementoBuscar)){
            System.out.println(("El elemento: " + elementoBuscar + " se encontró en la posición: " + numeros.indexOf(elementoBuscar)));
            return numeros.indexOf(elementoBuscar);
        } else {
            System.out.println("El elemento: " + elementoBuscar +  " no se encontró.");
            return -1;
        }
    }
    public  static void modificar (ArrayList<Integer> numeros, int valorInicial, int valorFinal){
        int numBuscar = buscar(numeros, valorInicial);
        if (numBuscar >= 0){
            numeros.set(numBuscar, valorFinal);
            System.out.println("OK");
        } else {
            System.out.println("No se encontró el número ");
        }
    }
}

package Try_Catch;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            // Intentamos acceder a un elemento fuera del tamaño del array
            int valor = array[3];
            System.out.println("El valor es: " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango.");
        }
        try {
            // Intentamos convertir una cadena no numérica en un entero
            String cadena = "hola";
            int valor = Integer.parseInt(cadena);
            System.out.println("El valor es: " + valor);
        } catch (NumberFormatException e) {
            System.out.println("Error: la cadena no es un número.");
        }
        try {
            // Intentamos dividir entre cero
            int a = 10;
            int b = 0;
            int resultado1 = edad(8);
            int resultado = a / b;
            System.out.println(resultado);
            System.out.println("El resultado es: " + resultado1);
        } catch (ArithmeticException e) {
            System.out.println("Error: división entre cero. " + e.getMessage());
        }
    }

    public static int edad(int a) throws ArithmeticException {
        if (a < 18) {
            throw new ArithmeticException("Menor de edad");
        }
        return a;
    }
}



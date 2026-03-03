package JavaDoc;

/**
 * Esta clase representa una calculadora que puede realizar operaciones matemáticas básicas.
 */
public class Calculadora {

    /**
     * Suma dos números enteros.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return La suma de los dos números enteros.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return La resta de los dos números enteros.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return El producto de los dos números enteros.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros.
     *
     * @param a El dividendo.
     * @param b El divisor.
     * @return El cociente de la división.
     * @throws ArithmeticException Si se intenta dividir por cero.
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("¡No se puede dividir por cero!");
        }
        return a / b;
    }

    /**
     * Calcula el factorial de un número.
     *
     * @param n El número del cual calcular el factorial.
     * @return El factorial del número.
     * @throws IllegalArgumentException Si el número es negativo.
     */
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("¡No se puede calcular el factorial de un número negativo!");
        }
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

package Interface;

public class Calculadora implements Operaciones {
    @Override
    public int sumar(int a, int b) {
        return a + b;
    }
    @Override
    public int restar(int a, int b) {
        return a - b;
    }
    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }
    @Override
    public double dividir(int a, int b) {
        return a / b;
    }
    @Override
    public void mostrar(int a, int b) {
        System.out.println(" la suma es " + sumar(a, b));
        System.out.println(" la resta es " + restar(a, b));
        System.out.println(" la multi es " + multiplicar(a, b));
        System.out.println(" la  division es  " + dividir(a, b));
    }
}

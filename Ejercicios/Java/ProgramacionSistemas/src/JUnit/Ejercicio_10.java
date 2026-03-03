package JUnit;

public class Ejercicio_10 {
    public double calcularIVA(double precioBase, double tipoIVA) {
        return precioBase * (tipoIVA / 100);
    }
    public double calcularPrecioConIVA(double precioBase, double tipoIVA) {
        return precioBase + calcularIVA(precioBase, tipoIVA);
    }
}

package JUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio10Test {
    private Ejercicio_10 calcIVA = new Ejercicio_10();
    private final double DELTA = 0.01; // Tolerancia para decimales

    @Test
    public void test4porciento (){
        double iva = calcIVA.calcularIVA(100, 4);
        assertEquals(4.0, iva, DELTA);
    }
    @Test
    public void test10porciento (){
        double iva = calcIVA.calcularIVA(100, 10);
        assertEquals(10.0, iva, DELTA);
    }
    @Test
    public void test21porciento (){
        double iva = calcIVA.calcularIVA(100, 21);
        assertEquals(21.0, iva, DELTA);
    }
    @Test
    public void test4total (){
        double iva = calcIVA.calcularPrecioConIVA(100, 4);
        assertEquals(104.0, iva, DELTA);
    }
    @Test
    public void test10total (){
        double iva = calcIVA.calcularPrecioConIVA(100, 10);
        assertEquals(110.0, iva, DELTA);
    }
    @Test
    public void test21total (){
        double iva = calcIVA.calcularPrecioConIVA(100, 21);
        assertEquals(121.0, iva, DELTA);
    }
}

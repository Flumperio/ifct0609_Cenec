package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio1Test {

	@Test
    public void testSum() {
         assertEquals(5, Ejercicio_1.suma(2, 3));
     }
    @Test
    public void testResta() {
        assertEquals(-1, Ejercicio_1.resta(2, 3));
    }
    @Test
    public void testMulti() {
        assertEquals(6, Ejercicio_1.multi(2, 3));
    }
    @Test
    public void testDiv() {
        assertEquals(0, Ejercicio_1.division(2, 3));
    }
    @Test
    public void testPotencia() {
        assertEquals(8, Ejercicio_1.potencia(2, 3));
    }
    @Test
    public void testCuadrado() {
        assertEquals(2.8, Ejercicio_1.cuadrada(8));
    }

}

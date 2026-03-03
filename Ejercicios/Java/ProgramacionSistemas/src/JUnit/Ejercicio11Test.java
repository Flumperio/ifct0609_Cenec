package JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ejercicio11Test {
    @Test
    public void testMayorEdad(){
        Ejercicio_11 mEdad = new Ejercicio_11(19);
        boolean edad = mEdad.mayorEdad(19);
        assertTrue(edad);
    }
    @Test
    public void testMayorFalse(){
        Ejercicio_11 mEdad = new Ejercicio_11(7);
        boolean edad = mEdad.mayorEdad(7);
        assertTrue(edad);
    }
}

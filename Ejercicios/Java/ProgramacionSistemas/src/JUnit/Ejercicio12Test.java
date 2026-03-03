package JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio12Test {
    @Test
    public void testNoNull(){
        Ejercicio_12 nombre = new Ejercicio_12("Carlos");
        assertNotNull(nombre.getNombre());
    }
    @Test
    public void testNull(){
        Ejercicio_12 nombre = new Ejercicio_12("Carlos");
        assertNull(nombre.getNombre());
    }
    @Test
    public void testNoNull1(){
        Ejercicio_12 nombre = new Ejercicio_12(null);
        assertNotNull(nombre.getNombre());
    }
    @Test
    public void testNull1(){
        Ejercicio_12 nombre = new Ejercicio_12(null);
        assertNull(nombre.getNombre());
    }
}

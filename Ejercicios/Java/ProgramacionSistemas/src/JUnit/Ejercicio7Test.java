package JUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio7Test {
    @Test
    public void testNotaSuspenso() {
        Ejercicio_7 ejercicio7 = new Ejercicio_7();
        String resultado = ejercicio7.calcularNivelNota(4);
        assertEquals("Suspenso", resultado);
    }
}

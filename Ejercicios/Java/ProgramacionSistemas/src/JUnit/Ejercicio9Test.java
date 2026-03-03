package JUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertSame;

public class Ejercicio9Test {
    @Test
    public void testMismaInstancia() {
        Ejercicio_9 persona1 = new Ejercicio_9();  // Primera instancia
        Ejercicio_9 mismaPersona = persona1;   // MISMA referencia

        assertSame(persona1, mismaPersona);
    }

    @Test
    public void testDiferentesInstancias() {
        Ejercicio_9 persona1 = new Ejercicio_9();
        Ejercicio_9 persona2 = new Ejercicio_9();  // NUEVA instancia

        assertSame(persona1, persona2); // ¡FALLA!
    }
}

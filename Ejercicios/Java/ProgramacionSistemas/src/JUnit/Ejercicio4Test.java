package JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio4Test {

    @Test
    void test() {
        Ejercicio_4 personas = new Ejercicio_4();

        String[] nombresEsperados = {"Alberto", "Paco", "Cristina"};

        String[] nombresObtenidos = personas.getNombres();

        assertArrayEquals(nombresEsperados, nombresObtenidos);

    }
}

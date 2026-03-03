package JUnit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Ejercicio5Test {
    @Test
    public void testArrayAsignaturas() {
        // Array esperado (el del enunciado)
        String[] arrayEsperado = {
                "Lenguaje de Marcas",
                "entorno",
                "sistemas",
                "programación",
                "base de datos"
        };

        // Array obtenido del método
        Ejercicio_5 gestor = new Ejercicio_5();
        String[] arrayObtenido = gestor.obtenerAsignaturas();

        // Comprobación exacta del array
        assertArrayEquals(arrayEsperado, arrayObtenido);
    }
}

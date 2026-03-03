package JUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Ejercicio8Test {
    @Test
    public void  testUsuarioNulo() {
        Ejercicio_8 validar = new Ejercicio_8();
        boolean resultado = validar.validarCredenciales(null, "pas123");
        assertFalse(resultado);
    }
    @Test
    public void  testPassNulo() {
        Ejercicio_8 validar = new Ejercicio_8();
        boolean resultado = validar.validarCredenciales("USER", null);
        assertFalse(resultado);
    }
    @Test
    public void  testCredencialesOK() {
        Ejercicio_8 validar = new Ejercicio_8();
        boolean resultado = validar.validarCredenciales("USER", "Pass123");
        assertTrue(resultado);
    }
}

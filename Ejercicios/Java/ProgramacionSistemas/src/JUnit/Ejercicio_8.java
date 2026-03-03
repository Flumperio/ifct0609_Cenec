package JUnit;

public class Ejercicio_8 {
    public boolean validarCredenciales(String usuario, String contrasena) {
        if (usuario == null || contrasena == null) {
            return false;
        }
        // Aquí irían más validaciones (longitud, formato, etc.)
        return true;
    }
}

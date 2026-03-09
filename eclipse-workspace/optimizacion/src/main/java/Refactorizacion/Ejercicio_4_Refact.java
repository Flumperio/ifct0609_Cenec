package Refactorizacion;

public class Ejercicio_4_Refact {
    public static class ClaseOrigen {
        public void metodoOrigen() {
        }
        // El método se movió manualmente sin actualizar referencias
    }

    public class ClaseDestino {
        public void métodoDestino() {
            System.out.println("Este es el método de la clase de origen");
        }

        public static void main(String[] args) {
            ClaseOrigen origen = new ClaseOrigen();
            origen.metodoOrigen();  // Esta llamada ahora falla (método no existe)
        }
    }
}

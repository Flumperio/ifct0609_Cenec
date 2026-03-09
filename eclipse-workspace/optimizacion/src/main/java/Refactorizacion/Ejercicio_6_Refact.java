package Refactorizacion;

public class Ejercicio_6_Refact {

    // Clase abstracta Vehiculo
    abstract class Vehiculo {
        protected int velocidad;

        public Vehiculo(int velocidad) {
            this.velocidad = velocidad;
        }

        public abstract void acelerar();
    }

    // Subclase Coche
    class Coche extends Vehiculo {
        public Coche(int velocidad) {
            super(velocidad);
        }

        @Override
        public void acelerar() {
            velocidad += 10;
            System.out.println("El coche ha sido acelerado. Velocidad actual: " + velocidad);
        }
    }

    // Clase Conductor (refactorizada para usar Coche directamente)
    class Conductor {
        private Coche coche; // Ahora almacena un Coche en lugar de un Vehiculo

        public Conductor(Coche coche) {
            this.coche = coche;
        }

        public void acelerarVehiculo() {
            coche.acelerar(); // Se llama directamente al método de Coche
        }
    }

    // Clase principal con el método main
    public class Main {
        public void main(String[] args) {
            Coche coche = new Coche(0); // Ahora se usa Coche en lugar de Vehiculo
            Conductor conductor = new Conductor(coche);
            conductor.acelerarVehiculo();
        }
    }
}


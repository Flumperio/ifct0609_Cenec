package Refactorizacion;

public class Ejercicio_6 {
    public void main(String[] args) {
        Vehiculo coche = new Coche(0); // Se usa el tipo Vehiculo
        Conductor conductor = new Conductor(coche);
        conductor.acelerarVehiculo();
    }

    // Clase abstracta Vehiculo
    abstract class Vehiculo {
        protected int velocidad;

        public Vehiculo(int velocidad) {
            this.velocidad = velocidad;
        }
        public abstract void acelerar();
    }
    // Subclase Coche que extiende Vehiculo
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
    // Clase Conductor con una referencia a Vehiculo (sin refactorizar)
    class Conductor {
        private Vehiculo vehiculo;

        public Conductor(Vehiculo vehiculo) {
            this.vehiculo = vehiculo;
        }
        public void acelerarVehiculo() {
            vehiculo.acelerar();
        }
    }
}

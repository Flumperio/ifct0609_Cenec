package Refactorizacion;

public class Ejercicio_5_Refact {

        static class Nombre {
        private String nombre;
        public Nombre(String nombre){
            this.nombre = nombre;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

        static class Edad {
        private int edad;
        public Edad(int edad){
            this.edad = edad;
        }
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
    }

    public static class Persona {
        private Nombre nombre;
        private Edad edad;

        public Persona(Nombre nome, Edad edad) {
            this.nombre = nome;
            this.edad = edad;
        }
        public void mostrarDetalles() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
        }
        public static void main(String[] args) {
            Persona persona = new Persona(new Nombre("Juan"), new Edad(25));
            persona.mostrarDetalles();
        }
    }
}

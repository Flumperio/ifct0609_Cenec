public class Ejercicio_1_Main {
    static class Persona {
        //Atributos
        private String nombre;
        private int edad;
        //Constructor
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        //Metodos
        public void mostrarDatos (){
            System.out.println( "Persona{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    '}');
        }

    }
    //Main
    public static void main (String[] args){
        //Variables
        Persona humano = new Persona("Carlos", 56);
        humano.mostrarDatos();
    }
}

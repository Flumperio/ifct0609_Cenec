public class Ejercicio_13_Main {
    static class Mascota {
        //Atributos
        private String nombre;
        private String especie;
        private int edad;

        //Constructor
        public Mascota(String nombre, String especie, int edad) {
            this.nombre = nombre;
            this.especie = especie;
            this.edad = edad;
        }

        //Metodos
        public void cumplirAnios() {
            edad++;
            System.out.println(nombre + " ha cumplido un año más! 🎉 Ahora tiene " + edad + " años");
        }

        public void mostrarInfo() {
            System.out.println("--------------------");
            System.out.println("Mascota:\n" +
                    "Nombre=" + nombre +
                    "\nEspecie=" + especie +
                    "\nEdad=" + edad + " años");
            System.out.println("--------------------");
        }
    }

    //Main
    public static void main (String[] args){
        //Variables
        Mascota chachyquesi = new Mascota("ChachiQueSi", "cebra", 3);

        //Programa
        chachyquesi.mostrarInfo();
        chachyquesi.cumplirAnios();
        chachyquesi.cumplirAnios();
        chachyquesi.mostrarInfo();
    }
}

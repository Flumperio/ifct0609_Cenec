public class Ejercicio_7_Main {
    static class Animal {
        //Atributos
        private String nombre;
        private String tipo;

        //Constructor
        public Animal(String nombre, String tipo) {
            this.nombre = nombre;
            this.tipo = tipo;
        }

        //Metodos
        public void hacerSonido() {
            System.out.println("--------------------");
            System.out.println( nombre + " hace: " + tipo);
            System.out.println("--------------------");
        }
    }

    //Main
    public static void main (String[] args){
        //Variables
        Animal perro = new Animal("EL Perro", "grrrrrr");
        Animal gato = new Animal("El Gato", "miauuuuuu");
        Animal vaca = new Animal("La Vaca Retinta", "hamburguesitas en los hermanos(Conil).");

        //Programa
        perro.hacerSonido();
        gato.hacerSonido();
        vaca.hacerSonido();
    }
}

public class Ejercicio_16_Main {
    static class Guitarra {
        //Atributos
        private String marca;
        private int cuerdas;
        private String tipo;

        //Constructor
        public Guitarra(String marca, int cuerdas, String tipo) {
            this.marca = marca;
            this.cuerdas = cuerdas;
            this.tipo = tipo;
        }

        //Metodos
        public void afinar() {
            System.out.println("Afinando la " + marca + " " + tipo + "... ¡Listo para el solo!");
        }

        public void tocar() {
            System.out.println("¡Tocando la " + marca + " " + tipo + " con " + cuerdas + " cuerdas!");
            System.out.println("🎸🎵 ¡Subidón En Verdá! 🎵🎸");
        }

        public void mostrarInfo() {
            System.out.println("--------------------");
            System.out.println("Guitarra:\n" +
                    "Marca=" + marca +
                    "\nCuerdas=" + cuerdas +
                    "\nTipo=" + tipo);
            System.out.println("--------------------");
        }
    }

    //Main
    public static void main (String[] args){
        //Variables
        Guitarra fender = new Guitarra("Fender", 6, "Stratocaster");

        //Programa
        fender.mostrarInfo();
        fender.afinar();
        fender.tocar();
    }
}

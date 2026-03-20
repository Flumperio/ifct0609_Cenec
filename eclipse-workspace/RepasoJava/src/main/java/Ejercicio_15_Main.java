public class Ejercicio_15_Main {
    static class Pelicula {
        //Atributos
        private String titulo;
        private String director;
        private int duracion;
        //Constructor
        public Pelicula(String titulo, String director, int duracion) {
            this.titulo = titulo;
            this.director = director;
            this.duracion = duracion;
        }
        //Metodos
        public boolean esLarga() {
            return duracion > 120;
        }
        public void mostrarInfo() {
            System.out.println("--------------------");
            System.out.println("Película:\n" +
                    "Título=" + titulo +
                    "\nDirector=" + director +
                    "\nDuración=" + duracion + " min");
            if (esLarga()) {
                System.out.println("¡ES LARGA! Más de 2 horas. Si es española ni la veas.");
            } else {
                System.out.println("Película normal");
            }
            System.out.println("--------------------");
        }
    }
    //Main
    public static void main (String[] args){
        //Variables
        Pelicula corta = new Pelicula("Inception", "Nolan", 118);
        Pelicula normal = new Pelicula("Titanic", "Cameron", 195);
        //Programa
        corta.mostrarInfo();
        normal.mostrarInfo();
    }
}

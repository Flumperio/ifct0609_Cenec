public class Ejercicio_6_Main {
    static class Libro {
        //Atributos
        private String titulo;
        private String autor;
        private int paginas;
        //Constructor
        public Libro(String titulo, String autor, int paginas) {
            this.titulo = titulo;
            this.autor = autor;
            this.paginas = paginas;
        }
        //Metodos
        public void mostrarInfo() {
            System.out.println("--------------------");
            System.out.println("Libro:\n" +
                    "Título=" + titulo +
                    "\nAutor=" + autor +
                    "\nPáginas=" + paginas);
            System.out.println("--------------------");
        }
    }
    //Main
    public static void main (String[] args){
        //Variables
        Libro libro1 = new Libro("Don Quijote", "Miguel de Cervantes", 1202);
        Libro libro2 = new Libro("1984", "George Orwell", 1368);

        //Programa
        libro1.mostrarInfo();
        libro2.mostrarInfo();
    }
}

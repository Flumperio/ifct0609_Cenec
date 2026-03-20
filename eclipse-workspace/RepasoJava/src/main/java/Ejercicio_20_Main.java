import java.util.ArrayList;

public class Ejercicio_20_Main {
    static class Libro {
        //Atributos
        private String titulo;
        private String autor;
        private boolean disponible;

        //Constructor
        public Libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
            this.disponible = true;  // Todos empiezan disponibles
        }

        //Metodos
        public void prestar() {
            if (disponible) {
                disponible = false;
                System.out.println("✅ " + titulo + " prestado. ¡A leer!");
            } else {
                System.out.println("❌ " + titulo + " ya está prestado");
            }
        }

        public void devolver() {
            if (!disponible) {
                disponible = true;
                System.out.println("✅ " + titulo + " devuelto. Listo para nuevo lector");
            } else {
                System.out.println("ℹ️ " + titulo + " ya estaba disponible");
            }
        }

        public void mostrarEstado() {
            System.out.println("  " + titulo + " (" + autor + ") - " +
                    (disponible ? "🟢 Disponible" : "🔴 Prestado"));
        }

        public String getTitulo() {
            return titulo;
        }
    }

    static class Biblioteca {
        //Atributos
        private ArrayList<Libro> libros = new ArrayList<>();

        //Constructor
        public Biblioteca() {
            // Se irá llenando con libros creados
        }

        //Metodos
        public void agregarLibro(Libro libro) {
            libros.add(libro);
        }

        public void mostrarBiblioteca() {
            System.out.println("--------------------");
            System.out.println("📚 BIBLIOTECA");
            if (libros.isEmpty()) {
                System.out.println("  La biblioteca está más vacía que la Fábrica a fin de mes...");
            } else {
                for (Libro libro : libros) {
                    libro.mostrarEstado();
                }
            }
            System.out.println("--------------------");
        }
    }

    //Main
    public static void main (String[] args){
        //Variables
        Biblioteca biblio = new Biblioteca();
        Libro libro1 = new Libro("Don Quijote", "Cervantes");
        Libro libro2 = new Libro("1984", "Orwell");
        Libro libro3 = new Libro("El Alquimista", "Coelho");

        //Programa
        biblio.agregarLibro(libro1);
        biblio.agregarLibro(libro2);
        biblio.agregarLibro(libro3);

        System.out.println("Estado inicial:");
        biblio.mostrarBiblioteca();

        libro1.prestar();
        libro2.prestar();
        libro3.prestar();  // Todos prestados

        System.out.println("\nTras préstamos:");
        biblio.mostrarBiblioteca();

        libro1.devolver();
        System.out.println("\nTras devolver Quijote:");
        biblio.mostrarBiblioteca();
    }
}

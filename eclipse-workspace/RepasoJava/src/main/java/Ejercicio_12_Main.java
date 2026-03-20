public class Ejercicio_12_Main {
    static class Videojuego {
        //Atributos
        private String titulo;
        private String plataforma;
        private int horasJugadas;
        //Constructor
        public Videojuego(String titulo, String plataforma, int horasIniciales) {
            this.titulo = titulo;
            this.plataforma = plataforma;
            this.horasJugadas = horasIniciales;
        }
        //Metodos
        public void jugar(int horas) {
            if (horas > 0) {
                horasJugadas += horas;
                System.out.println("¡Jugando " + horas + "h más a " + titulo + "! Total: " + horasJugadas + "h");
            } else {
                System.out.println("No se puede desjugar. Retardao");
            }
        }
        public void mostrarInfo() {
            System.out.println("--------------------");
            System.out.println("Videojuego:\n" +
                    "Título=" + titulo +
                    "\nPlataforma=" + plataforma +
                    "\nHoras jugadas=" + horasJugadas);
            System.out.println("--------------------");
        }
    }

    //Main
    public static void main (String[] args){
        //Variables
        Videojuego zelda = new Videojuego("Star Citizen", "PC en verdá", 120);

        //Programa
        zelda.mostrarInfo();
        zelda.jugar(15);
        zelda.jugar(8);
        zelda.mostrarInfo();
    }
}

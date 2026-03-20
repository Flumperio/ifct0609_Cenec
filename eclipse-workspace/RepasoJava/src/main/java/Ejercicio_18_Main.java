import java.util.ArrayList;

public class Ejercicio_18_Main {
    static class Equipo {
        //Atributos
        private String nombreEquipo;
        private ArrayList<Jugador> jugadores = new ArrayList<>();

        //Constructor
        public Equipo(String nombreEquipo) {
            this.nombreEquipo = nombreEquipo;
        }
        //Metodos
        public void agregarJugador (Jugador nombreJugador){
            jugadores.add(nombreJugador);
        }
        public void mostrarEquipo() {
            System.out.println("--------------------");
            System.out.println("Equipo: " + nombreEquipo);
            System.out.println("Jugadores:");
            if (jugadores.isEmpty()) {
                System.out.println("  Aquí no juega ni el Tato...");
            } else {
                for (Jugador cnt : jugadores) {
                    System.out.println(cnt.getNombre());
                }
            }
            System.out.println("--------------------");
        }
    }
    static class Jugador {
        //Atributos
        private String nombre;
        private int dorsal;
        private Equipo equipo;
        //Constructor
        public Jugador(String nombre, int dorsal, Equipo equipo) {
            this.nombre = nombre;
            this.dorsal = dorsal;
            this.equipo = equipo;
            this.equipo.agregarJugador(this);
        }
        //Metodos

        public String getNombre() {
            return nombre;
        }
        public void mostrarInfo() {

            System.out.println("  Jugador: " + nombre + " - Dorsal #" + dorsal);
        }
    }


    //Main
    public static void main (String[] args){
        //Variables
        Equipo CojasDesacarriadas = new Equipo("CojasDescarriadas");
        Jugador j1 = new Jugador("Isabel Maria", 10, CojasDesacarriadas);
        Jugador j2 = new Jugador("Jacinta", 7, CojasDesacarriadas);
        Jugador j3 = new Jugador("Rita the Singer", 9, CojasDesacarriadas);

        //Programa
        CojasDesacarriadas.mostrarEquipo();
    }
}

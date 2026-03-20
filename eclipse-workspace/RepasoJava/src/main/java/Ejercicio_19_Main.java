import java.util.ArrayList;

public class Ejercicio_19_Main {
    static class Instituto {
        //Atributos
        private String nombreInstituto;
        private ArrayList<Profesor> profesores = new ArrayList<>();
        //Constructor
        public Instituto(String nombreInstituto) {
            this.nombreInstituto = nombreInstituto;
        }
        //Metodos
        public void agregarProfesor(Profesor profesor) {
            profesores.add(profesor);
        }

        public void mostrarInstituto() {
            System.out.println("--------------------");
            System.out.println("Instituto: " + nombreInstituto);
            System.out.println("Profesores:");
            if (profesores.isEmpty()) {
                System.out.println("  Aquí no da clase ni el bedel...");
            } else {
                for (Profesor prof : profesores) {
                    System.out.println("  " + prof.getNombre() + " - " + prof.getModulo());
                }
            }
            System.out.println("--------------------");
        }
    }

    static class Profesor {
        //Atributos
        private String nombre;
        private String modulo;
        private Instituto instituto;

        //Constructor
        public Profesor(String nombre, String modulo, Instituto instituto) {
            this.nombre = nombre;
            this.modulo = modulo;
            this.instituto = instituto;
            this.instituto.agregarProfesor(this);
        }

        //Metodos
        public String getNombre() {
            return nombre;
        }

        public String getModulo() {
            return modulo;
        }
    }

    //Main
    public static void main (String[] args){
        //Variables
        Instituto IES_Polvorilla = new Instituto("IES Sagrado Despojo");
        Profesor p1 = new Profesor("Paco", "Fanega y otras unidades de medida", IES_Polvorilla);
        Profesor p2 = new Profesor("Alfonso", "Tu te lo curras y Yo te lo levanto", IES_Polvorilla);

        //Programa
        IES_Polvorilla.mostrarInstituto();
    }
}

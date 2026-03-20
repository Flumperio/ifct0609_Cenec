public class Ejercicio_11_Main {
    static class Asignatura {
        //Atributos
        private String nombre;
        private String profesor;
        private int horasSemanales;
        //Constructor
        public Asignatura(String nombre, String profesor, int horasSemanales) {
            this.nombre = nombre;
            this.profesor = profesor;
            this.horasSemanales = horasSemanales;
        }
        //Getters
        public String getNombre() {
            return nombre;
        }
        public String getProfesor() {
            return profesor;
        }
        public int getHorasSemanales() {
            return horasSemanales;
        }
        //Setters
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setProfesor(String profesor) {
            this.profesor = profesor;
        }
        public void setHorasSemanales(int horasSemanales) {
            this.horasSemanales = horasSemanales;
        }
        //Metodos
        public void mostrarAsignatura() {
            System.out.println("--------------------");
            System.out.println("Asignatura:\n" +
                    "Nombre=" + nombre +
                    "\nProfesor=" + profesor +
                    "\nHoras semanales=" + horasSemanales);
            System.out.println("--------------------");
        }
    }

    //Main
    public static void main (String[] args){
        //Variables
        Asignatura prog = new Asignatura("Programación", "Juan García", 6);
        Asignatura bbdd = new Asignatura("Bases de Datos", "Laura Pérez", 4);
        //Programa
        prog.mostrarAsignatura();
        //Con getters
        System.out.println("La asignatura de: " + prog.getNombre() +
                " la imparte: " + prog.getProfesor() +
                " con un total de: " + prog.getHorasSemanales() + " horas semanales. ");
        //Modificamos on setters.
        bbdd.mostrarAsignatura();
        bbdd.setHorasSemanales(100);
        System.out.println("La asignatura de: " + bbdd.getNombre() +
                " la imparte: " + bbdd.getProfesor() +
                " con una modificación de: " + bbdd.getHorasSemanales() + " horas semanales. ");
    }
}

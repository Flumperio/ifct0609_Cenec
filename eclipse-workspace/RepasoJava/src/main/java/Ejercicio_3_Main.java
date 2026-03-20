public class Ejercicio_3_Main {
    static class Alumno {
        //Atributos
        private String nombre;
        private double nota1;
        private double nota2;

        //Constructor
        public Alumno(String nombre, double nota1, double nota2) {
            this.nombre = nombre;
            this.nota1 = nota1;
            this.nota2 = nota2;
        }

        //Metodos
        public double calcularMedia() {
            return (nota1 + nota2) / 2;
        }

        public void mostrarMedia() {
            System.out.println("La media de " + nombre + " es: " + calcularMedia());
        }
    }

    //Main
    public static void main (String[] args){
        //Variables
        Alumno alumno = new Alumno("Ana", 8.5, 7.0);
        alumno.mostrarMedia();
    }
}

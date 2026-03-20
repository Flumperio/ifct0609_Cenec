public class Ejercicio_2_Main {
    static class Coche {
        //Atributos
        private String marca;
        private String modelo;
        private String color;
        //Constructor
        public Coche(String marca, String modelo, String color) {
            this.marca = marca;
            this.modelo = modelo;
            this.color = color;
        }
        //Metodos
        public void arrancar() {
            System.out.println("El " + marca + " " + modelo + " " + color + " ha arrancado");
        }
    }
    //Main
    public static void main (String[] args){
        //Variables
        Coche coche1 = new Coche("Toyota", "Corolla", "rojo");
        Coche coche2 = new Coche("Ford", "Focus", "azul");

        coche1.arrancar();
        coche2.arrancar();
    }
}

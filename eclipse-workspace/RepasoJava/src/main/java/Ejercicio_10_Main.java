public class Ejercicio_10_Main {
    static class Movil {
        //Atributos
        private String marca;
        private String modelo;
        private int bateria;

        //Constructor
        public Movil(String marca, String modelo, int bateriaInicial) {
            this.marca = marca;
            this.modelo = modelo;
            this.bateria = bateriaInicial;
        }

        //Metodos
        public void cargar(int cantidad) {
            if (cantidad > 0 && (cantidad + bateria)<100) {
                System.out.println("¡Cargando " + cantidad + "%! Batería ahora al " + bateria + "%");
            } else {
                System.out.println("Me vas a rebentar la bateria!");
            }
        }

        public void usar(int cantidad) {
            if (cantidad > 0 && cantidad <= bateria) {
                bateria -= cantidad;
                System.out.println("Has gastado " + cantidad + "%. Batería restante: " + bateria + "%");
            } else {
                System.out.println("¡Oye! Solo tienes un " + bateria + "%. No puedes gastar " + cantidad + "%. No es un Apple.");
            }
        }

        public void mostrarEstado() {
            System.out.println("--------------------");
            System.out.println("Móvil:\n" +
                    "Marca=" + marca +
                    "\nModelo=" + modelo +
                    "\nBatería=" + bateria + "%");
            System.out.println("--------------------");
        }
    }

    //Main
    public static void main (String[] args){
        //Variables
        Movil samsung = new Movil("Samsung", "Galaxy S23", 50);

        //Programa
        samsung.mostrarEstado();
        samsung.cargar(20);     // Intentará cargar al 100%
        samsung.usar(30);
        samsung.usar(80);       // Prueba insuficiente
        samsung.mostrarEstado();
    }
}

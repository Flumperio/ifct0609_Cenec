public class Ejercicio_9_Main {
    static class Producto {
        //Atributos
        private String nombre;
        private double precio;
        private int cantidad;
        //Constructor
        public Producto(String nombre, double precio, int cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }
        //Metodos
        public double calcularValorAlmacen() {
            return precio * cantidad;
        }
        public void mostrarInfo() {
            System.out.println("--------------------");
            System.out.println("Producto:\n" +
                    "Nombre=" + nombre +
                    "\nPrecio=" + precio + "€" +
                    "\nCantidad=" + cantidad +
                    "\nValor Total=" + calcularValorAlmacen() + "€");
            System.out.println("--------------------");
        }
    }
    //Main
    public static void main (String[] args){
        //Variables
        Producto lapiz = new Producto("Brugal", 25.50, 20);
        Producto cuaderno = new Producto("Jack Daniels", 39.90, 50);
        Producto boli = new Producto("Nordés", 32.20, 75);
        //Programa
        lapiz.mostrarInfo();
        cuaderno.mostrarInfo();
        boli.mostrarInfo();
    }
}

public class Ejercicio_17_Main {
    static class Cliente {
        //Atributos
        private String nombre;
        private String email;
        //Constructor
        public Cliente(String nombre, String email) {
            this.nombre = nombre;
            this.email = email;
        }
        //Metodos
        public void mostrarInfo() {
            System.out.println("--------------------");
            System.out.println("Cliente:\n" +
                    "Nombre = " + nombre +
                    "\nEmail = " + email);
            System.out.println("--------------------");
        }
    }
    static class Compra {
        //Atributos
        private String producto;
        private double precio;

        //Constructor
        public Compra(String producto, double precio) {
            this.producto = producto;
            this.precio = precio;
        }
        //Metodos
        public void mostrarInfo() {
            System.out.println("--------------------");
            System.out.println("Compra:\n" +
                    "Producto = " + producto +
                    "\nPrecio = " + precio + "€");
            System.out.println("--------------------");
        }
    }
    //Main
    public static void main (String[] args){
        //Variables
        Cliente cliente = new Cliente("María García", "maria@email.com");
        Compra compra = new Compra("Smartphone Samsung", 599.99);
        //Programa
        cliente.mostrarInfo();
        compra.mostrarInfo();
    }
}

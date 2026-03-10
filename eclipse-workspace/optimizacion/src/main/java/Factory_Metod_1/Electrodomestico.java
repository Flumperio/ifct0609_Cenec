package Factory_Metod_1;
// Implementación de productos concretos: electrodomésticos
    class Electrodomestico implements Producto {
        @Override
        public void venta() {
            System.out.println("Venta de electrodoméstico.");
        }
}

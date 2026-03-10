package Factory_Metod_1;

// Implementación de productos concretos: ropa
class Ropa implements Producto {
    @Override
    public void venta() {
        System.out.println("Venta de ropa.");
    }
}
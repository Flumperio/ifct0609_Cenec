package Factory_Metod_1;

// Implementación de fábrica para ropa
class FabricaRopa extends Fabrica {
    @Override
    public Producto crearProducto() {
        return new Ropa();
    }
}

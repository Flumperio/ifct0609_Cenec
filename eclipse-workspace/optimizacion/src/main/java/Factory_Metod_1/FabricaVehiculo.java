package Factory_Metod_1;

class FabricaVehiculo extends Fabrica{
    @Override
    public Producto crearProducto() {
        return new Vehiculo();
    }
}

package Observer_Method_1;

class BarraEstado implements Observer {
    //Atributo para mantener una referencia al sistema de venta
    private SistemaVentaProductos sistemaVentaProductos;
    //Constructor toma parámetro el sistema de venta
    public BarraEstado (SistemaVentaProductos sistemaVentaProductos){
        //Se guarda una referencia al sistema de venta
        this.sistemaVentaProductos = sistemaVentaProductos;
        //Se agrega esta instancia como observador al sistema
        this.sistemaVentaProductos.agregarObservador(this);
    }
    //Metodo de la interfaz Observer que se llama cuando se actualiza el estado
    public void actualizar(int cantidadVendida){
        //Se imprime un mensaje indicando que se vendio un producto.
        System.out.println("Se vendió un producto. Total de ventas: " + cantidadVendida);
    }
}

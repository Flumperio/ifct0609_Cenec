package MVC_MySQL;


public class Main {
    public static void main (String[] args){
        ClientesVista vistaC = new ClientesVista();
        ClienteControlador controladorC = new ClienteControlador(vistaC);
        ProductosVista vistaPD = new ProductosVista();
        ProductoControlador controladorPD =  new ProductoControlador(vistaPD);
        ProveedoresVista vistaPV = new ProveedoresVista();
        ProveedorControlador controladorPV = new ProveedorControlador(vistaPV);
        //Main
        //Carga clientes
        controladorC.cargarClientes();
        controladorC.mostrarClientes();
        //Carga Productos
        controladorPD.cargarProductos();
        controladorPD.mostrarProductos();
        //Carga Proveedores
        controladorPV.cargaProveedores();
        controladorPV.mostrarProveedor();
    }
}

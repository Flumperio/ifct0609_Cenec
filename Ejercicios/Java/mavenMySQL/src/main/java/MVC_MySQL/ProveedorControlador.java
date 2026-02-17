package MVC_MySQL;

import java.sql.*;
import java.util.ArrayList;

public class ProveedorControlador {
    //Atributos
    Connection conn = null;
    private ArrayList<Proveedores> listaProveedor = new ArrayList<>();
    private ProveedoresVista vista;
    //Constructor - Incialización conexión
    public ProveedorControlador(ProveedoresVista vista){
        this.vista = vista;
        //Conecrtamos con la DDBB
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/empresa1",
                    "dev",
                    "password");
            System.out.println("Conexión correcta.");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
    //Metodos
    //Carga de los proveedores
    public void cargaProveedores() {
        String sql_command = "SELECT * FROM proveedores";
        try (PreparedStatement prepare_st = conn.prepareStatement(sql_command);
             ResultSet resul_set = prepare_st.executeQuery()) {
            while (resul_set.next()) {
                Proveedores prov = new Proveedores(
                        resul_set.getInt("id"),
                        resul_set.getString("nombre"),
                        resul_set.getString("telefono"),
                        resul_set.getString("email")
                );
                listaProveedor.add(prov);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
    public void mostrarProveedor(){
        vista.mostrarProveedores(listaProveedor);
    }
}

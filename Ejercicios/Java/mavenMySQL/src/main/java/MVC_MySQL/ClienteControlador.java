package MVC_MySQL;

import java.sql.*;
import java.util.ArrayList;

public class ClienteControlador {
    //Atributos
    Connection conn = null;
    private ArrayList<Cliente> listaClientes;
    private ClientesVista vista;
    //Constructor
    public ClienteControlador(ClientesVista vista){
        this.vista = vista;
        listaClientes =  new ArrayList<>(); //Inicializamos el ArrayList para los clientes.
        try{
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/empresa1",
                    "dev",
                    "password");
            System.out.println("Conexión correcta.");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    //Metodos
    public void cargarClientes() {
        String sql = "SELECT * FROM clientes";
        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()){
            //aqui estamos creando un objeto por cada registro.
            while (rs.next()) {
                Cliente c = new Cliente(
                        rs.getInt("id"),
                        rs.getString("nif"),
                        rs.getString("nombre"),
                        rs.getInt("edad")
                );
                //cada objeto nuevo lo añadimos a listaclientes
                listaClientes.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void mostrarClientes() {
        vista.mostrarClientes(listaClientes);
    }
}

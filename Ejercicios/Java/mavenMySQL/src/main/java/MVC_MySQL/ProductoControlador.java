package MVC_MySQL;

import java.sql.*;
import java.util.ArrayList;

public class ProductoControlador {
    //Atributos
    Connection conn = null;
    private ArrayList<Productos> listaProductos;
    private ProductosVista vista;
    //Consturctor - Acceso a la DDBB
    public ProductoControlador(ProductosVista vista){
        this.vista = vista;
        listaProductos =  new ArrayList<>(); //Inicializamos el array para los productos.
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
    public void cargarProductos(){
        String sql_command = "SELECT * FROM productos";
        try(PreparedStatement prepare_st = conn.prepareStatement(sql_command);
            ResultSet resul_set = prepare_st.executeQuery()){
            //Creamos un objeto de Productos por cada linea de la DDBB
            while (resul_set.next()){
                Productos pro = new Productos(
                        resul_set.getInt("id"),
                        resul_set.getString("nombre"),
                        resul_set.getDouble("precio")
                );
                //Añadimos el objeto a lista de objetos
                listaProductos.add(pro);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
    public void mostrarProductos(){ vista.mostrarProductos( listaProductos);}
}

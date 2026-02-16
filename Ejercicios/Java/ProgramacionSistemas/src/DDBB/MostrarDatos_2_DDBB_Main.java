package DDBB;

import java.sql.*;

public class MostrarDatos_2_DDBB_Main {
    public static void main (String[] args){
        Connection conn = null;
        Statement stmt = null;
        String result_sql = "SELECT * FROM ";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa1", "dev", "password");
            if (conn != null){
                System.out.println("Conexión OK.");
            }

            stmt=conn.createStatement();

            ResultSet result = stmt.executeQuery(result_sql + "proveedores");

            while (result.next()){
                int id = result.getInt("id");
                String nombre = result.getString("nombre");
                String telefono = result.getString("telefono");
                String email = result.getString("email");
                System.out.println("ID: " + id + "\nNombre: " + nombre + "\nTelefono: " + telefono +
                        "\neMail: " + email);
            }
            result.close();
            ResultSet result1 = stmt.executeQuery(result_sql + "productos");

            while (result1.next()){
                int id = result1.getInt("id");
                String nombre = result1.getString("nombre");
                String precio = result1.getString("precio");
                System.out.println("ID: " + id + "\nNombre: " + nombre + "\nPrecio: " + precio);
            }
            result1.close();
            conn.close();
            stmt.close();
        }
        catch (SQLException e){
            System.out.println("Error en la conexión: " + e.getMessage());
        }
    }
}

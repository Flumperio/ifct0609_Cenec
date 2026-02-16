package DDBB;

import java.sql.*;

public class MostrarDatosDDBB_Main {
    public static void main (String[] args){
        Connection conn = null;
        Statement stmt = null;
        String sql = "SELECT * FROM clientes";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa1", "dev", "password");
            if (conn != null){
                System.out.println("Conexión OK.");
            }

            stmt=conn.createStatement();

            ResultSet result = stmt.executeQuery(sql);

            while (result.next()){
                int id = result.getInt("id");
                String nif = result.getString("nif");
                String nombre = result.getString("nombre");
                String edad = result.getString("edad");
                System.out.println("ID: " + id + "\nNIF: " + nif + "\nNombre: " + nombre +
                        "\nEdad: " + edad);
            }
            result.close();
            conn.close();
            stmt.close();
        }
        catch (SQLException e){
            System.out.println("Error en la conexión: " + e.getMessage());
        }
    }
}

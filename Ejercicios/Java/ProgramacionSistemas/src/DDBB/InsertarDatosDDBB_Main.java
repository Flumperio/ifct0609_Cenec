package DDBB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarDatosDDBB_Main {
    public static void main (String[] args){
        Connection conn = null;
        Statement stmt = null;
        String sql = "INSERT INTO clientes (id, nif, nombre, edad)" +
                " VALUES (1, 11111, 'Juan Carlos', '40')";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa1", "dev", "password");

            if (conn != null){
                System.out.println("Conexión OK.");
            }
            stmt=conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Datos insertados OK.");
            conn.close();
            stmt.close();
        }
        catch (SQLException e){
            System.out.println("Error en la conexión: " + e.getMessage());
        }
    }
}

package DDBB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTablaDDBB_Main {
    public static void main (String[] args){
        Connection conn = null;
        Statement stmt = null;
        String sql = "CREATE TABLE clientes (id INT PRIMARY KEY,"
                + "nif VARCHAR(10) NOT NULL,"
                + "nombre VARCHAR(60) NOT NULL,"
                + "edad VARCHAR(2))";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa1", "dev", "password");

            if (conn != null){
                System.out.println("Conexión OK.");
            }
            stmt=conn.createStatement();
            stmt.execute(sql);
            conn.close();
            stmt.close();
        }
        catch (SQLException e){
            System.out.println("Error en la conexión: " + e.getMessage());
        }
    }
}

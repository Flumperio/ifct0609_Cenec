package DDBB_Statement.DDBB;

import java.sql.*;

public class CrearTablaDDBB_Main {
    public static void main (String[] args){
        Connection conn = null;
        PreparedStatement stmt = null;
        String sql = "CREATE TABLE IF NOT EXISTS clientes (id INT PRIMARY KEY,"
                + "nif VARCHAR(10) NOT NULL,"
                + "nombre VARCHAR(60) NOT NULL,"
                + "edad VARCHAR(2))";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa2", "dev", "password");

            if (conn != null){
                System.out.println("Conexión OK.");
            }
            stmt=conn.prepareStatement(sql);
            stmt.execute(sql);
            conn.close();
            stmt.close();
        }
        catch (SQLException e){
            System.out.println("Error en la conexión: " + e.getMessage());
        }
    }
}

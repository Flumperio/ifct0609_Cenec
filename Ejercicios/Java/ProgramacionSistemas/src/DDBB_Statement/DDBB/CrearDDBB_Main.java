package DDBB_Statement.DDBB;

import java.sql.*;

public class CrearDDBB_Main {
    public static void main (String[] args){
        Connection conn = null;
        PreparedStatement stmt = null;
        String sql = "CREATE DATABASE IF NOT EXISTS empresa2";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "dev", "password");
            stmt = conn.prepareStatement(sql);
            stmt.execute(sql);
            System.out.println("DDBB creada OK.");
            conn.close();
            stmt.close();
        }
        catch (SQLException e){
            System.out.println("Error en la conexión: " + e.getMessage());
        }
    }
}

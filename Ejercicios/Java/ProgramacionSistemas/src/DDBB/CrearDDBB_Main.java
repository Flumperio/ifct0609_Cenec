package DDBB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearDDBB_Main {
    public static void main (String[] args){
        Connection conn = null;
        Statement stmt = null;
        String sql = "CREATE DATABASE empresa1";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/phone_land_profesor", "dev", "password");

            if (conn != null){
                System.out.println("Conexión OK.");
                conn.close();
            }
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cursos2026", "dev", "password");

            if (conn != null){
                System.out.println("Conexión OK.");
                conn.close();
            }
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "dev", "password");
            stmt = conn.createStatement();
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

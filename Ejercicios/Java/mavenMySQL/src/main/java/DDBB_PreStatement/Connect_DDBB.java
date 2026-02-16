package DDBB_PreStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connect_DDBB {
    public static void main (String[] args){
        Connection conn = null;
        PreparedStatement stmt = null;
        String sql = "CREATE DATABASE empresa1";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa1", "dev", "password");

            if (conn != null){
                System.out.println("Conexión OK.");
                conn.close();
            }
        }
        catch (SQLException e){
            System.out.println("Error en la conexión: " + e.getMessage());
        }
    }
}

package DDBB_PreStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Parte1_Ejercicio1 {
    public static void main (String[] args){
        Connection conn;
        PreparedStatement prep_stat;
        String sql_Command = "CREATE DATABASE IF NOT EXISTS academia";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "dev", "password");

            if (conn != null){
                System.out.println("✅ Conexión Servidor OK.");
            }
            //Crear DDBB
            prep_stat = conn.prepareStatement(sql_Command);
            prep_stat.execute();
            System.out.println("✅ DDBB creada OK.");
            // Crear Table
            prep_stat.executeUpdate("USE academia"); //Usamos la DDBB academia
            sql_Command = "CREATE TABLE IF NOT EXISTS cursos (id INT PRIMARY KEY, " +
                    "nombre VARCHAR(50) NOT NULL, " +
                    "profesor VARCHAR(50) NOT NULL, " +
                    "horas INT(3) NOT NULL)";
            prep_stat = conn.prepareStatement(sql_Command);
            prep_stat.executeUpdate();
            System.out.println("✅ Table creada OK.");
            //Insert Data on table
            prep_stat.close();
            conn.close();
        }
        catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

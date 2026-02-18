package DDBB_PreStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Parte2_Ejercicio1 {
    public static void main (String[] args){
        int filas_insert = 0;
        Connection conn = null;
        PreparedStatement prep_stat = null;
        String sql_Command = "INSERT INTO cursos (id, nombre, profesor, horas) VALUES (?, ?, ? ,?)";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/academia", "dev", "password");

            if (conn != null){
                System.out.println("✅ Conexión Servidor OK.");
            }
            //Crear DDBB
            prep_stat = conn.prepareStatement(sql_Command);
            prep_stat.setInt(1, 5);
            prep_stat.setString(2, "Basic");
            prep_stat.setString(3, "Instinto");
            prep_stat.setString(4, "10");
            filas_insert = prep_stat.executeUpdate();
            System.out.println("✅ " + filas_insert + " fila/s fué insertada.");
            //Cerramos Conexiones
            prep_stat.close();
            conn.close();
        }
        catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

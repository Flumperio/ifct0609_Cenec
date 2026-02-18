package DDBB_PreStatement;

import java.sql.*;
import java.util.Scanner;

public class Parte2_Ejercicio2 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int id = 0;
        Connection conn = null;
        PreparedStatement prep_stat = null;
        Statement cnt_filas = null; // Consultas simples
        ResultSet result = null;
        String sql_Insert = "INSERT INTO cursos (id, nombre, profesor, horas) VALUES (?, ?, ? ,?)";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/academia", "dev", "password");

            if (conn != null){
                System.out.println("✅ Conexión Servidor OK.");
            }
            //Contar las filas introducidas.
            cnt_filas = conn.createStatement();
            result = cnt_filas.executeQuery("SELECT COUNT(*) as total FROM cursos");
            if (result.next()){ id = result.getInt("total");}
            //Introducir Datos
            prep_stat = conn.prepareStatement(sql_Insert);
            prep_stat.setInt(1, id + 1);
            System.out.println("Introduce el nombre de curso: ");
            prep_stat.setString(2, teclado.nextLine());
            System.out.println("Introduce el nombre del profesor: ");
            prep_stat.setString(3, teclado.nextLine());
            System.out.println("Introduce el número de horas: ");
            prep_stat.setString(4, teclado.nextLine());
            //Actualizamos cambios y ejecutamos.
            prep_stat.executeUpdate();
            //Cerramos Conexiones
            prep_stat.close();
            cnt_filas.close();
            prep_stat.close();
            conn.close();
            teclado.close();
        }
        catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

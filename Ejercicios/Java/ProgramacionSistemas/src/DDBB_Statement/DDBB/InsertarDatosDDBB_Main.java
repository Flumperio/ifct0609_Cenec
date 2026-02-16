package DDBB_Statement.DDBB;

import java.sql.*;

public class InsertarDatosDDBB_Main {
    public static void main (String[] args){
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "INSERT INTO clientes (id, nif, nombre, edad) VALUES (?, ?, ? ,?)";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa2", "dev", "password");

            if (conn != null){
                System.out.println("Conexión OK.");
            }
            pstmt=conn.prepareStatement(sql);

            pstmt.setInt(1, 2);
            pstmt.setString(2, "6764485Y");
            pstmt.setString(3,"Marco");
            pstmt.setString(4, "18");
            pstmt.executeUpdate(sql);

            System.out.println("Datos insertados OK.");
            conn.close();
            pstmt.close();
        }
        catch (SQLException e){
            System.out.println("Error en la conexión: " + e.getMessage());
        }
    }
}

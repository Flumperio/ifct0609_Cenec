package DDBB;

import java.sql.*;

public class CrearTabla2 {
    public static void main (String[] args){
        Connection conn = null;
        Statement stmt = null;
        String table_sql = "CREATE TABLE IF NOT EXISTS proveedores (id INT PRIMARY KEY,"
                + "nombre VARCHAR(30) NOT NULL,"
                + "telefono VARCHAR(12) NOT NULL,"
                + "email VARCHAR(30))";
        String insert_sql= "INSERT INTO proveedores (id, nombre, telefono, email)" +
                " VALUES (1, 'Mandanga de la buena', '676300300', 'tengomandanga@gmail.com')";

        String table1_sql = "CREATE TABLE IF NOT EXISTS productos (id INT PRIMARY KEY,"
                + "nombre VARCHAR(30) NOT NULL,"
                + "precio VARCHAR(10))";
        String insert1_sql= "INSERT INTO productos (id, nombre, precio)" +
                " VALUES (1, 'Portatil', '30000')";


        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa1", "dev", "password");

            if (conn != null){
                System.out.println("Conexión OK.");
            }
            stmt=conn.createStatement();
            stmt.execute(table_sql);
            stmt.executeUpdate(insert_sql);
            stmt.execute(table1_sql);
            stmt.executeUpdate(insert1_sql);



            conn.close();
            stmt.close();
        }
        catch (SQLException e){
            System.out.println("Error en la conexión: " + e.getMessage());
        }
    }
}

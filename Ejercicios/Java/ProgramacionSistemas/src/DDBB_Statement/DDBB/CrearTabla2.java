//package DDBB_Statement.DDBB;
//
//import java.sql.*;
//
//public class CrearTabla2 {
//    public static void main (String[] args){
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        String table_sql = "CREATE TABLE IF NOT EXISTS proveedores (id INT PRIMARY KEY,"
//                + "nombre VARCHAR(30) NOT NULL,"
//                + "telefono VARCHAR(12) NOT NULL,"
//                + "email VARCHAR(30)) VALUES (?, ?, ?, ?)";
//
//        String table1_sql = "CREATE TABLE IF NOT EXISTS productos (id INT PRIMARY KEY,"
//                + "nombre VARCHAR(30) NOT NULL,"
//                + "precio VARCHAR(10)) VALUES (?, ?, ?)";
//
//        try{
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa2", "dev", "password");
//
//            if (conn != null){
//                System.out.println("Conexión OK.");
//            }
//            stmt=conn.prepareStatement(table_sql);
//            stmt.setInt(1, 2);
//            stmt.setString(2, "Marco");
//            stmt.setString(3, "699345334");
//            stmt.setString(4, "quepasanneg@gmail.com");
//            stmt.execute();
//            stmt.executeUpdate();
//
//            conn.close();
//            stmt.close();
//        }
//        catch (SQLException e){
//            System.out.println("Error en la conexión: " + e.getMessage());
//        }
//    }
//}

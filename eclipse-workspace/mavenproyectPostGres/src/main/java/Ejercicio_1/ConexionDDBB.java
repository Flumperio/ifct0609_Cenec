package Ejercicio_1;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class ConexionDDBB {

    public static void main(String[] args) {
        Properties propiedades = new Properties();

        try (InputStream input = ConexionDDBB.class.getClassLoader().getResourceAsStream("db.properties")) {

            if (input == null) {
                System.err.println("No se ha encontrado el archivo db.properties");
                return;
            }

            propiedades.load(input);

            String url = propiedades.getProperty("db.url");
            String user = propiedades.getProperty("db.user");
            String password = propiedades.getProperty("db.password");

            try (Connection conexion = DriverManager.getConnection(url, user, password);
                 Statement st = conexion.createStatement();
                 ResultSet rs = st.executeQuery("SELECT current_database()")) {

                System.out.println("Conexión correcta con PostgreSQL");

                if (rs.next()) {
                    System.out.println("Base de datos actual: " + rs.getString(1));
                }
            }

        } catch (Exception e) {
            System.err.println("Error en la conexión a la base de datos");
            e.printStackTrace();
        }
    }
}

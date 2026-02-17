package DDBB_PreStatement;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.Scanner;

public class Cursos {
    //Atributos
//    private int id;
//    private String nombre_Curso;
//    private String nombre_Prof;
//    private int horas;
    private String[] connection_DDBB = {"jdbc:mysql://localhost:3306/academia", "dev", "password"};
    Connection conn = null;

    //Constructor
    //De momento no hace falta
    //Metodos
    public Connection conn_DDBB(Connection conn) {
        try {
            conn = DriverManager.getConnection(connection_DDBB[0], connection_DDBB[1], connection_DDBB[2]);
            if (conn != null) {
                System.out.println("✅ Conexión Servidor OK.");
                return conn;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    public void listar_DDBB(Connection conn) {
        String list_sql = "SELECT * FROM cursos";
        try (Statement stat = conn.createStatement();
             ResultSet resul = stat.executeQuery(list_sql)) {
            while ((resul.next())) {
                System.out.println(resul.getInt("id") + " | " +
                        resul.getString("nombre") + " | " +
                        resul.getString("profesor") + " | " +
                        resul.getString("horas"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void aniadir_Curso(Connection conn, Scanner teclado) {
        String sql_Insert = "INSERT INTO cursos (id, nombre, profesor, horas) VALUES (?, ?, ? ,?)";
        int id = 0;
        try (Statement cnt_filas = conn.createStatement();
             ResultSet result = cnt_filas.executeQuery("SELECT COUNT(*) as total FROM cursos");
             PreparedStatement prep_stat = conn.prepareStatement(sql_Insert)) {
            //Contar las filas introducidas
            if (result.next()) {
                id = result.getInt("total");
            }
            prep_stat.setInt(1, id + 1);
            System.out.println("Introduce el nombre de curso: ");
            prep_stat.setString(2, teclado.nextLine());
            System.out.println("Introduce el nombre del profesor: ");
            prep_stat.setString(3, teclado.nextLine());
            System.out.println("Introduce el número de horas: ");
            prep_stat.setString(4, teclado.nextLine());
            //Actualizamos cambios y ejecutamos.
            prep_stat.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void eliminar_Curso(Connection conn, Scanner teclado) {
        String sql_Delete = "DELETE FROM cursos WHERE id = ?";
        try (PreparedStatement prep_stat = conn.prepareStatement(sql_Delete)) {
            System.out.println("Introduce el ID del curso a borrar: ");
            prep_stat.setInt(1, teclado.nextInt());
            System.out.println("Curso borrado: " + prep_stat.executeUpdate());
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }

    }

    public void buscar_Curso(Connection conn, Scanner teclado) {
        String sql_Find = "SELECT * FROM cursos WHERE nombre = ?";
        try (PreparedStatement prep_stat = conn.prepareStatement(sql_Find)) {
            System.out.println("Introduce el nombre del curso a buscar: ");
            prep_stat.setString(1, teclado.nextLine());
            try (ResultSet result = prep_stat.executeQuery()) {
                boolean encontrado = false;
                while (result.next()) {
                    System.out.println(
                            result.getInt("id") + " | " +
                                    result.getString("nombre") + " | " +
                                    result.getString("profesor") + " | " +
                                    result.getString("horas"));
                    encontrado = true;
                }
                if (!encontrado) {
                    System.out.println("Curso no encontrado.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }

    }

    public void modificar_Curso(Connection conn, Scanner teclado) {
        String sql_Find = "SELECT * FROM cursos WHERE nombre = ?";
        try (PreparedStatement prep_stat = conn.prepareStatement(sql_Find)) {
            System.out.println("Introduce el nombre del curso a modificar: ");
            prep_stat.setString(1, teclado.nextLine());
            try (ResultSet result = prep_stat.executeQuery()) {
                boolean encontrado = false;
                while (result.next()) {
                    System.out.println("Introduce la modificación (" + result.getString("nombre") + "): ");
                    String entrada = teclado.nextLine();
                    if (!entrada.isEmpty()) {
                        String sql_Update = "UPDATE cursos SET nombre = ? WHERE id = ?";
                        try (PreparedStatement prep_Update = conn.prepareStatement(sql_Update)) {
                            prep_Update.setString(1, entrada);
                            prep_Update.setInt(2, result.getInt("id"));
                            prep_Update.executeUpdate();
                        }
                        encontrado = true;
                    }
                    System.out.println("Introduce la modificación (" + result.getString("profesor") + "): ");
                    entrada = teclado.nextLine();
                    if (!entrada.isEmpty()) {
                        String sql_Update = "UPDATE cursos SET profesor = ? WHERE id = ?";
                        try (PreparedStatement prep_Update = conn.prepareStatement(sql_Update)) {
                            prep_Update.setString(1, entrada);
                            prep_Update.setInt(2, result.getInt("id"));
                            prep_Update.executeUpdate();
                        }
                        encontrado = true;
                    }
                    System.out.println("Introduce la modificación (" + result.getString("horas") + "): ");
                    entrada = teclado.nextLine();
                    if (!entrada.isEmpty()) {
                        String sql_Update = "UPDATE cursos SET horas = ? WHERE id = ?";
                        try (PreparedStatement prep_Update = conn.prepareStatement(sql_Update)) {
                            prep_Update.setString(1, entrada);
                            prep_Update.setInt(2, result.getInt("id"));
                            prep_Update.executeUpdate();
                        }
                        encontrado = true;
                    }
                    if (!encontrado) {
                        System.out.println("Curso no encontrado.");
                    }
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e);
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
}

package ejercicio1;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Conectar {
    public static void main(String[] args) {
        // Conectar con MongoDB en localhost (cambiar URI si es necesario)
        String uri = "mongodb://localhost:27017";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            // Seleccionar la base de datos
            MongoDatabase database = mongoClient.getDatabase("usuarios");
            System.out.println("Conexión establecida con MongoDB");
        } catch (Exception e) {
            System.err.println("Error al conectar con MongoDB: " + e.getMessage());
        }
    }
}

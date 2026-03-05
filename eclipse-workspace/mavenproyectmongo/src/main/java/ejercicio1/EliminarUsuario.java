package ejercicio1;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;

public class EliminarUsuario {
    public static void main(String[] args) {
        String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("AlbertoImperator");
            MongoCollection<Document> collection = database.getCollection("usuarios");

            // Eliminar usuario con nombre "Juan Pérez"
            collection.deleteOne(Filters.eq("nombre", "Cristina Perez"));

            System.out.println("Usuario eliminado correctamente.");
        } catch (Exception e) {
            System.err.println("Error al eliminar usuario: " + e.getMessage());
        }
    }
}

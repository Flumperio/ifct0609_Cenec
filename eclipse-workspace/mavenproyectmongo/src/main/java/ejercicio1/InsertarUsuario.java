package ejercicio1;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class InsertarUsuario {
    public static void main(String[] args) {
        String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("AlbertoImperator");
            MongoCollection<Document> collection = database.getCollection("usuarios");

            // Crear un documento
            Document usuario = new Document("nombre", "Cristina Perez")
                                .append("edad", 50)
                                .append("email", "cristina@cenecmalaga.es");

            // Insertar en la colección
            collection.insertOne(usuario);
            System.out.println("Usuario insertado correctamente.");
        } catch (Exception e) {
            System.err.println("Error al insertar usuario: " + e.getMessage());
        }
    }
}

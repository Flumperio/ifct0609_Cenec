package ejercicio1;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;
import org.bson.Document;

public class LeerUsuarios {
    public static void main(String[] args) {
        String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("AlbertoImperator");
            MongoCollection<Document> collection = database.getCollection("usuarios");

            // Obtener todos los documentos
            FindIterable<Document> usuarios = collection.find();

            // Iterar e imprimir los documentos
            for (Document usuario : usuarios) {
                System.out.println(usuario.toJson());
            }
        } catch (Exception e) {
            System.err.println("Error al leer usuarios: " + e.getMessage());
        }
    }
}


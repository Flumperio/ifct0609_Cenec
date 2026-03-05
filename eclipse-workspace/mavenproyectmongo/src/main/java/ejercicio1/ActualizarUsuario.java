package ejercicio1;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

public class ActualizarUsuario {
    public static void main(String[] args) {
        String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("AlbertoImperator");
            MongoCollection<Document> collection = database.getCollection("usuarios");

            // Actualizar la edad del usuario llamado "Juan Pérez"
            collection.updateOne(Filters.eq("nombre", "Cristina Perez"), Updates.set("edad", 25));

            System.out.println("Usuario actualizado correctamente.");
        } catch (Exception e) {
            System.err.println("Error al actualizar usuario: " + e.getMessage());
        }
    }
}

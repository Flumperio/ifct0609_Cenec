package Socket;


import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ejercicio_3_Servidor {
    public static void main(String[] args) {
        try {
            // Crear un socket servidor en el puerto 12345
            ServerSocket servidor = new ServerSocket(12345);
            System.out.print("Servidor iniciado y escuchando en el puerto: ");
            System.out.println(servidor.getLocalPort());
            // Esperar conexión de un cliente
            Socket cliente = servidor.accept();
            System.out.println("Cliente conectado: " + cliente.getInetAddress());

            // Enviar un mensaje de bienvenida al cliente
            OutputStream salida = cliente.getOutputStream();
            PrintWriter escritor = new PrintWriter(salida, true);
            escritor.println("¡Bienvenido al servidor!");

            // Cerrar conexiones
            escritor.close();
            cliente.close();
            servidor.close();
            System.out.println("Conexión cerrada.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

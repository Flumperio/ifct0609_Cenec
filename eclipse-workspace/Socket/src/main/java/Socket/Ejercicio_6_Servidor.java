package Socket;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;

public class Ejercicio_6_Servidor {
    public static void main(String[] args) {
        LocalTime horaActual = LocalTime.now();
        try {
            // Crear un socket servidor en el puerto 12345
            ServerSocket servidor = new ServerSocket(32109);
            System.out.print("Servidor iniciado y escuchando en el puerto: ");
            System.out.println(servidor.getLocalPort());
            // Esperar conexión de un cliente
            Socket cliente = servidor.accept();
            System.out.println("Cliente conectado: " + cliente.getInetAddress());

            // Enviar un mensaje de bienvenida al cliente
            OutputStream salida = cliente.getOutputStream();
            PrintWriter escritor = new PrintWriter(salida, true);
            escritor.println("La hora actual es: " + horaActual);

            // Leer el mensaje enviado por el servidor
            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(cliente.getInputStream())
            );
            String mensaje = entrada.readLine();
            System.out.println("Mensaje del cliente: \n" + mensaje);

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

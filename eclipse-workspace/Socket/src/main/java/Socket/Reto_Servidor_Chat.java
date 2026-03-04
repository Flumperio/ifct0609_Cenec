package Socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Reto_Servidor_Chat {
    public static void main(String[] args) {
        try {
            // Crear un socket servidor en el puerto 12345
            ServerSocket servidor = new ServerSocket(16384);
            System.out.print("Servidor iniciado y escuchando en el puerto: ");
            System.out.println(servidor.getLocalPort());

            // Esperar conexión de un cliente
            Socket cliente = servidor.accept();
            System.out.println("Cliente conectado: " + cliente.getInetAddress());
            // Enviar un mensaje de bienvenida al cliente
            OutputStream salida = cliente.getOutputStream();
            PrintWriter escritor = new PrintWriter(salida, true);
            escritor.println("Conectado al servidor.");
            //Recibimos los datos del cliente
            BufferedReader br = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            String mensaje;
            while (!(mensaje = br.readLine()).equals("fin")) {
                System.out.println("Cliente: " + mensaje);
            }
            System.out.println("Cliente dijo 'fin', conexión cerrada.");
            // Cerrar conexiones
            br.close();
            escritor.close();
            cliente.close();
            servidor.close();
            System.out.println("Conexión cerrada.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

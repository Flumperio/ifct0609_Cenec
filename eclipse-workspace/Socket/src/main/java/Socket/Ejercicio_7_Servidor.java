package Socket;

import java.io.DataInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ejercicio_7_Servidor {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        try {
            // Crear un socket servidor en el puerto 12345
            ServerSocket servidor = new ServerSocket(6789);
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
            DataInputStream datosRecibidos = new DataInputStream(cliente.getInputStream());
            numero1 = datosRecibidos.readInt();
            numero2 = datosRecibidos.readInt();
            //Ejecucción de la suma
            System.out.println("La suma de los números recibidos es: " + (numero1 + numero2));
            // Cerrar conexiones
            datosRecibidos.close();
            escritor.close();
            cliente.close();
            servidor.close();
            System.out.println("Conexión cerrada.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

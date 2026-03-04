package Socket;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Ejercicio_3_Cliente {
    public static void main(String[] args) {
        try {
            // Conectar al servidor en localhost y puerto 12345
            Socket cliente = new Socket("localhost", 12345);
            System.out.println("Conectado al servidor.");
            System.out.println(cliente.getInetAddress());
            System.out.println(cliente.getPort());

            // Leer el mensaje enviado por el servidor
            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(cliente.getInputStream())
            );
            String mensaje = entrada.readLine();
            System.out.println("Mensaje del servidor: " + mensaje);
            // Cerrar conexión
            entrada.close();
            cliente.close();
            System.out.println("Conexión cerrada.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

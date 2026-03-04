package Socket;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Ejercicio_7_Cliente {
    public static void main(String[] args) {
        try {
            // Conectar al servidor en localhost y puerto 12345
            Socket cliente = new Socket("localhost", 6789);
            System.out.println("Conectado al servidor.");
            System.out.println(cliente.getInetAddress());
            System.out.println(cliente.getPort());
            // Leer el mensaje enviado por el servidor
            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(cliente.getInputStream())
            );
            String mensaje = entrada.readLine();
            System.out.println("Mensaje del servidor: \n" + mensaje);

            //Enviamos los datos del cliente al servidor
            DataOutputStream datosEnvio = new DataOutputStream(cliente.getOutputStream());
            datosEnvio.writeInt(5);
            datosEnvio.writeInt(8);
            datosEnvio.flush();
            Thread.sleep(1000); //Hay que esperar un poco porque el servidor hace una última lectura
            // Cerrar conexión
            entrada.close();
            cliente.close();
            System.out.println("Conexión cerrada.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

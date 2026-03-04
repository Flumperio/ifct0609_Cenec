package Socket;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Ejercicio_12_Servidor {
    public static void main(String[] args) {
        try {
            // Crear un socket UDP en el puerto 9876
            DatagramSocket socket = new DatagramSocket(9876);
            System.out.println("Servidor UDP iniciado en el puerto 9876. Esperando mensajes...");

            byte[] buffer = new byte[256];

            while (true) {
                // Recibir un paquete
                DatagramPacket paquete = new DatagramPacket(buffer, buffer.length);
                socket.receive(paquete);

                // Mostrar el mensaje recibido
                String mensaje = new String(paquete.getData(), 0, paquete.getLength());
                System.out.println("Mensaje recibido: " + mensaje);

                // Responder al emisor
                String respuesta = "Mensaje recibido correctamente";
                byte[] respuestaBytes = respuesta.getBytes();
                DatagramPacket paqueteRespuesta = new DatagramPacket(
                        respuestaBytes,
                        respuestaBytes.length,
                        paquete.getAddress(),
                        paquete.getPort()
                );
                socket.send(paqueteRespuesta);

                if (mensaje.equalsIgnoreCase("FIN")) {
                    System.out.println("Finalizando servidor UDP.");
                    break;
                }
            }

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

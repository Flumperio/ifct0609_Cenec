package Socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Ejercicio_8_Cliente {
    public static void main(String[] args) {
        try {
            // Conectar al servidor
            SocketChannel cliente = SocketChannel.open(new InetSocketAddress("localhost", 6789));
            cliente.configureBlocking(true); // Para simplificar, modo bloqueante

            // Enviar mensaje
            String mensaje = "¡En verdad!";
            ByteBuffer buffer = ByteBuffer.wrap(mensaje.getBytes());
            cliente.write(buffer);
            System.out.println("Mensaje enviado al servidor.");

            // Leer respuesta
            buffer.clear();
            cliente.read(buffer);
            buffer.flip();
            System.out.println("Respuesta del servidor: " + new String(buffer.array(), 0, buffer.limit()));

            cliente.close(); // Cerrar conexión
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

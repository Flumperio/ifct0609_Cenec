package Socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class Ejercicio_8_Servidor {
    public static void main(String[] args) {
        try {
            // Crear el canal del servidor y configurarlo
            ServerSocketChannel servidor = ServerSocketChannel.open();
            servidor.bind(new InetSocketAddress(6789)); // Puerto
            servidor.configureBlocking(false); // Modo no bloqueante

            // Crear un selector para manejar eventos
            Selector selector = Selector.open();
            servidor.register(selector, servidor.validOps()); // Registrar al selector

            System.out.println("Servidor iniciado. Esperando conexiones...");

            while (true) {
                selector.select(); // Esperar eventos
                Iterator<java.nio.channels.SelectionKey> iterador = selector.selectedKeys().iterator();

                while (iterador.hasNext()) {
                    var key = iterador.next();

                    if (key.isAcceptable()) { // Aceptar conexiones nuevas
                        SocketChannel cliente = servidor.accept();
                        cliente.configureBlocking(false);
                        cliente.register(selector, java.nio.channels.SelectionKey.OP_READ);
                        System.out.println("Cliente conectado.");
                    } else if (key.isReadable()) { // Leer datos de clientes
                        SocketChannel cliente = (SocketChannel) key.channel();
                        ByteBuffer buffer = ByteBuffer.allocate(256);
                        int bytesLeidos = cliente.read(buffer);

                        if (bytesLeidos > 0) {
                            buffer.flip();
                            String mensaje = new String(buffer.array(), 0, buffer.limit());
                            System.out.println("Mensaje recibido: " + mensaje);

                            // Enviar respuesta (eco)
                            cliente.write(ByteBuffer.wrap(("Eco: " + mensaje).getBytes()));
                        } else {
                            cliente.close();
                            System.out.println("Cliente desconectado.");
                        }
                    }
                    iterador.remove(); // Eliminar clave procesada
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

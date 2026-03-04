package Socket;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Reto_Cliente_Chat {
    public static void main(String[] args) {
        try {
            // Conectar al servidor en localhost y puerto 12345
            Socket cliente = new Socket("localhost", 16384);
            PrintWriter pw = new PrintWriter(cliente.getOutputStream(), true);  // autoFlush=t
            System.out.println("Conectado al servidor.");
            // Leer el mensaje enviado por el servidor
            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(System.in));
            String linea;
            System.out.println("Escribe mensajes (Enter envía, 'fin' cierra):");

            //Enviamos los datos del cliente al servidor
            while (!(linea = entrada.readLine()).equals("fin")) {
                pw.println(linea);
            }
            pw.println("fin");
            cliente.close();
            pw.close();
            entrada.close();
            System.out.println("Conexión cerrada.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

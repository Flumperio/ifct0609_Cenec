package Procesos;

public class Ejercicio_CMD_Metodo {

	public static void main(String[] args) {
		String comando[] = {"ls -la", "ping 8.8.8.8", "netstat"};
		comand(comando);
	}

	public static void comand(String[] comando) {
		for (String cmd : comando) {
			ProcessBuilder pb = new ProcessBuilder("osascript", "-e",
					"tell application \"Terminal\" to do script \"" + cmd + "\"");
			try {
				Process p = pb.start();
				p.waitFor();  // Espera fin para ver errores
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

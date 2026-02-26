package Procesos;

public class Ejercicio_CMD {

	public static void main(String[] args){
		String comando = "netstat";  // Tu comando aquí (p.e. "ls -la", "pwd && netstat")
		ProcessBuilder pb = new ProcessBuilder("osascript", "-e",
				"tell application \"Terminal\" to do script \"" + comando + "\"");
		try {
			Process p = pb.start();
			p.waitFor();  // Espera fin para ver errores
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

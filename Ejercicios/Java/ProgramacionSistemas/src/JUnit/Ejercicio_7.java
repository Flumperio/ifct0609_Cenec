package JUnit;

public class Ejercicio_7 {
    public String calcularNivelNota(int nota) {
        if (nota < 5) {
            return "Suspenso";
        } else if (nota < 7) {
            return "Aprobado";
        } else if (nota < 9) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }
}

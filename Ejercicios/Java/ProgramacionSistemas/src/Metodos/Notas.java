package Metodos;

public class Notas {
    public String calculo_nota (int nota){
        String literal = "";
        if (nota < 5 && nota > 0)
            literal = "Suspenso";
        else if (nota >= 5 && nota < 6) {
            literal = "Aprobado";
        } else if (nota >= 6 && nota < 7) {
            literal = "Bien";
        } else if (nota >= 7 && nota < 9) {
            literal = "Notable";
        } else if (nota >= 9 && nota <= 10)  {
            literal = "Sobresaliente";
        } else
            literal = "La nota no está en el rango.";
        return literal;
    }
}

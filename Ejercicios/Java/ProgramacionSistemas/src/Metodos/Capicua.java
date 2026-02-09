package Metodos;

public class Capicua {
    public boolean calc_capicua (int numero){
        int original, invertido;
        if (numero < 0){
            numero = -numero;
        }
        original = numero;
        invertido = 0;

        while (numero > 0){
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }
        return original == invertido;
    }
}

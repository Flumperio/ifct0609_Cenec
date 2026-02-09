package Metodos;

import java.util.Scanner;

public class UserPass {
    public String entrada_datos (String valor){
        String entrada_dato;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce " + valor + ":");
        entrada_dato = teclado.nextLine();
        return entrada_dato;
    }

    public boolean check_lenght (String cadena){
        int long_cadena = cadena.length();
        if (long_cadena < 8)
            return false;
        return true;
    }
    public boolean check_same (String usr, String pass){
        if (usr.equals(pass))
            return false;
        return true;
    }
}

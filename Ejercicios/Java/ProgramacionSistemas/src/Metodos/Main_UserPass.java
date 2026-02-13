package Metodos;

public class Main_UserPass {
    public static void main (String[] args){
        //Definición variables
        String usuario, password;
        UserPass us_pass = new UserPass();
        //Entrada Datos
        usuario = us_pass.entrada_datos("Usuario");
        password = us_pass.entrada_datos("Contraseña");
        //Main
        if ((!us_pass.check_lenght(password)) || (!us_pass.check_same(usuario, password)))
            System.out.println("La contraseña es errónea");
        else
            System.out.println("Usuario y contraseña OK.");
        //Impresion
        //Cerramos clases abiertas
    }
}

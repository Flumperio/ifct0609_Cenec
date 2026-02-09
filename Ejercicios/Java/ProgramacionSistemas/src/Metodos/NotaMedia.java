package Metodos;

public class NotaMedia{
    public static void main(String[] args) {
        //Definición variables
        double nota1 = 7, nota2 = 5, nota3 = 9;
        NotaMedia media_notas = new NotaMedia();
        //Entrada Datos
        media_notas.media(nota1, nota2, nota3);
        //Main
        //Impresion
        //Cerramos clases abiertas

    }

    //Metodo o funcion
    public void media(double n1, double n2, double n3) {
        double media =  (n1 + n2 + n3)/3;
        System.out.println("La nota media es de: " + media);
    }
}

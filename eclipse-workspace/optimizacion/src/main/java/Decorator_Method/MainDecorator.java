package Decorator_Method;

public class MainDecorator {
    public static void main (String[] args){
        //Creamos una instancia de MensajeBasico
        Mensaje mensaje = new MensajeBasico("Hola Majo!");

        //Decoramos el mensaje con un encabezado
        Mensaje mensajeDecorado = new MensajeConEncabezado(new MensajeConPie(mensaje, "Pie"), "Encabezado");

        System.out.println(mensajeDecorado.obtenerContenido());
    }
}

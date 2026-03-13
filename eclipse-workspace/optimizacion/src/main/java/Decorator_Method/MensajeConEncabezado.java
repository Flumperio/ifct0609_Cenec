package Decorator_Method;

class MensajeConEncabezado implements Mensaje{
    //Atributos
    private Mensaje mensaje;
    private String encabezado;
    //Constructor
    public MensajeConEncabezado(Mensaje mensaje, String encabezado) {
        this.mensaje = mensaje;
        this.encabezado = encabezado;
    }

    @Override
    public String obtenerContenido() {
        return encabezado + "\n" + mensaje.obtenerContenido();
    }
}

package Decorator_Method;

class MensajeConPie implements Mensaje{
    //Atributos
    private Mensaje mensaje;
    private String piePagina;
    //Constructor
    public MensajeConPie(Mensaje mensaje, String piePagina) {
        this.mensaje = mensaje;
        this.piePagina = piePagina;
    }

    @Override
    public String obtenerContenido() {
        return mensaje.obtenerContenido() + "\n" + piePagina;
    }
}

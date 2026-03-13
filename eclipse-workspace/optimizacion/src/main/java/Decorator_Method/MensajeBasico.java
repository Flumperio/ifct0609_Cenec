package Decorator_Method;

class MensajeBasico implements Mensaje{
    //Atributo
    private String contenido;
    //Constuctor

    public MensajeBasico(String contenido) {
        this.contenido = contenido;
    }
    //Overrride de implements
    @Override
    public String obtenerContenido() {
        return contenido;
    }
}

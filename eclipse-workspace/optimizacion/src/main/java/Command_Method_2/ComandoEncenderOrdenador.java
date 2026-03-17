package Command_Method_2;

public class ComandoEncenderOrdenador implements Comando {
    //Atributo, asociamos la clase comandoencencder a luz
    private Ordenador ordenador;
    //Consturctor.
    public ComandoEncenderOrdenador(Ordenador ordenador) {
        this.ordenador = ordenador;
    }
    //Como ya tenemos la clase luz que tiene encencder, lo ejecutamos
    @Override
    public void ejecutar(){
        ordenador.encender();
    }
}

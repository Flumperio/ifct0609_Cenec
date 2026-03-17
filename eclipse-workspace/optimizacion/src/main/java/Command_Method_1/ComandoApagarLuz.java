package Command_Method_1;

public class ComandoApagarLuz implements Comando{
    //Atributo, asociamos la clase comandoencencder a luz
    private Luz luz;
    //Consturctor.
    public ComandoApagarLuz(Luz luz) {
        this.luz = luz;
    }
    //Como ya tenemos la clase luz que tiene encencder, lo ejecutamos
    @Override
    public void ejecutar(){
        luz.apagar();
    }
}

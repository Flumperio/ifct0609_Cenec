package Command_Method_2;

public class ControlRemoto {
    //Asociamos control remoto a Comando.
    private Comando comando;
    //Metodo
    public void setComando(Comando comando) {
        this.comando = comando;
    }
    public void presionarBoton(){
        comando.ejecutar();
    }

}

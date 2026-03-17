package Command_Method_1;

public class MainLuz {
    public static void main (String[] args){
        //Creamos el objeto receptor
        Luz luz = new Luz();
        //Creamos los comandos.
        Comando comandoEncender = new ComandoEncenderLuz(luz);
        Comando comandoApagar = new ComandoApagarLuz(luz);
        //Creamos el control remoyo
        ControlRemoto control = new ControlRemoto();
        //Encender luz
        control.setComando(comandoEncender);
        control.presionarBoton();
        //Apagar luz
        control.setComando(comandoApagar);
        control.presionarBoton();
    }
}

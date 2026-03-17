package Command_Method_2;

public class MainOrdenador {
    public static void main (String[] args){
        //Creamos el objeto receptor
        Ordenador ordenador = new Ordenador();
        //Creamos los comandos.
        Comando comandoEncender = new ComandoEncenderOrdenador(ordenador);
        Comando comandoApagar = new ComandoApagarOrdenador(ordenador);
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

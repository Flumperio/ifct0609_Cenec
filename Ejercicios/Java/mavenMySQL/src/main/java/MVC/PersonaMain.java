package MVC;

public class PersonaMain {
    public static void main (String[] args){
        //Variables
        Persona modelo = new Persona("Juan Carlos","Santos", 56);
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo,vista);
        //main
        controlador.actualizarVista();
    }
}

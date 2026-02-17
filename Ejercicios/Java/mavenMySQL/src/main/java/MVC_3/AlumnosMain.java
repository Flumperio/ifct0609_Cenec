package MVC_3;

public class AlumnosMain {
    public static void main (String[] args){
        Alumnos modelo = new Alumnos(1, "Marco", "Santos", "Lengua", 5);
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);

        //Main
        controlador.actualizarVista();
    }
}

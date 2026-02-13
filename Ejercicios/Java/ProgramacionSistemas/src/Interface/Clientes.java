package Interface;

public class Clientes implements DatosPersonales, DatosEconomicos{
    //Atributos
    private String nombres;
    //Constructor
    public Clientes (String nombres){
        this.nombres = nombres;
    }

    //Getter y Setter
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    //Override de los interfaces
    @Override
    public String enviar_datos (String nombres){
        return "Esta enviando: " + nombres;
    }

    @Override
    public String firmar (String nombres){
        return "Esta firmando: " + nombres;
    }

    @Override
    public String mostrar_datos (String nombres){
        return "Estos son los datos: " + nombres;
    }

    public String mostrar_datos (String nombres, String tipo){
        return "Cliente: " + nombres + " Tipo: "+ tipo;
    }

    @Override
    public String pagar(String nombres){
        return "Esta pagando " + nombres;
    }

}

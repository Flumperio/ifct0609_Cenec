package Interface;

public class Empresa extends Clientes{
    //Atributos
    private String tipo;
    //Constructor
    public Empresa(String nombres, String tipo){
        super (nombres);
        this.tipo = tipo;
    }
    //Setter y Getter
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String mostrar_datos (String nombres, String tipo){
        return ("Empresa:" + super.mostrar_datos(nombres, tipo));
    }
}

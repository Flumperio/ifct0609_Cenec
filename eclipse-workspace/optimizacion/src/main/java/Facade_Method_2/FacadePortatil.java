package Facade_Method_2;

public class FacadePortatil {
    //Atributos Asociaciones
    private WiFi wiFi;
    private Ventilacion ventilacion;
    private PlacaBase placaBase;
    private Pantalla pantalla;
    //Creamos una clase y asociamos todos componentes o clases que
    //queremos automatizar

    //En el consturctor creamos el objetos con los objetos
    public FacadePortatil(){
        this.wiFi = new WiFi();
        this.ventilacion = new Ventilacion();
        this.placaBase = new PlacaBase();
        this.pantalla = new Pantalla();
    }
    //Métodos para encender y apagar, o arrancar
    public void ecenderPortatil() {
        placaBase.encender();
        ventilacion.encender();
        pantalla.encender();
        wiFi.encender();
    }
    public void apagarPortatil(){
        wiFi.apagar();
        pantalla.apagar();
        ventilacion.apagar();
        placaBase.apagado();
    }

}

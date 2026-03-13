package Facade_Method_1;

public class FacadeAuto {
    //Atributos Asociaciones
    private Motor motor;
    private BombaCombustible bombaCombustible;
    private AireAcondicionado aireAcondicionado;
    //Creamos una clase y asociamos todos componentes o clases que
    //queremos automatizar

    //En el consturctor creamos el objetos con los objetos
    public FacadeAuto (){
        this.motor = new Motor();
        this.bombaCombustible = new BombaCombustible();
        this.aireAcondicionado = new AireAcondicionado();
    }
    //Métodos para encender y apagar, o arrancar
    public void ecenderAuto() {
        motor.encender();
        bombaCombustible.bombear();
        aireAcondicionado.encender();
    }
    public void apagarAuto(){
        aireAcondicionado.apagado();
        motor.apagar();
    }

}

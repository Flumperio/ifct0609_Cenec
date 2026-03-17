package Observer_Method_2;

public class TemperaturaMain {
    public static void main (String[] args){
        //Creamos el sensor de temperatura
        SensorTemperatura sensor = new SensorTemperatura();

        //Creaer usuarios y agregarlos como observadores
        Usuario cenec = new Usuario(30);
        sensor.agregarObservador(cenec);
        sensor.setTemperatura(59);
    }
}

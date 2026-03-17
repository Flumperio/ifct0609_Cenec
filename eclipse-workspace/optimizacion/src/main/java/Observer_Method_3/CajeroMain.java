package Observer_Method_3;

public class CajeroMain {
    public static void main (String[] args){
        //Creamos el sensor de temperatura
        SensorSaldo sensor = new SensorSaldo();

        //Creaer usuarios y agregarlos como observadores
        Cliente cenec = new Cliente(1000);
        sensor.agregarObservador(cenec);
        sensor.setSaldo(100);
        sensor.setSaldo(2000);
    }
}

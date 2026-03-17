package Observer_Method_3;

import java.util.ArrayList;
import java.util.List;

class SensorSaldo {
    //Atributos
    //Lista de observadores
    private List<Observer> observadores = new ArrayList<>();
    private double saldoActual;

    //Metodos para la gestión de la lista de observadores
    public  void agregarObservador(Observer observador){
        observadores.add(observador);
    }
    public void eliminarObservador(Observer observador){
        observadores.remove(observador);
    }

    public void setSaldo(double saldo){
        this.saldoActual = saldo;
        notificarObservadores();
    }
    private void notificarObservadores(){
        for (Observer observador : observadores){
            observador.actualizar(saldoActual);
        }
    }
}

package Facade_Method_1;

public class MainCoche {
    public static void main (String[] args){
        //Creamos coche
        FacadeAuto coche = new FacadeAuto();
        //Operamos
        coche.ecenderAuto();
        coche.apagarAuto();

    }
}

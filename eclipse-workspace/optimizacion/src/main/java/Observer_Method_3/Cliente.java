package Observer_Method_3;

class Cliente implements Observer {
    //Atributo umbral. Definimos el parámetro umbral
    private double umbral;
    //Constructor
    public Cliente(double umbral){
        this.umbral = umbral;
    }
    @Override
    public void actualizar(double saldo){
        if (saldo > umbral){
            System.out.println(("Alerta! Ha superado el sado de: " + umbral + "€."));
        }
    }
}

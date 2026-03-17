package Observer_Method_2;

class Usuario implements Observer {
    //Atributo umbral. Definimos el parámetro umbral
    private double umbral;
    //Constructor
    public Usuario (double umbral){
        this.umbral = umbral;
    }
    @Override
    public void actualizar(double temperatura){
        if (temperatura > umbral){
            System.out.println(("Alerta! la temperatura ha superado el umbral de " + umbral + " grados."));
        }
    }
}

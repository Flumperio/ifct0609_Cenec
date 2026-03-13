package Estructural_Adapter_2;

class DistanciaAdapter implements DistanciaConverter {
    //Atributo
    private DistanciaKms distanciaKms;
    //Constructor
    public DistanciaAdapter(DistanciaKms distanciaKms) {
        this.distanciaKms = distanciaKms;
    }
    @Override
    public double KmToMilesConverter (double km) {
        return new KmToMilesConverter().KmToMilesConverter(distanciaKms.getValue());
    }
}


package Estructural_Adapter_2;

class KmToMilesConverter implements DistanciaConverter {
    @Override
    public double KmToMilesConverter(double km) {
        return (km * 0.621371);
    }
}

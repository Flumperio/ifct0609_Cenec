package Estructural_Adapter_2;

public class Main {
    public static void main(String[] args) {
        // Crear distancia en KMs
        double distanciaKM=25;
        DistanciaKms distanciaConv = new DistanciaKms(distanciaKM);

        // Crear un adaptador y pasar la temperatura en Celsius
        DistanciaAdapter adapter = new DistanciaAdapter(distanciaConv);

        // Utilizar el adaptador para convertir la temperatura a Fahrenheit
        double millasDST = adapter.KmToMilesConverter(distanciaConv.getValue());

        // Imprimir el resultado
        System.out.println("la distanca en KM's es: "+distanciaKM);
        System.out.println("La distancia en Millas: " + millasDST);
    }
}

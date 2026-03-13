package Estructural_Adapter_1;

public class Main {
    public static void main(String[] args) {
        // Crear una temperatura en Celsius
        double temp=25;
        CelsiusTemperature celsiusTemp = new CelsiusTemperature(temp);

        // Crear un adaptador y pasar la temperatura en Celsius
        TemperatureAdapter adapter = new TemperatureAdapter(celsiusTemp);

        // Utilizar el adaptador para convertir la temperatura a Fahrenheit
        double fahrenheitTemp = adapter.convertCelsiusToFahrenheit(celsiusTemp.getValue());

        // Imprimir el resultado
        System.out.println("la temperatura en grados es: "+temp);
        System.out.println("La temperatura en Fahrenheit: " + fahrenheitTemp);
    }
}

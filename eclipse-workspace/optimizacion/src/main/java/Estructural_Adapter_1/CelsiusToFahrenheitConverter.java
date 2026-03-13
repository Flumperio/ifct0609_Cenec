package Estructural_Adapter_1;

public class CelsiusToFahrenheitConverter implements TemperatureConverter {
    @Override
    public double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

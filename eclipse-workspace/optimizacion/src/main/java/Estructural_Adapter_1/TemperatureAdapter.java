package Estructural_Adapter_1;

public class TemperatureAdapter implements TemperatureConverter {
    private CelsiusTemperature celsiusTemperature;

    public TemperatureAdapter(CelsiusTemperature celsiusTemperature) {
        this.celsiusTemperature = celsiusTemperature;
    }

    @Override
    public double convertCelsiusToFahrenheit(double celsius) {
        return new CelsiusToFahrenheitConverter().convertCelsiusToFahrenheit(celsiusTemperature.getValue());
    }
}


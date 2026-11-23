public class TemperaturaAdapter extends TemperaturaFahrenheit {

    private ITemperatura temperaturaCelsius;

    public TemperaturaAdapter(ITemperatura temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public double recuperarTemperatura() {
        double celsius = (this.getFahrenheit() - 32) * 5 / 9;
        temperaturaCelsius.setTemperatura(celsius);
        return temperaturaCelsius.getTemperatura();
    }

    public void salvarTemperatura() {
        double fahrenheit = (temperaturaCelsius.getTemperatura() * 9 / 5) + 32;
        this.setFahrenheit(fahrenheit);
    }
}

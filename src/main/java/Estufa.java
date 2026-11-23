public class Estufa {

    ITemperatura temperatura;
    TemperaturaAdapter sensor;

    public Estufa() {
        temperatura = new TemperaturaCelsius();
        sensor = new TemperaturaAdapter(temperatura);
    }

    public void setTemperatura(double celsius) {
        temperatura.setTemperatura(celsius);
        sensor.salvarTemperatura();
    }

    public double getTemperatura() {
        return sensor.recuperarTemperatura();
    }

    // Metodo para mostrar a conversao de Celsius para Fahrenheit feita pelo adaptador
    public double getFahrenheit() {
        return sensor.getFahrenheit();
    }
}

public class TemperaturaCelsius implements ITemperatura {

    private double celsius;

    @Override
    public double getTemperatura() {
        return this.celsius;
    }

    @Override
    public void setTemperatura(double celsius) {
        this.celsius = celsius;
    }
}

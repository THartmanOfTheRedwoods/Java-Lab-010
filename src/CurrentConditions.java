public class CurrentConditions implements Display {
    WeatherStation ws;
    private float temperature;
    private float humidity;
    private float pressure;
    public CurrentConditions(WeatherStation ws) {
        this.ws = ws;
    }
    @Override
    public void update() {
        this.temperature = ws.getTemperature();
        this.humidity = ws.getHumidity();
        this.pressure = ws.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.printf("The temperature is "+temperature+".%nThe humidity is "+humidity+".%nThe pressure is "+pressure+".%n");
    }
}
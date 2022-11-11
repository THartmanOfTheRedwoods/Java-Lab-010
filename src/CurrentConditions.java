public class CurrentConditions implements Display{
    private WeatherStation ws;
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
        System.out.println("The temperature is: " + temperature);
        System.out.println("The humidity is: " + humidity);
        System.out.println("The pressure is: " + pressure);
    }
}

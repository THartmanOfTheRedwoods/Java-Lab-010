public class CurrentConditions implements Display{
    private WeatherStation ws = new WeatherStation();

    private float temperature;

    private float humidity;

    private float pressure;

    public CurrentConditions(WeatherStation ws){
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
        System.out.println("The Temperature is: " + temperature + " degrees");
        System.out.println("The Humidity is: " + humidity + "%");
        System.out.println("The Pressure is: " + pressure + " inches of mercury");
    }
}

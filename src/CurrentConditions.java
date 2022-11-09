public class CurrentConditions implements Display {
    WeatherStation ws;
    float temperature;
    float humidity;

    public CurrentConditions(WeatherStation ws) {
        this.ws = ws;
    }

    @Override
    public void update() {
        temperature = ws.getTemperature();
        humidity = ws.getHumidity();
    }

    @Override
    public void display() {
        System.out.printf("""
                Current Conditions:
                  Temperature: %.2f*f
                  Humidity: %.2f%%
                """, temperature, humidity);
    }
}

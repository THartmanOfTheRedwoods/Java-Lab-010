public class CurrentConditions implements Display {
    private WeatherStation ws;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditions(WeatherStation ws){
        this.ws = ws;
    }
    public void update() {
        this.temperature = ws.getTemperature();
        this.humidity = ws.getHumidity();
        this.pressure = ws.getPressure();
        display();
    }
    public void display() {
        System.out.println("Temperature is: " + this.temperature + " Degrees Fahrenheit\n"
                + "Humidity is: " + this.humidity + "%\nPressure is: " + this.pressure + " Inches of Mercury");
    }

}

//Create a class CurrentConditions.java that **implements** Display
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
        this.temperature = ws.getTemperature(); //It's update method should update its temperature
        this.humidity = ws.getHumidity(); //humidity
        this.pressure = ws.getPressure(); //pressure instance variables from its WeatherStation instance
        display();//call **display()**
    }

    public void display() {
        //It's display method should simply print out in a well formatted message
        // this objects temperature, humidity, and pressure.

        System.out.println("The current temperature is: " + temperature);
        System.out.println("The current humidity is: " + humidity);
        System.out.println("The current pressure is: " + pressure);
    }
}

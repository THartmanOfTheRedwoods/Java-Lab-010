public class StatisticsDisplay implements Display {
    WeatherStation ws;
    private float temperatureMin = 216;
    private float temperatureMax = -273;
    private float temperatureTotal = 0;
    private int numReadings = 0;
    public StatisticsDisplay(WeatherStation ws) {
        this.ws = ws;
    }
    @Override
    public void update() {
        float temp = ws.getTemperature();
        temperatureTotal += temp;
        numReadings++;
        if (temperatureMin > temp) { temperatureMin = temp; }
        if (temperatureMax < temp) { temperatureMax = temp; }
        display();
    }

    @Override
    public void display() {
        System.out.printf("The minimum temperature is "+temperatureMin+".%nThe maximum temperature is "+temperatureMax+".%nThe average temperature is "+(temperatureTotal/numReadings)+".%n");
    }
}
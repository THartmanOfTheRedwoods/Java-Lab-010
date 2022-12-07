public class StatisticsDisplay implements Display {
    private WeatherStation ws;
    private float temperatureMin = 10000.0F;
    private float temperatureMax = -10000.0F;
    private float temperatureTotal = 0.0F;
    private int numReadings = 0;
    public StatisticsDisplay (WeatherStation ws) {
        this.ws = ws;
    }
    @Override
    public void update() {
        float temp = ws.getTemperature();
        temperatureTotal += temp;
        if (temp < temperatureMin) {
            temperatureMin = temp;
        }
        if (temp > temperatureMax) {
            temperatureMax = temp;
        }
        numReadings++;
        display();
    }

    @Override
    public void display() {
        System.out.println("");
        System.out.println("Min temp = " + temperatureMin);
        System.out.println("Max temp = " + temperatureMax);
        System.out.println("Average temp = " + temperatureTotal/numReadings);
    }
}
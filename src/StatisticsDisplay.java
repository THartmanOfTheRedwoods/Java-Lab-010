public class StatisticsDisplay implements Display{
    private WeatherStation ws;
    private float temperatureMin = 150;
    private float temperatureMax = -300;
    private float temperatureTotal = 0;
    private int numReadings = 0;

    public StatisticsDisplay (WeatherStation ws) {
        this.ws = ws;
    }

    @Override
    public void update() {
        float temp = ws.getTemperature();
        temperatureTotal += temp;

        if (temperatureMin > temp) {
            temperatureMin = temp;
        }
        if (temperatureMax < temp) {
            temperatureMax = temp;
        }
        display();
    }

    @Override
    public void display() {
        System.out.printf("Min: %f%nMax: %f%n",
                this.temperatureMin, this.temperatureMax, (this.temperatureTotal/this.numReadings));
    }
}

public class StatisticsDisplay implements Display{
    private WeatherStation ws = new WeatherStation();

    private float temperatureMin = -300;

    private float temperatureMax = 300;

    private float temperatureTotal = 0;

    private int numReadings = 0;

    public StatisticsDisplay(WeatherStation ws){
        this.ws = ws;
    }

    @Override
    public void update() {
        float temp = ws.getTemperature();
        temperatureTotal += temp;
        numReadings += 1;
        if (temperatureMin < temp) {
            this.temperatureMin = temp;
        }
        if (temperatureMax > temp) {
            this.temperatureMax = temp;
        }
        display();
    }

    @Override
    public void display() {
        System.out.println("The minimum temperature is: " + temperatureMin + " degrees");
        System.out.println("The maximum temperature is: " + temperatureMax + " degrees");
        System.out.println("The average temperature is: " + temperatureTotal/numReadings + " degrees");

    }
}

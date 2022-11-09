public class StatisticsDisplay implements Display{

    private WeatherStation ws;
    private float temperatureMin = 60;
    private float temperatureMax;
    private float temperatureTotal = 0;
    private int numReadings = 0;

    public StatisticsDisplay(WeatherStation ws){
        this.ws = ws;
    }

    public void update() {
        float temp = ws.getTemperature();
        if(temp < temperatureMin){
            temperatureMin = temp;
        } if (temp > temperatureMax){
            temperatureMax = temp;
        }

        temperatureTotal = temperatureTotal + temp;
        numReadings = numReadings + 1;

        display();
    }

    public void display() {
        float temperatureAverage = (temperatureTotal / numReadings);

        System.out.printf("\nStatistics Display:\nMinimum Temperature: %f\nMaximum Temperature: %f\nAverage Temperature: %f\n",
                temperatureMin, temperatureMax, temperatureAverage);

    }
}

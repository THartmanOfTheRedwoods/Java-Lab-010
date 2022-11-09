public class StatisticsDisplay implements Display{
    private WeatherStation ws;
    private float temperatureMin = 212;
    private float temperatureMax = -273;
    private float temperatureTotal = 0.0f;
    private int numReadings = 0;
    public StatisticsDisplay(WeatherStation ws){
        this.ws = ws;
    }
    public void update() {
        float temp = ws.getTemperature();
        temperatureTotal += temp;
        numReadings ++;
        if(temperatureMin > temp) {temperatureMin = temp;}
        if (temperatureMax < temp) {temperatureMax = temp;}
        display();
    }

    public void display() {
        System.out.println("Minimum temperature is: " + temperatureMin +
                "\nMaximum temperature is: " + temperatureMax + "\nAverage temperature is: "
        + temperatureTotal/numReadings);
    }
}

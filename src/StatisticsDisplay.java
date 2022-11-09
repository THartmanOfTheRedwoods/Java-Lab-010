//Create a class StatisticsDisplay.java that **implements** Display
public class StatisticsDisplay implements Display{
    private WeatherStation ws;
    private float temperatureMin = 200;
    private float temperatureMax = -273;
    private float temperatureRunningTotal = 0;
    private int numReadings = 0;

    public StatisticsDisplay(WeatherStation ws) {
        this.ws = ws;
    }
    //It's update method should update instance variables
    //temperatureMin, temperatureMax, tempRunningTotal, and numReadings
    public void update() {
       float temp = ws.getTemperature();
       temperatureRunningTotal += temp;
       numReadings++;
       if(temperatureMin > temp) { temperatureMin = temp;}
       if(temperatureMax < temp) { temperatureMax = temp;}
       display();
    }

    @Override
    public void display() {
        //It's display method should print out the min, max, and average temperature values.
        System.out.println("The minimum temperature is: " + temperatureMin);
        System.out.println("The maximum temperature is: " + temperatureMax);
        System.out.println("The average temperature is: " + temperatureRunningTotal);
    }
}

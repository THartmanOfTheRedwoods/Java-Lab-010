//Create a class ForecastDisplay.java that **implements** Display.
public class ForecastDisplay implements Display{
    private WeatherStation ws;
    private float currentPressure = 0;
    private float lastPressure = 0;

    public ForecastDisplay(WeatherStation ws) {
        this.ws = ws;
    }

    //It's update method should keep track of the
    //last and current pressure in instance variables lastPressure and currentPressure
    public void update() {
        currentPressure = ws.getPressure();
        lastPressure = currentPressure;
        display();
    }

    //It's display method should use the following algorithm to provide a forecast
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }

    }
}

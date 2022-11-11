public class ForecastDisplay implements Display{
    private WeatherStation ws;
    private float currentPressure;
    private float lastPressure;

    public ForecastDisplay (WeatherStation ws) {
        this.ws = ws;
    }

    @Override
    public void update() {
        this.lastPressure = this.currentPressure;
        this.currentPressure = ws.getPressure();
        display();
    }

    @Override
    public void display() {

        System.out.println("The current pressure is: " + currentPressure);
        System.out.println("The last pressure is: " + lastPressure);
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

public class ForecastDisplay implements Display {
    WeatherStation ws;
    float currentPressure;
    float lastPressure;

    public ForecastDisplay(WeatherStation ws) {
        this.ws = ws;
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = ws.getPressure();
    }

    @Override
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

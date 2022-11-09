import java.util.PrimitiveIterator;

public class ForeCastDisplay implements Display{

private WeatherStation ws;
    private float currentPressure;
    private float lastPressure;
    public ForeCastDisplay(WeatherStation ws) {
        this.ws=ws;{

        }

    }

    @Override
    public void update() {
        this.currentPressure = ws.getPressure();
        this.lastPressure = ws.getPressure();
    }

    @Override
    public void display() {System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }

    }
}

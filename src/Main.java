import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WeatherStation ws = new WeatherStation();
        Display[] displays = {
                new CurrentConditions(ws),
                new StatisticsDisplay(ws),
                new ForecastDisplay(ws)
        };
        // Register displays
        Arrays.stream(displays).forEach(ws::registerDisplay);
        // Measure data and update displays
        int pollingPeriods = 3;
        for (int i = 0; i < pollingPeriods; i++) {
            System.out.printf("Grabbing data from weather station (%d/%d)...%n", i + 1, pollingPeriods);
            try {
                ws.measure();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (i + 1 < pollingPeriods) Thread.sleep(5000);
        }
        // Show displays
        Arrays.stream(displays).forEach(Display::display);

    }
}

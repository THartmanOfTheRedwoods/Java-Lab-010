import java.io.IOException;

public class MainWeather {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        Display[] displays = {
                new CurrentConditions(ws),
                new StatisticsDisplay(ws),
                new ForecastDisplay(ws),
        };
        try {
            ws.measure();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Display d: displays) {
            ws.registerDisplay(d);

        }
        ws.notifyDisplays();
    }
}
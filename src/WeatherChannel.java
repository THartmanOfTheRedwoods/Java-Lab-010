import java.io.IOException;

public class WeatherChannel {
    public static void main(String[] args) throws IOException {
        WeatherStation ws = new WeatherStation();
        Display[] displays = {
                new CurrentConditions(ws),
                new StatisticsDisplay(ws),
                new ForecastDisplay(ws)
        };
        for(Display d : displays) {
            ws.registerDisplay(d);
        }
        ws.measure();
    }
}

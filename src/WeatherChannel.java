/*
@author Bridget Acosta
11/9/2022
 */

import java.io.IOException;

public class WeatherChannel {
    public static void main(String[] args) throws IOException {
        WeatherStation ws = new WeatherStation();
        ws.measure();
        Display[] displays = {
                new CurrentConditions(ws),
                new StatisticsDisplay(ws),
                new ForecastDisplay(ws)

        };
        try {
            ws.measure();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Display d : displays){
           ws.registerDisplay(d); //d.update();
        }
        ws.notifyDisplays();
    }
}

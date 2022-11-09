import java.io.IOException;

public class MainWS {

    public static void main(String[] args) throws IOException {

        WeatherStation ws = new WeatherStation();
        ws.measure();

        Display[] displays = {
          new CurrentConditions(ws),
          new ForecastDisplay(ws),
          new StatisticsDisplay(ws)
        };

        for(Display d : displays){
            d.update();
        }
    }

}

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.lang.Thread;


public class Main {


    public static void main(String[] args) throws IOException, InterruptedException {
        WeatherStation wetha = new WeatherStation();
        Display[] allDisplays = {
                new CurrentConditions(wetha),
                new StatisticsDisplay(wetha),
                new ForecastDisplay(wetha),
        };

        for(int regDis = 0; regDis < allDisplays.length; regDis++){
            wetha.registerDisplay(allDisplays[regDis]);
        }
        for(int i = 0; i < 10; i++){
            wetha.measure();
            Thread.sleep(5000);
            System.out.println("\n----------------------------------------------");
        }

    }
}
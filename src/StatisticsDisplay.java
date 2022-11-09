public class StatisticsDisplay implements Display {
    WeatherStation ws;
    float temperatureMin;
    float temperatureMax;
    float temperatureTotal;
    int numReadings;

    public StatisticsDisplay(WeatherStation ws) {
        this.ws = ws;
        numReadings = 0;
    }

    @Override
    public void update() {
        float temp = ws.getTemperature();

        if (numReadings == 0) {
            temperatureMin = temp;
            temperatureMax = temp;
        } else {
            if (temp < temperatureMin) temperatureMin = temp;
            if (temp > temperatureMax) temperatureMax = temp;
        }

        temperatureTotal += temp;
        numReadings++;
    }

    @Override
    public void display() {
        System.out.printf("""
                Temperature Statistics:
                  Average Temperature: %.2f*f (%d reading%s)
                  Min Temperature: %.2f*f
                  Max Temperature: %.2f*f
                """, temperatureTotal / numReadings, numReadings, numReadings == 1 ? "" : "s", temperatureMin, temperatureMax);
    }
}

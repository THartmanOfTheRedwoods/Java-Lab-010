public class StatisticsDisplay implements Display{
    private WeatherStation WS;
    private float tempMin;
    private float tempMax;
    private float tempTotal;
    private int numReadings;
    public StatisticsDisplay(WeatherStation ws){
        this.WS = ws;
    }
    public void update(){
        float temp = WS.getTemperature();
        if (tempMin > temp){tempMin = temp;}
        if (tempMax < temp){tempMax = temp;}
        tempTotal += temp;
        numReadings ++;
        display();
    }
    public void display(){
        System.out.println("\nSD: \ntempMin: "+tempMin+"\ntempMax: "+tempMax+
                "\ntempTotal: "+tempTotal+ "\nnumReadings: "+numReadings);
    }
}

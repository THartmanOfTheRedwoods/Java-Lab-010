public class CurrentConditions implements Display{
    private WeatherStation WS;
    private float temperature;
    private float humidity;
    public CurrentConditions(WeatherStation ws){
        this.WS = ws;
    }
    public void update(){
        temperature = WS.getTemperature();
        humidity = WS.getHumidity();
        display();
    }
    public void display(){
        System.out.println("\nCC:\nTemperature: "+temperature+"\nHumidity: "+humidity);
    }
}

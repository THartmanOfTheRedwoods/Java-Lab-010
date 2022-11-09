public class ForecastDisplay implements Display{
    private WeatherStation WS;
    private float CurPres;
    private float LastPres;
    public ForecastDisplay(WeatherStation ws){
        this.WS = ws;
    }
    public void update(){
        LastPres = CurPres;
        CurPres = WS.getPressure();
        display();
    }
    public void display(){
        System.out.println("\nFD: \nLast Pressure: "+LastPres+"\nCurrent Pressure: "+CurPres);
    }
}

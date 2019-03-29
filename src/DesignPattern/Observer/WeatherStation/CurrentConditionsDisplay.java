package DesignPattern.Observer.WeatherStation;

public class CurrentConditionsDisplay implements Observer {

    private float temperature;
    private float humidity;
    private String time;

    @Override
    public void update(float temperature, float humidity, String time) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.time = time;

        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", time='" + time + '\'' +
                '}';
    }
}

package DesignPattern.Observer.WeatherStation;

public class Client {

    public static void main(String[] args) {
        WeatherStationSubject weatherStation = new WeatherStationSubject();

        Observer defaultScreen = new CurrentConditionsDisplay();
        Observer forecast = new ForecastDisplay();

        weatherStation.registerObserver(defaultScreen);
        weatherStation.registerObserver(forecast);

        for (int i = 0; i < 5; i++) {
            int randomValue1 = (int) (Math.random() * 5) + 20;
            int randomValue2 = (int) (Math.random() * 5) + 20;
            weatherStation.setValues(randomValue1, randomValue2);
            if(i < 4) {
                try {
                    Thread.sleep(3000);
                } catch (Exception ignored) {
                }
            }
        }
    }

}

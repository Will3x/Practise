package DesignPattern.Observer.WeatherStation;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class WeatherStationSubject implements Subject{

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private String timeStamp;

    WeatherStationSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        if (!observers.contains(o)) {
            if(observers.add(o))
                System.out.println(o.getClass().getSimpleName() + " added to the observer list.");
        } else {
            System.err.println(o.getClass().getSimpleName() + " is already an observer.");
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.remove(o))
            System.out.println(o.getClass().getSimpleName() + " removed successfully");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, timeStamp);
        }
    }

    void setValues(float temperature, float humidity){
        this.timeStamp = LocalDateTime.now().toLocalTime().toString();
        this.temperature = temperature;
        this.humidity = humidity;

        notifyObservers();
    }

}

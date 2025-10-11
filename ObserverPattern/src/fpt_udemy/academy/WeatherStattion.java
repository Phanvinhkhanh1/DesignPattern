package fpt_udemy.academy;

import java.util.ArrayList;
import java.util.List;

public class WeatherStattion implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    @Override
    public void subcribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubcribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObserver();
    }
}

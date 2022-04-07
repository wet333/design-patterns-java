package com.wetagustin.observer.observers;

import com.wetagustin.observer.subjects.WeatherData;

public class HumidityDisplay implements Observer, Display{

    private float humidity;
    private WeatherData subject;

    public HumidityDisplay(WeatherData weatherData) {
        weatherData.subscribeObserver(this);
        this.subject = weatherData;
    }

    @Override
    public void display() {
        System.out.println("humidity: " + this.humidity);
    }

    @Override
    public void update() {
        this.humidity = subject.getHumidity();
        display();
    }
}

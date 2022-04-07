package com.wetagustin.observer.observers;

import com.wetagustin.observer.subjects.WeatherData;

public class PressureDisplay implements Display, Observer {

    private float pressure;
    private WeatherData subject;

    public PressureDisplay(WeatherData weatherData) {
        weatherData.subscribeObserver(this);
        this.subject = weatherData;
    }

    @Override
    public void display() {
        System.out.println("pressure: " + this.pressure);
    }

    @Override
    public void update() {
        this.pressure = subject.getPressure();
        display();
    }
}

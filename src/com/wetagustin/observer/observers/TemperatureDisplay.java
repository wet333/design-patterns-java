package com.wetagustin.observer.observers;

import com.wetagustin.observer.subjects.WeatherData;

public class TemperatureDisplay implements Display, Observer {

    private float temperature;
    private WeatherData subject;

    public TemperatureDisplay(WeatherData weather) {
        weather.subscribeObserver(this);
        this.subject = weather;
    }

    @Override
    public void display() {
        System.out.println("temperature: " + this.temperature);
    }

    @Override
    public void update() {
        this.temperature = subject.getTemperature();
        display();
    }
}

package com.wetagustin.observer;

import com.wetagustin.observer.observers.*;
import com.wetagustin.observer.subjects.WeatherData;

public class WeatherDemo {
    public static void main(String[] args) {

        WeatherData weatherDataStation = new WeatherData();

        Observer display1 = new TemperatureDisplay(weatherDataStation);
        Observer display2 = new HumidityDisplay(weatherDataStation);
        Observer display3 = new PressureDisplay(weatherDataStation);
        Observer display4 = new HeatIndexDisplay(weatherDataStation);

        weatherDataStation.setMeasurements(22.34f,0.231f,898.7f);
        weatherDataStation.setMeasurements(24.7f,0.321f,980.7f);
        weatherDataStation.setMeasurements(23.87f,0.93f,1409.7f);
        weatherDataStation.setMeasurements(18.1f,0.19f,902.7f);

    }
}

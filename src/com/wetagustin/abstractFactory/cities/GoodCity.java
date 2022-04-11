package com.wetagustin.abstractFactory.cities;

import com.wetagustin.abstractFactory.types.CitySizes;
import com.wetagustin.abstractFactory.types.StatusTypes;

public class GoodCity extends City{

    public GoodCity(String name, CitySizes size) {
        this.name = name;
        this.status = StatusTypes.GOOD;
        this.population = this.calculatePopulation(size);
    }
}

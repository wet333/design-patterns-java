package com.wetagustin.abstractFactory.cities;

import com.wetagustin.abstractFactory.types.CitySizes;
import com.wetagustin.abstractFactory.types.StatusTypes;

public class EvilCity extends City{

    public EvilCity(String name, CitySizes size) {
        this.name = name;
        this.status = StatusTypes.EVIL;
        this.population = this.calculatePopulation(size);
    }
}

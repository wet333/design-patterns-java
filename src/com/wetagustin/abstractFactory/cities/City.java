package com.wetagustin.abstractFactory.cities;

import com.wetagustin.abstractFactory.helpers.RandomInRange;
import com.wetagustin.abstractFactory.types.CitySizes;
import com.wetagustin.abstractFactory.types.StatusTypes;

public abstract class City {

    protected int population;
    protected String name;
    protected StatusTypes status;

    public void getInfo() {
        System.out.println("The " + this.status + " city of " + this.name + ", home of " + this.population + " people");
    }

    protected int calculatePopulation(CitySizes size) {
        switch (size){
            case TINY:
                return RandomInRange.getRandomInt(1000,10);

            case SMALL:
                return RandomInRange.getRandomInt(5000, 1001);

            case MEDIUM:
                return RandomInRange.getRandomInt(100000, 5001);

            case BIG:
                return RandomInRange.getRandomInt(10000000, 100001);

            case GIGANT:
                return RandomInRange.getRandomInt(999999999, 10000001);

            default:
                return RandomInRange.getRandomInt(999999999, 10);
        }
    }
}

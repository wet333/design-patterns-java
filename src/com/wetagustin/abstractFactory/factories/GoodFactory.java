package com.wetagustin.abstractFactory.factories;

import com.wetagustin.abstractFactory.characters.Character;
import com.wetagustin.abstractFactory.characters.GoodCharacter;
import com.wetagustin.abstractFactory.cities.City;
import com.wetagustin.abstractFactory.cities.GoodCity;
import com.wetagustin.abstractFactory.types.CitySizes;

public class GoodFactory implements AbstractFactory {

    public Character createCharacter(String name, String surname) {
        return new GoodCharacter(name, surname);
    }

    @Override
    public City createCity(String name, CitySizes size) {
        return new GoodCity(name, size);
    }
}

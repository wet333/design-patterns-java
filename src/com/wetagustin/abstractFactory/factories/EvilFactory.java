package com.wetagustin.abstractFactory.factories;

import com.wetagustin.abstractFactory.characters.Character;
import com.wetagustin.abstractFactory.characters.EvilCharacter;
import com.wetagustin.abstractFactory.cities.City;
import com.wetagustin.abstractFactory.cities.EvilCity;
import com.wetagustin.abstractFactory.types.CitySizes;

public class EvilFactory implements AbstractFactory{
    @Override
    public Character createCharacter(String name, String surname) {
        return new EvilCharacter(name, surname);
    }

    @Override
    public City createCity(String name, CitySizes size) {
        return new EvilCity(name, size);
    }
}

package com.wetagustin.abstractFactory.factories;

import com.wetagustin.abstractFactory.characters.Character;
import com.wetagustin.abstractFactory.cities.City;
import com.wetagustin.abstractFactory.types.CitySizes;

public interface AbstractFactory {

    Character createCharacter(String name, String surname);
    City createCity(String name, CitySizes size);
}

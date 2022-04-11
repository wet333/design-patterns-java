package com.wetagustin.abstractFactory;

import com.wetagustin.abstractFactory.characters.Character;
import com.wetagustin.abstractFactory.cities.City;
import com.wetagustin.abstractFactory.factories.AbstractFactory;
import com.wetagustin.abstractFactory.factories.EvilFactory;
import com.wetagustin.abstractFactory.factories.GoodFactory;
import com.wetagustin.abstractFactory.types.CitySizes;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        AbstractFactory goodFactory = new GoodFactory();
        AbstractFactory evilFactory = new EvilFactory();

        Character sirLancelot = goodFactory.createCharacter("Alexander", "Lancelot");
        Character badGuy1 = evilFactory.createCharacter("Bill", "Thomson");
        Character badGuy2 = evilFactory.createCharacter("Scott", "Thomson");
        Character badGuy3 = evilFactory.createCharacter("Roman", "Anderson");

        City camelot = goodFactory.createCity("Camelot", CitySizes.BIG);
        City mordor = evilFactory.createCity("Mordor", CitySizes.GIGANT);

        camelot.getInfo();
        mordor.getInfo();

        sirLancelot.charData();
        badGuy1.charData();
        badGuy2.charData();
        badGuy3.charData();
    }
}

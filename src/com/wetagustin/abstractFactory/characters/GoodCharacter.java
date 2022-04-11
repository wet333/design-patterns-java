package com.wetagustin.abstractFactory.characters;

import com.wetagustin.abstractFactory.types.StatusTypes;

public class GoodCharacter extends Character{

    public GoodCharacter(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.status = StatusTypes.GOOD;
    }
}

package com.wetagustin.abstractFactory.characters;

import com.wetagustin.abstractFactory.types.StatusTypes;

public class EvilCharacter extends Character{

    public EvilCharacter(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.status = StatusTypes.EVIL;
    }
}

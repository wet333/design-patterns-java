package com.wetagustin.abstractFactory.characters;

import com.wetagustin.abstractFactory.types.StatusTypes;

public abstract class Character {

    protected String name;
    protected String surname;
    protected StatusTypes status;

    public void charData() {
        System.out.println("Name: " + this.name + " " + this.surname + ", status: " + this.status);
    }

}

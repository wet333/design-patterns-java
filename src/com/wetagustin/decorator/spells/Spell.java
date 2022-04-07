package com.wetagustin.decorator.spells;

public abstract class Spell {

    public String spellName;

    public String getSpellName() {
        return this.spellName;
    }

    public abstract int damage();
    public abstract int manaCost();

}

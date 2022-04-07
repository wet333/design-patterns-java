package com.wetagustin.decorator.spells;

public class SpellFireBall extends Spell{

    public SpellFireBall() {
        this.spellName = "Fireball";
    }

    @Override
    public int damage() {
        return 35;
    }

    @Override
    public int manaCost() {
        return 10;
    }
}

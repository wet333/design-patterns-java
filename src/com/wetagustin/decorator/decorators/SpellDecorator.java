package com.wetagustin.decorator.decorators;

import com.wetagustin.decorator.spells.Spell;

public abstract class SpellDecorator extends Spell {

    public Spell decorated;

    public abstract int damage();
    public abstract int manaCost();

}

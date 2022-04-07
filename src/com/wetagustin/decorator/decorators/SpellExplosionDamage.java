package com.wetagustin.decorator.decorators;

import com.wetagustin.decorator.spells.Spell;

public class SpellExplosionDamage extends SpellDecorator{

    public SpellExplosionDamage(Spell spell) {
        this.decorated = spell;
        this.spellName = "Explosive" + spell.getSpellName();
    }

    @Override
    public int damage() {
        return this.decorated.damage() + 50;
    }

    @Override
    public int manaCost() {
        return this.decorated.manaCost() + 25;
    }
}

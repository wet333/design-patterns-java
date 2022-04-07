package com.wetagustin.decorator.decorators;

import com.wetagustin.decorator.spells.Spell;

public class SpellBurnDamage extends SpellDecorator {

    public SpellBurnDamage(Spell spell) {
        this.decorated = spell;
        this.spellName = "Burning" + spell.getSpellName();
    }

    @Override
    public int damage() {
        return this.decorated.damage() + 5;
    }

    @Override
    public int manaCost() {
        return this.decorated.manaCost() + 2;
    }
}

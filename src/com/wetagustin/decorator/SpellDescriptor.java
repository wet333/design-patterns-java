package com.wetagustin.decorator;

import com.wetagustin.decorator.spells.Spell;

public class SpellDescriptor {

    public static void describe(Spell spell) {
        System.out.println(spell.getSpellName() + " ==> dmg: " + spell.damage() + ", cost: " + spell.manaCost());
    }

}

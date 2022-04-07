package com.wetagustin.decorator;

import com.wetagustin.decorator.decorators.SpellBurnDamage;
import com.wetagustin.decorator.decorators.SpellExplosionDamage;
import com.wetagustin.decorator.spells.Spell;
import com.wetagustin.decorator.spells.SpellFireBall;

public class DecoratorDemo {
    public static void main(String[] args) {

        Spell fireball = new SpellFireBall();
        Spell explosive = new SpellExplosionDamage(new SpellFireBall());
        Spell burn = new SpellBurnDamage(new SpellFireBall());
        Spell ultimate = new SpellExplosionDamage(new SpellBurnDamage(new SpellFireBall()));

        SpellDescriptor.describe(fireball);
        SpellDescriptor.describe(explosive);
        SpellDescriptor.describe(burn);
        SpellDescriptor.describe(ultimate);
    }
}

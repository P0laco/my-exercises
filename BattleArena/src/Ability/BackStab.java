package Ability;

import Hero.Hero;

public class BackStab extends AbstractAbility {

    public BackStab() {
        super();
        dealingDamage();
    }

    private int dealingDamage() {
        return Hero.baseDamage * 2;
    }

}

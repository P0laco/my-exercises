package Ability;

import Hero.Hero;

public class FireBall extends AbstractAbility {

    public FireBall() {
        super();
        dealingDamage();
    }

    private int dealingDamage() {
        return Hero.baseDamage + 15;
    }
}

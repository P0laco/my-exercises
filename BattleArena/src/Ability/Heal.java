package Ability;

import Hero.Hero;

public class Heal extends AbstractAbility {

    public Heal() {
        super();
        healing();
    }

    private int healing() {
        return Hero.HP + 20;
    }
}

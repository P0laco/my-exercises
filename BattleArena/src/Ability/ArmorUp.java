package Ability;

import Hero.Hero;
import Hero.Warrior;

public class ArmorUp extends AbstractAbility {

    public ArmorUp() {
        super();
        increaseDefense();
    }

    private int increaseDefense() {
        return Hero.DEF + 20;
    }
}

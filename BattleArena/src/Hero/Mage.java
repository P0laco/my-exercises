package Hero;

import Ability.FireBall;

public class Mage extends Hero{

    public Mage(int HP, int MP, int DEF, int baseDamage, String name) {
        super(HP, MP, DEF, baseDamage, name);
    }

    @Override
    public void usingAbility() {
        new FireBall();
    }
}

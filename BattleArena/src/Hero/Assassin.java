package Hero;

import Ability.BackStab;

public class Assassin extends Hero {

    public Assassin (int HP, int MP, int DEF,int baseDamage, String name) {
        super(HP, MP, DEF, baseDamage, name);

    }

    @Override
    public void usingAbility() {
        new BackStab();
    }
}

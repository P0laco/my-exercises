package Hero;

import Ability.ArmorUp;

public class Warrior extends Hero {

    public Warrior(int HP, int MP, int DEF, int baseDamage, String name) {
        super(HP, MP, DEF, baseDamage, name);
    }

    @Override
    public void usingAbility() {
        new ArmorUp();
    }
}

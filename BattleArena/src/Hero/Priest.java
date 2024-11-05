package Hero;

import Ability.Heal;

public class Priest extends Hero{

    public Priest(int HP, int MP, int DEF, int baseDamage, String name) {
        super(HP, MP, DEF, baseDamage, name);
    }

    @Override
    public void usingAbility() {
        new Heal();
    }
}

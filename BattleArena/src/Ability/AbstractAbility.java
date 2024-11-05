package Ability;

public abstract class AbstractAbility {

    private int manaSpent;
    private int cooldown;

    public AbstractAbility() {
        this.manaSpent = 50;
        this.cooldown = 3;
    }
}

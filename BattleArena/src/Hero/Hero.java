package Hero;

import Ability.Ability;

public abstract class Hero implements Ability {

    public static int baseDamage;
    public static int HP;
    public static int MP;
    public static int DEF;
    public String name;

    public Hero(int HP, int MP, int DEF, int baseDamage, String name) {
        this.HP = HP;
        this.MP = MP;
        this.DEF = DEF;
        this.baseDamage = baseDamage;
        this.name = name;
    }

    public int basicAttack(){
        return baseDamage;
    }

    public int takeDamage(int damage){
        int damageTaken = Math.max(damage - DEF, 0);
        HP -= damageTaken;
        return HP;
    }

    public boolean isAlive(){
        return HP > 0;
    }

    public int getHP(){
        return HP;
    }

    public int getDEF(){
        return DEF;
    }

}

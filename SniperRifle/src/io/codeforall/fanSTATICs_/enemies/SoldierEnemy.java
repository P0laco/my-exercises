package io.codeforall.fanSTATICs_.enemies;

import io.codeforall.fanSTATICs_.enemies.Enemy;

public class SoldierEnemy extends Enemy {

    private String message;

    public SoldierEnemy(String message){
        this.message = message;
        super.armor = 0;
    }

    @Override
    public String getMessage(){
        return message;
    }
    @Override
    public String toString() {
        return "Soldier Enemy";
    }
}

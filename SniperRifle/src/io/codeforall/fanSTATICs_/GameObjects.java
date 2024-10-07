package io.codeforall.fanSTATICs_;

import io.codeforall.fanSTATICs_.enemies.ArmouredEnemy;
import io.codeforall.fanSTATICs_.enemies.Enemy;
import io.codeforall.fanSTATICs_.enemies.SoldierEnemy;

public abstract class GameObjects {
    private String gameMessage;
    public int armor;
    public int health;
    public GameObjects() {
        this.gameMessage = "Message";
    }

    public abstract String getMessage();

    public static GameObjects typeCreated() {
        double enemyOrTree = Math.random();
        if (enemyOrTree < 0.8) {
            //return soldierEnemy or ArmouredEnemy;
            double eachEnemy = Math.random();
            if (eachEnemy < 0.5) {
                return new ArmouredEnemy("Armoured Enemy created");
            }
            return new SoldierEnemy("Soldier Enemy created");
        }
        return new Tree("created tree");
    }
}
